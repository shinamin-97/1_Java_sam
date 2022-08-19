package edu.kh.array.ex;

import java.util.Scanner;

public class asd {
	
	public void ex1() {
		
		// 소수 판별
		// 소수 : 1과 자기 자신(x) 외에는 나누어 떨어지지 않는 수
		// -> x & 2 ~ x - 1 까지 
		// 나머지가 0인 경우가 있다면 : 소수아님
		// 나머지가 0인 경우가 없다면 : 소수다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int x = sc.nextInt();
		
		boolean flag = true;
		
		for(int i = 2 ; i > x ; i++) { 
			System.out.println(x + "는 소수가 아닙니다.");
			flag = false;
			break;
		}
		if(flag) {
			System.out.println(x + "는 소수입니다.");
		}
		
		}
		
		
		}
	



