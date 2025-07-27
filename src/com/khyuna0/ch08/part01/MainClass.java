package com.khyuna0.ch08.part01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Shape shape = new Shape(); -> 인터페이스 객체(인스턴스) 생성 안됨!
		
		Shape shape = new Rectangle(); //업캐스팅
		shape = new Triangle(); //업캐스팅
		shape.getArea();
		shape.getColor();
		Draw draw;
		draw = new Triangle();
		draw.drawPen();
		draw.drawShape();
		
		Triangle tri = new Triangle();
		tri.drawPen();
		tri.getArea();
			
	}

}
