package com.khyuna0.ch08.part01.book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService {
	
	private List<Book> books = new ArrayList<Book>();
	// <List> -> 컬렉션. 객체들의 목록
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book); // book 객체를 비어있는 리스트에 순서대로 넣어주는 메소드

	}

	@Override
	public Book findBookByTitle(String title) {
		// TODO Auto-generated method stub
		for(Book bookTemp:books) {			
			if(bookTemp.getTitle().equals(title)) { 
				return bookTemp;
			}
			// 찾고자 하는 책 제목과 일치하는 책을 찾은 경우는 그 책 객체를 반환
		}
		return null; //책 제목이 일치하는 책을 못찾은 경우 null 반환
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return books;
	}

}
