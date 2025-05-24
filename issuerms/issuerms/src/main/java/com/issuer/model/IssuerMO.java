package com.issuer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@IdClass(IssuerMoCompositeKey.class)
public class IssuerMO {
	
	//defining isbn as column name
	@Id
	@Column
	private int isbn;
	
	@Id
	@Column
	private int custId;
	
	@Column
	private int noOfCopies;
	
	/**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
	}

	/**
	 * @return the noOfCopies
	 */
	public int getNoOfCopies() {
		return noOfCopies;
	}

	/**
	 * @param noOfCopies the noOfCopies to set
	 */
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

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
}
