package edu.kh.oop.basic;

public class BasicRun {
	
	public static void main(String[] args) {
		
		SAM 신아민 = new SAM();
		// heap 영역에 SAM 클래스에 정의된 내용을 이용하여
		// SAM 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + 신아민.name);
		System.out.println("나이 : " + 신아민.age);
		System.out.println("생년월일 : " + 신아민.birthday);
		
		// System.out.println("비밀번호 : " + 신아민.password);
		// The field SAM.password is not visible
		
		// 비밀번호를 볼수 있는 기능을 호출 == 간접 접근 방법
		신아민.showPassword();
		
		// 기눙 수행
		신아민.eat();
		신아민.study();
		신아민.plus(50, 100);
	}

}
