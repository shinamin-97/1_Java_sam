package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1이상의 숫자를 입력해주세여 : ");
		int input = sc.nextInt();
		
		for(int i = 1 ; i <= 10 ; i++) {
			if(input < 1 ) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		}
		System.out.println();
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		
		if(input < 1 ) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			
			
			for(int i = input ; i >= 1 ; i--) {
				
				System.out.print(i + " ");
				
			}
			
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1 ; i <= input ; i++) {
			System.out.print(" + " + i);
			
			sum += i;
		}
		
		System.out.println("= " + sum);
		
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1 ) { // num1, num2 중에 1 미만이 있는가?
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else { // 둘 다 1미만이 아니다.
			
			if(num1 > num2) { // 둘 다 1 미만이 아니다.
				
				int temp = num1;  // temp :8 / num1 :8 / num2 :4
				
				num1 = num2; // temp : 8 / num1 : 4 / num2 : 4
				
				num2 = temp; // temp : 8 / num1 : 4 / num2 : 8
			}
			
			for(int i = num1 ; i <= num2 ; i--) {
				
				System.out.println(i + " ");
		
				}
			/* int start = num1;
			   int end = num2;
			   
			   if(num1 > num2) { // 먼저 입력한 숫자가 크면 start / end를 바꿈
				start = num2;
				end = num1;
			}
			
			for(int i = start ; i <= end ; i++) {
				System.out.print(i + " ");
			}*/
			
			
			
			/*if(num1 < num2) {
				for(int i=num1 ; i<=num2 ; i++) {
					System.out.print(i + " ");
				}
			} else {
				for(int i=num2 ; i<=num1 ; i++) {
					System.out.print(i + " ");
				}
			}*/
			
			 
			}
		}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int input = sc.nextInt();
		System.out.println("====== " + input + " 단=======");
			
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("\n%d * %d = %2d" , input, i, input*i);
		}
		System.out.println();
		
		
	}
	
	public void practice6 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int input = sc.nextInt();
				
		if(input < 2 || input > 9) {
			
			System.out.println("2~9 사이 숫자만 입력해주세요");
		
		} else {
			
			for(int x = input ; x >=2 && x <=9 ; x++) {
				
				for(int i = x ; i <=9 ; i++) {
					
				}
				System.out.println("==== " + x + "단 ====");
					
				}
			System.out.println();	
				
				
			}
		}
	
	   public void practice7 ( ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" 정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = 1 ; x <= input ; x++) {
			
			for(int i = 1; i <= x ; i++) {
				System.out.print("*");
				
			}
			
		System.out.println();
		}
 }
		
		public void practice8 ( ) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" 정수 입력 : ");
			int input = sc.nextInt();
			
			for(int x = input ; x >= 1 ; x--) {
				
				for(int i = x ; i >= 1 ; i--) {
					
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
			public void practice9 ( ) {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("정수 입력 : ");
				int input = sc.nextInt();
				
				for (int row =1 ; row <= input ; row++ ) {
					
				//for(int i = input - row ; i >= 1 ; i--) {
				for(int i = input - 1 ; i >= row ; i--) {
						
						System.out.print(" ");
					}
					
					for(int col = 1 ; col <= row ; col++ ) {
						
						System.out.print("*");
						
			  // if 문을 이용한 풀이
			/*	for(int col = 1 ; col <= input ; col++) {
					
					if(col<=input - row) {
						System.out.print("   ");
					} else {
						System.out.print("*"); 
					}
				} */
					}
					System.out.println();
				}
				
			}
			
			public void practice10() {
				
				Scanner sc = new Scanner(System.in);
				System.out.println("정수 입력 : ");
				int input = sc.nextInt();
				
				//위쪽 삼각형
				for(int row = 1 ; row <= input ; row++) {
					
					for(int col = 1 ; col <= row ; col++) {
						
						System.out.print("*");
					}
					System.out.println(); // 줄바꿈
				}
				// 아래쪽 삼각형
				for(int row = input - 1 ; row >= 1 ; row--) {
					
					for(int col = 1 ; col <= row ; col++) {
						
						System.out.print("*");
			        }
					System.out.println();// 줄바꿈
                 }
            
			}
			public void practice11() {
				
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 입력 : ");
				int input = sc.nextInt();
				
				for(int row = 1 ; row <= input ; row++ )  {
					
					for(int i = input - 1 ; i >= row ; i--) {
						
						System.out.print(" ");
					}
					
					for(int col = 1 ; col <= row * 2 - 1 ; col++ ) {
						
						System.out.print("*");
					
				}
					System.out.println();
			}
		}
			
			public void practice12() {
				
				Scanner sc = new Scanner(System.in);
				System.out.print("정수 입력 : ");
				int input = sc.nextInt();
				
				for(int row = 1 ; row <= input ; row++) {
					
					for(int col = 1 ; col <= input ; col++) {
						
						// 첫 번쨰 / 마지막 줄, 칸일 때만 * 출력
						if(row == 1 || row == input || col == 1 || col == input) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
						
					}
					System.out.println();
				}
				
			}
			
			
			public void practice13 ( ) {		
			
				
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" 자연수 하나를 입력 하세요. : ");
			int input = sc.nextInt();
			
			int count = 0;
			
			for(int i = 1 ; i <= input ; i++ ) {
				
				// 2의 배수 또는 3의 배수인 경우 출력
				if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				
				// 2와 3의 공배수 == 2로도 나눠 떨어지고, 3으로 나누어도 떨어진다.
				if(i % 2 == 0 && i % 3 == 0) {
					
					count++; // count 증가
					
					
				}
				}
				
				
			}
			System.out.println("\ncount : " + count);

}
}