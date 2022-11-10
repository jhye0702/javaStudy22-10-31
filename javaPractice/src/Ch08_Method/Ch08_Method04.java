package Ch08_Method;

import java.util.Scanner;

public class Ch08_Method04 {
	
	/* 
	 return의 기능
	 1) 값을 반환 2) 함수를 종료 (반복문의 break와 비슷)
	 */
	
	static int max ( int a, int b ) { // a, b 의 최대값을 반환
		// return이 여러번 나와도 된다
		System.out.println("함수 시작");
		if ( a > b ) 
			return a;
		else
			return b;
		// System.out.println("함수 종료"); 
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();

		System.out.println("최대값은 " + max(a, b) + "입니다.");

	}

}
