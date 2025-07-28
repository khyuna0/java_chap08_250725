package com.khyuna0.chap08.part02.cast;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drive drive = new Drive();
		
		Bus bus = new Bus();
		Truck truck =  new Truck();
		
		drive.carDrive(bus);
		drive.carDrive(truck);
	}

}
