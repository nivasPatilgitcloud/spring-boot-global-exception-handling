package com.java.global_exception.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookid;
	private String bookname;
	private String bookauthor;
	private String booktype;
	private int bookpages;
	private int bookprice;
	
	public Book(long bookid, String bookname, String bookauthor, String booktype, int bookpages, int bookprice) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.booktype = booktype;
		this.bookpages = bookpages;
		this.bookprice = bookprice;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getBookid() {
		return bookid;
	}

	public void setBookid(long bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}
	
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public String getBookauthor() {
		return bookauthor;
	}

	public String getBooktype() {
		return booktype;
	}

	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public int getBookpages() {
		return bookpages;
	}

	public void setBookpages(int bookpages) {
		this.bookpages = bookpages;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", booktype="
				+ booktype + ", bookpages=" + bookpages + ", bookprice=" + bookprice + "]";
	}
}
