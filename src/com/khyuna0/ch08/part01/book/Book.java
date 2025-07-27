package com.khyuna0.ch08.part01.book;

public class Book { //책 1권의 정보를 저장할 객체 -> DTO class, VO class
	
	private int id; //책 id
	private String title; //책 제목
	private String author; //책 저자
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String bookInfo() {
		String bookInfo = "[" + id + "] " + title + " by " + author;
		return bookInfo;
	}
	
}
