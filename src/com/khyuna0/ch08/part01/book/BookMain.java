package com.khyuna0.ch08.part01.book;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// [인터페이스 개념 포인트 1]
		// BookService는 인터페이스고, BookServiceImpl은 그 구현 클래스.
		// 인터페이스 타입(왼쪽)으로 선언하고, 구현체(new BookServiceImpl())를 연결하는 것이 "업캐스팅"
		// → 이렇게 하면 유지보수가 유리함 (다른 구현체로 교체 가능)
		BookService bookService = new BookServiceImpl();

		// 사용자 입력을 받을 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("");
			System.out.println("=== 도서관리 시스템 ===");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 목록 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 프로그램 종료");
			System.out.println("====================");
			System.out.print("메뉴 선택 : ");
			
			// 메뉴 번호 입력 받기
			int choiceNum = scanner.nextInt();
			System.out.println("====================");

			switch (choiceNum) {
				case 1:
					// 도서 정보 입력
					System.out.print("도서 ID : ");
					int bookId = scanner.nextInt();
					scanner.nextLine(); // 개행 문자 제거 (nextInt 이후 nextLine 입력 대비)
					
					System.out.print("도서 제목 : ");
					String bookTitle = scanner.nextLine();

					System.out.print("도서 저자 : ");
					String bookAuthor = scanner.nextLine();

					// Book 객체 생성 (DTO 또는 VO로 사용됨)
					Book book = new Book(bookId, bookTitle, bookAuthor);

					// [인터페이스 개념 포인트 2]
					// bookService는 BookService 인터페이스 타입이지만,
					// 실제 동작은 BookServiceImpl 클래스에 정의된 addBook() 메소드가 실행됨
					// → 인터페이스 기반 다형성
					bookService.addBook(book);

					System.out.print("입력하신 도서가 추가되었습니다.");
					break;

				case 2:
					System.out.println("***** 도서 목록 *****");

					// [인터페이스 개념 포인트 3]
					// 인터페이스에 정의된 getAllBooks()는 구현체에서 오버라이딩하여 구현됨
					// 실제 로직은 BookServiceImpl의 getAllBooks()에서 처리함
					for (Book bookTemp : bookService.getAllBooks()) {
						System.out.println(bookTemp.getTitle() + " / " + bookTemp.getAuthor());
					}
					break;

				case 3:
					// 도서 검색 기능은 아직 미구현
					break;

				case 4:
					System.out.print("도서 관리 프로그램을 종료합니다!");
					scanner.close();
					// 종료 조건이 빠져있어서 무한 반복 → 실제 종료되지는 않음
					// System.exit(0); 또는 루프 탈출 로직 필요
					break;

				default:
					System.out.println("잘못된 번호 선택입니다.");
			}
		}
	}
}
