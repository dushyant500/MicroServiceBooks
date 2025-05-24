package com.issuer.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	private int isbn;
	private String title;
	private Date publishedDate;
	private int totalCopies;
	private int issuedCopies;
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
	private String author;
	
}
