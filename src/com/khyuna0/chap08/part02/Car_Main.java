package com.khyuna0.chap08.part02;

public class Car_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.run();
		
		System.out.println("======================");
		
		car.frontLeftTire = new KumhoTire(); // 업캐스팅으로 종류 바꾸기
		car.frontRightTire = new KumhoTire();
		car.run();
		
		
	}

}
