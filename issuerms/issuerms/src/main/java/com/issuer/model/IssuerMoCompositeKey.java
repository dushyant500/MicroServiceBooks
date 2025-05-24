package com.issuer.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class IssuerMoCompositeKey implements Serializable {

    private int isbn;
	private int custId;
	
	
	
	public int getIsbn() {
		return isbn;
	}



	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}



	public int getCustId() {
		return custId;
	}



	public void setCustId(int custId) {
		this.custId = custId;
	}

	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        IssuerMoCompositeKey issuerId = (IssuerMoCompositeKey) o;
	        return Objects.equals(custId, issuerId.custId) &&
	               Objects.equals(isbn, issuerId.isbn);
	    }

	@Override
    public int hashCode() {
        return Objects.hash(custId, isbn);
    }
	
}
