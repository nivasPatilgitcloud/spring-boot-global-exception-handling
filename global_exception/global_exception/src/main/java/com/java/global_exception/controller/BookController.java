package com.java.global_exception.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.global_exception.entity.Book;
import com.java.global_exception.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book) {
		return this.bookservice.saveBook(book);
	}

	@GetMapping("/getbook/{bookid}")
	public Book getBook(@PathVariable("bookid") long bookid) {
		return bookservice.getSingleBook(bookid);
	}
	
	@DeleteMapping("/deletebook/{bookid}")
	public void deleteBook(@PathVariable("bookid") long bookid) {
		this.bookservice.deleteBook(bookid);
	}
	
	@GetMapping("/all")
	public List<Book> getAllBooks(){
		return this.bookservice.fetchAllBooks();
	}
}
