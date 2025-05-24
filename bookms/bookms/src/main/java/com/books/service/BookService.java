package com.books.service;

import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.model.Book;

import com.books.repositry.BookRepositry;

@Service
public class BookService {
	
	@Autowired
	BookRepositry bookRepositry;

	public List<Book> getAllBook() {
		List<Book> books = new ArrayList<Book>();
		bookRepositry.findAll().forEach(book -> books.add(book));
		return books;
	}

	public Book getBookById(int isbn) {
		return bookRepositry.findById(isbn).get();
	}

	public void saveOrUpdate(Book book) {
		// TODO Auto-generated method stub
		bookRepositry.save(book);
	}

	public int deleteRecord(int isbn) {
		bookRepositry.deleteById(isbn);
		return isbn;
	}

}
