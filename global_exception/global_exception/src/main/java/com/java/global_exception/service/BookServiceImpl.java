package com.java.global_exception.service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.global_exception.entity.Book;
import com.java.global_exception.exception.BookNotFoundException;
import com.java.global_exception.exception.RecordEmptyException;
import com.java.global_exception.exception.ResourceNotFoundException;
import com.java.global_exception.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public Book getSingleBook(long bookid) {		
		return bookRepo.findById(bookid).orElseThrow(()-> new ResourceNotFoundException("Book not found with id : "+bookid));
	}

	@Override
	public List<Book> fetchAllBooks() {	
		long count = bookRepo.count();
		if(count==0) {
			throw new RecordEmptyException("Records not preset till now : "+LocalDateTime.now());
		}else {
			return bookRepo.findAll();
		}
	}

	@Override
	public Book updateBook(long bookid, Book book) {
		 
		return null;
	}

	@Override
	public Book saveBook(Book book) {
		return bookRepo.save(book);
	}

	@Override
	public void deleteBook(long bookid) {
		bookRepo.findById(bookid).orElseThrow(()-> new BookNotFoundException("Book with id : "+bookid+" not found"));
		bookRepo.deleteById(bookid);
	}
}
