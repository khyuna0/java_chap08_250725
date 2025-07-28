package com.khyuna0.chap08.part02.Exer;

public class DaoExample {

	public static void dbWork(DataAccesObject dao) { // 자동 업캐스팅. my, ora 모두 호출 가능 
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		// 매개값을 주는 메소드
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}
	

}
