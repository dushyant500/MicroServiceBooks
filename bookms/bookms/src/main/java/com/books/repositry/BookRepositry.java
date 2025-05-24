package com.books.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.books.model.Book;
@Repository
public interface BookRepositry extends JpaRepository<Book,Integer>{

}
