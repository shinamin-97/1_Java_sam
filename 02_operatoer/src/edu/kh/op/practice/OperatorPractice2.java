package edu.kh.op.practice;


import java.util.Scanner;


public class OperatorPractice2 {
	
   
	public static void main(String[] args) {
	
		// sc.next() : 한 단어 입력
		// sc.nextLine() : 한 문장(한 줄) 입력, 띄어쓰기 포함
		//               -> 엔터가 입력 종료를 의미
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.next();
		
		System.out.println("학년(정수) : ");
		int grade = sc.nextInt();
		
		System.out.println("반(정수) : ");
		int ban = sc.nextInt();
		
		System.out.println("번호(정수) : ");
		int number = sc.nextInt();
		
		// 입력버퍼에 엔터가 남음
		
		sc.nextLine(); // 입력 버퍼 맨 앞에 남은 엔터를 꺼내옴 -> 입력 버퍼 청소
		
		System.out.println("성별(남학생/여학생) : ");
		String gender = sc.nextLine();
		
		// 버퍼에 남은 엔터를 꺼내옴
		// -> 문자열을 입력하지 못하고 넘어감
		
		// ** 해결 방법 **
		// 입력버퍼 맨앞에 있는 엔터(개형문자)를 제거
		
		// 맨 앞에 엔터(개형문자)가 남는 경우
		// -> next(), nextInt(), nextFloat(), nextDouble() 등...
		//    뒤에 sc.nextLine()을 한번 더 작성하기
		
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.printf(" %d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다. \n",
				grade, ban, number, gender, name, score);
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
		
		
		
}
}
