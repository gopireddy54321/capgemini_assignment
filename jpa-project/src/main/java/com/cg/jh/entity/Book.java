package com.cg.jh.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "book_isbn")
	private Long isbn;
	
	@Column(name = "book_title")
	private String title;
	
	@Column(name = "book_price")
	private Double price;
	
	@OneToOne(mappedBy = "book")
	private Author2 author;
	
	public Book() {
		
		//No implementation/
		
	}

	public Book(Long isbn, String title, Double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public Long getIsbn() {
		return isbn;
	}

	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Author2 getAuthor() {
		return author;
	}

	public void setAuthor(Author2 author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
}