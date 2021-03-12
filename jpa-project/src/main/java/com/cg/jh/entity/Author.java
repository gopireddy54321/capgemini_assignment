package com.cg.jh.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author_details")
public class Author implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "author_id")
	private Long authorId;
	
	@Column(name = "author_fname")
	private String firstName;
	
	@Column(name = "author_mname")
	private String middleName;
	
	@Column(name = "author_lname")
	private String lastName;
	
	public Author() {
		
		//No implementation/
		
	}

	public Author(Long authorId, String firstName, String middleName, String lastName) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + "]";
	}

}