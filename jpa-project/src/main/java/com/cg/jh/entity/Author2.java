package com.cg.jh.entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "authors")
public class Author2 implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "author_id")
	private Long authorId;
	
	@Column(name = "author_name")
	private String name;
	
	@OneToOne (cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn (name = "book_isbn")
	private Book book;
	
	public Author2() {
	
		
	}

	public Author2(Long authorId, String name, Book book) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.book = book;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author2 [authorId=" + authorId + ", name=" + name + ", book=" + book + "]";
	}
	
}