package com.issuer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issuer.model.BookDetailsMO;
import com.issuer.model.IssuerMO;
import com.issuer.service.IssuerService;



@RestController
@RequestMapping("/issuer")
public class IssuerMSController {

	@Autowired(required = true)
	IssuerService issueService;
	
	@GetMapping("/bookDetails/{isbn}")
	private BookDetailsMO getBookDetails(@PathVariable("isbn") int id) 
	{
		return issueService.getBookDetailsById(id);
	}
	
	@PostMapping("/issueBook")
	private IssuerMO issueBook(@RequestBody IssuerMO issuer) 
	{
		return issueService.updateIssuerRecord(issuer);
		
	}

}
