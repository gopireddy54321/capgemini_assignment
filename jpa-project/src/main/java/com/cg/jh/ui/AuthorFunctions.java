package com.cg.jh.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh.entity.Author;
import com.cg.jh.util.JPAUtil;

public class AuthorFunctions {

	public static void main(String[] args) {
		
		Long authorId;
		EntityManager em = JPAUtil.getEntityManager();
		Scanner s = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("Choose one of the following operations to perform:\n");
			System.out.println("1. Insert rows into table");
			System.out.println("2. Update row");
			System.out.println("3. Delete row");
			System.out.println("4. Display particular details");
			System.out.println("5. Exit\n");
			
			choice = s.nextInt();
			
			loop:
				if(choice < 0 || choice > 5) {
					
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
						System.out.println("Enter the author's first name: ");
						String firstName = s.next();
						System.out.println("Enter the author's middle name: ");
						String middleName = s.next();
						System.out.println("Enter the author's last name: ");
						String lastName = s.next();
						
						Author a = new Author(authorId, firstName, middleName, lastName);
						
						insert.begin();
						em.persist(a);
						insert.commit();
						
					}
					
					break;
				
				case 2:
					
					EntityTransaction update = em.getTransaction();
					System.out.println("Enter the author id that you want to update: ");
					authorId = s.nextLong();
					
					System.out.println("Updating author with ID: " + authorId);
					
					System.out.println("Enter the author's first name: ");
					String firstName = s.next();
					System.out.println("Enter the author's middle name: ");
					String middleName = s.next();
					System.out.println("Enter the author's last name: ");
					String lastName = s.next();
					
					Author a = em.find(Author.class, authorId);
					a.setFirstName(firstName);
					a.setMiddleName(middleName);
					a.setLastName(lastName);
					
					update.begin();
					em.merge(a);
					update.commit();
					
					System.out.println("The author with id: " + authorId + " has been updated");
					break;
					
				case 3:
					
					EntityTransaction delete = em.getTransaction();
					System.out.println("Enter the author id that you want to delete: ");
					authorId = s.nextLong();
					
					Author a1 = em.find(Author.class, authorId);
					
					if(a1 != null) {
						
						delete.begin();
						em.remove(a1);
						delete.commit();
						System.out.println("The author with id " + authorId + " has been deleted");
						
					} else {
						
						System.out.println("Author with id " + authorId + " doesn't exist");
						
					}
					break;
					
				case 4:
					
					System.out.println("Enter the id of the author you want to find: ");
					authorId = s.nextLong();
					
					Author find = em.find(Author.class, authorId);
					
					if(find != null) {
						
						System.out.println(find);
						
					} else {
						
						System.out.println("Author with id " + authorId + " does not exist");
						
					}
					break;
			
			}

		}while(choice != 5);
		
		System.out.println("Successfully exited!");
		JPAUtil.shutdown();
		s.close();

	}
}