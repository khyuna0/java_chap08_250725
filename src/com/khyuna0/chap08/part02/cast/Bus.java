package com.khyuna0.chap08.part02.cast;

public class Bus implements Vehicle {

	@Override // 인터페이스의 추상 메소드 오버라이딩
	public void run() {
		System.out.println("버스가 달린다.");
	}

	public void checkFare() { // 버스 클래스에만 존재하는 메소드
		System.out.println("승차요금을 체크합니다.");
	}
	
}
