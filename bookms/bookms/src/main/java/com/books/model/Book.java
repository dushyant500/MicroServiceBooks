package com.books.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
	@Id
	//defining isbn as column name
	@Column
	private int isbn;
	
	//defining title as column name
	@Column
	private String title;
	
	//defining publishedDate as column name
	@Column
	private Date publishedDate;
	
	//defining totalCopies as column name
	@Column
	private int totalCopies;
	
	//defining issuedCopies as column name
	@Column
	private int issuedCopies;


	//defining author as column name
	@Column
	private String author;
	/**
	 * @return the isbn
	 */
	public int getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the publishedDate
	 */
	public Date getPublishedDate() {
		return publishedDate;
	}

	/**
	 * @param publishedDate the publishedDate to set
	 */
	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	/**
	 * @return the totalCopies
	 */
	public int getTotalCopies() {
		return totalCopies;
	}

	/**
	 * @param totalCopies the totalCopies to set
	 */
	public void setTotalCopies(int totalCopies) {
		this.totalCopies = totalCopies;
	}

	/**
	 * @return the issuedCopies
	 */
	public int getIssuedCopies() {
		return issuedCopies;
	}

	/**
	 * @param issuedCopies the issuedCopies to set
	 */
	public void setIssuedCopies(int issuedCopies) {
		this.issuedCopies = issuedCopies;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	
}
