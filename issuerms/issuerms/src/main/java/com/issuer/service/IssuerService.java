package com.issuer.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.issuer.model.Book;
import com.issuer.model.BookDetailsMO;
import com.issuer.model.IssuerMO;
import com.issuer.model.IssuerMoCompositeKey;
import com.issuer.repositry.IssuerRepositry;



@Service
public class IssuerService {

	@Autowired
	private IssuerRepositry repository;
	
	@Autowired
	private RestTemplate template;
	
	public BookDetailsMO getBookDetailsById(int isbn) {
		
		String response;
		BookDetailsMO bdetail = new BookDetailsMO(); 
		
		Book result = template.getForObject("http://bookms/book-lib/book/{isbn}",Book.class,isbn);
		int avl = result.getTotalCopies()-result.getIssuedCopies();
		bdetail.setBook(result);
		bdetail.setAvailablecopies(avl);
		
		
		return bdetail;
	}

	public IssuerMO updateIssuerRecord(IssuerMO issuer) {
		// TODO Auto-generated method stub
		//below code if same customer is issuing same book
		int reqbooks = issuer.getNoOfCopies();
		IssuerMoCompositeKey compositeKey = new IssuerMoCompositeKey();
	    compositeKey.setCustId(issuer.getCustId());
	    compositeKey.setIsbn(issuer.getIsbn());
		Optional<IssuerMO> issuerMo = repository.findById(compositeKey);
		int alreadyissued=0;
		if(issuerMo.isPresent()) {
			alreadyissued = issuerMo.get().getNoOfCopies();
			issuer.setNoOfCopies(alreadyissued+issuer.getNoOfCopies());
		}
		

		BookDetailsMO bookdetails = getBookDetailsById(issuer.getIsbn());
		Book book = getBookDetailsById(issuer.getIsbn()).getBook();
		if(bookdetails.getAvailablecopies()>0 && reqbooks<=bookdetails.getAvailablecopies()) {
			book.setIssuedCopies(book.getIssuedCopies()+reqbooks);
			int bookId = template.postForObject("http://bookms/book-lib/book",book,int.class);			
		    
			if(bookId == issuer.getIsbn()) {//requested book is updated 
			    
				repository.save(issuer);
			    return issuer;
		    }
		}
		
return null;
		}

}
