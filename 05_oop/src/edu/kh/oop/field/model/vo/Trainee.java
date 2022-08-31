package edu.kh.oop.field.model.vo;

public class Trainee {
	
	public String name = "신아민"; // 이름
	public String phone = "010-4609-3721"; // 휴대폰 번호
	public String email = "qnrlgkals@naver.com"; // 이메일(선택)
	public int salary ; // 급여(훈련수당)
	
	public static char classRoom = 'A'; // 강의장
	
	// 명시적 초기화 : 필드 선언 시 바로 값 초기화
	// ex) public String email = "없음";
		
	// 초기화 블록 : 객채(instance) 필드를 초기화 하는 블록
	
	// -> instance block : static이 없는 변수 값 초기화(생성 시 마다)
	// -> static block 	 : static이 있는 필드 값 초기화(프로그램 실행 시 1회)
	
	{ // instance block
		
		email = "없음";
		salary = 11600;
		
	}
	
	static { // static block
		
		classRoom = 'A';
		
	}

}
