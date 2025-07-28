package com.khyuna0.chap08.part02.cast;

public class Drive {
	
	public void carDrive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle; // 매개변수에 입력된 인수값이 Bus 로 만든 객체인지 확인 후 대입
			bus.checkFare();
		} 
		vehicle.run();
		
	}



}
