/**
 * 
 */
package com.books.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.books.model.Book;
import com.books.service.BookService;



/**
 * 
 */
@RestController
@RequestMapping("/book-lib")
public class BookMSController {
	
	@Autowired(required = true)
	BookService bookService;
        // GET HTTP Method
		// http://localhost:8080/fetch-book
		@GetMapping("/testing")
		public String fetchtext() 
		{
			return "Amazing Book Application is Up";
		}

		@GetMapping("/books")
		private List<Book> getAllBook() 
		{
			return bookService.getAllBook();
		}
		
		@GetMapping("/book/{isbn}")
		private Book getBook(@PathVariable("isbn") int id) 
		{
			return bookService.getBookById(id);
		}
		
		@PostMapping("/book")
		private int saveCourse(@RequestBody Book book) 
		{
			bookService.saveOrUpdate(book);
			return book.getIsbn();
		}
		
		@PostMapping("/delete-book/{isbn}")
		private int delete(@PathVariable("isbn") int id) {
			return bookService.deleteRecord(id);
		}

}


