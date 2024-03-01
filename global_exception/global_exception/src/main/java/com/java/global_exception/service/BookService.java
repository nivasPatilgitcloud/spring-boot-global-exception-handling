package com.java.global_exception.service;

import java.util.List;

import com.java.global_exception.entity.Book;

public interface BookService {

	public Book getSingleBook(long bookid);
	
	public List<Book> fetchAllBooks();
	
	public void deleteBook(long bookid);
	
	public Book updateBook(long bookid, Book book);
	
	public Book saveBook(Book book);
}
