package edu.kh.control.loop;

import java.util.Scanner;

public class 연습용 {
	
	public void ex1() {

	
	
	for(int i = 1 ; i <= 10 ; i++) {
		
		System.out.println(i);
	}
	}
	
	public void ex2 () {
		for(int i = 5 ; i <= 12 ; i++) {
			System.out.println(i);
		}
		
		System.out.println("=========================");
	
	
	
		
		int sum = 0;
		
		for(int i = 1 ; i <= 100 ; i++) {
			sum+=i;
			
		}
		System.out.println(sum);
	}
	
	public void ex3 () {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("정수1 입력 : ");
		int input1 = sc.nextInt();
		
		System.out.println("정수2 입력 : ");
		int input2 = sc.nextInt();
		
		int sum = 0;
		
		for(int i = input1 ; i <= input2 ; i++ ) {
			
			sum+= i;
			
		} System.out.printf("%d 부터 %d 까지의 합 : %d \n ", input1, input2, sum);
		
		
			
			
		}
		
	public void ex4() {
		
		for(int i = 1 ; i <= 100 ; i += 3) {
			
			System.out.println(i);
		}
		
	}
	
	public void ex5() {
		for(char i = 'A' ; i <= 'Z' ; i++) {
			System.out.println(i);
		}
	}
	
	public void ex6() {
		
		for(int i =10 ; i>=1 ; i--) {
			System.out.println(i);
		}
	}
	
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 1 ; i <= 5 ; i++) {
		sum+=i;
		System.out.println("정수입력 : " + i);
		}
		
		System.out.println(sum);
	}
	
	public void ex8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력받을 정수의 개수 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1 ; i <= input ; i++) {
			System.out.println("입력 " + i + " ");
			
			sum+=sc.nextInt();
		}					
	
		System.out.println("합 : " + sum);
	}
	
	public void ex9() {
		
		for(int i = 1 ; i <= 20 ; i++) {
			
			if (i % 5 == 0) {
				System.out.print(" (" + i + ")");
			
			} else {
				
				System.out.print(" " + i);
			}
			
		}
	}
	
	public void ex10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan < 1 || dan > 9) {
			System.out.println("잘못 입력 하셨습니다.");
		}else { for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d x %d = %d \n", dan, i, dan*1);
		}
			
		}
		
	}
	
	public void ex11() {
		for(int row = 1 ; row <=4 ; row++) {
			for(int col =1 ; col <= 5 ; col++) {
				
				System.out.print(col);
				
			}
			System.out.println();
		}
	}
	
	public void ex12() {
		for(int i = 2 ; i <= 9 ; i++) {
			for( int x = 1 ; x <= 9 ; x++) {
				System.out.printf("%d x %d = %d \n", i, x, i*x);
			} System.out.println();
		}
	}
	
	public void ex13( ) {
		
		for(int i = 1 ; i <= 4 ; i++) {
			for(int x = 1 ; x <= i ; x++) {
				System.out.print(x);
			}System.out.println();
		}
	}
	
	public void ex14() {
		
		for(int i = 4 ; i >= 1 ; i--) {
			for(int x = 1 ; x <= i ; i--) {
				System.out.print(i);
			}System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

