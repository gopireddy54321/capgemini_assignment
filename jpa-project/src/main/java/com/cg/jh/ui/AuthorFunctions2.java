package com.cg.jh.ui;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.jh.entity.Author2;
import com.cg.jh.entity.Book;
import com.cg.jh.util.JPAUtil;

public class AuthorFunctions2 {

	public static void main(String[] args) {
		Long authorId;
		EntityManager em = JPAUtil.getEntityManager();
		Scanner s = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("Choose one of the following operations to perform:\n");
			System.out.println("1. Insert rows into author table");
			System.out.println("2. View all books");
			System.out.println("3. View all books specific to author");
			System.out.println("4. View books priced b/w 500 to 1000");
			System.out.println("5. View author of particular book");
			System.out.println("6. Exit\n");
			
			choice = s.nextInt();
			
			loop:
				if(choice < 0 || choice > 6) {
					
					System.out.println("Please enter a valid choice");
					break loop;
				}
			
			switch(choice) {
			
				case 1:
					
					EntityTransaction insert = em.getTransaction();
					System.out.println("Enter the number of authors you want to enter: ");
					int count = s.nextInt();
					
					for(int i = 0; i < count; i++) {
						
						System.out.println("Enter the author Id: ");
						authorId = s.nextLong();
						System.out.println("Enter the author's name: ");
						String name = s.next();
						System.out.println("Enter book isbn: ");
						Long isbn = s.nextLong();
						System.out.println("Enter book title: ");
						String title = s.next();
						System.out.println("Enter book price: ");
						Double price = s.nextDouble();
						
						Book b = new Book(isbn, title, price);
						Author2 a = new Author2(authorId, name,b);
						
						insert.begin();
						em.persist(a);
						em.persist(b);
						insert.commit();
						
					}
					
					break;
					
				case 2:
					
					String selectAll = "SELECT b FROM Book b";
					
					TypedQuery <Book> tq = em.createQuery(selectAll,Book.class);
					List <Book> booksAll = tq.getResultList();
					
					if(booksAll.isEmpty()) {
						
						System.out.println("No books to list");
						
					} else {
						
						booksAll.forEach(System.out::println);
						
					}
					
					break;
					
				case 3:
					
					System.out.println("Enter the author id: ");
					authorId = s.nextLong();
					
					Author2 a2 = em.find(Author2.class, authorId);
					
					System.out.println(a2.getBook());
					
					break;
					
				case 4:
					
					String price = "SELECT b FROM Book b WHERE b.price between 500.0 and 1000.0";
					TypedQuery <Book> p = em.createQuery(price,Book.class);
					List <Book> booksP = p.getResultList();
					
					if(booksP.isEmpty()) {
						
						System.out.println("No books to list");
						
					} else {
						
						booksP.forEach(System.out::println);
						
					}
					
					break;
					
				case 5:
					
					System.out.println("Enter the book isbn: ");
					Long isbn = s.nextLong();
					
					Book check = em.find(Book.class, isbn);
					
					System.out.println("The author is: " + check.getAuthor().getName());
					
					break;
			
			}

		}while(choice != 6);
		
		System.out.println("Successfully exited!");
		JPAUtil.shutdown();
		s.close();

	}
}