package com.khyuna0.ch08.part01.test;

public class MyClass {
	
	RemoteControl rc = new Television(); //인터페이스는 필드도 가능

	public MyClass(RemoteControl rc) {	
		this.rc = rc;
	}
	
	public void methodA() { //인터페이스는 로컬변수로 가능 
		RemoteControl rc = new Audio();
	}
	
	public void methodB(RemoteControl rc) { //인터페이스는 매개변수로도 가능
		
	}

}
