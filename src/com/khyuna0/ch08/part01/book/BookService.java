package com.khyuna0.ch08.part01.book;

import java.util.List;

public interface BookService {
	
	public void addBook(Book book); //책 한권의 정보를 입력하는 메소드
	public Book findBookByTitle(String title); // 책 제목을 입력하면 해당 책 정보를 돌려주는 메소드
	public List<Book> getAllBooks(); //모든 책정보를 묶은 모든 책정보 목록 반환 메소드
}
