package com.khyuna0.chap08.part02;

public class Car {
	
	Tire frontLeftTire = new HankookTire(); // 업캐스팅, Car 클래스의 필드가 클래스임
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	
	public void run() {
		frontRightTire.roll();
		frontLeftTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
}
