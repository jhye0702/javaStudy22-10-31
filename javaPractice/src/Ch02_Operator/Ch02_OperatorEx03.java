package Ch02_Operator;

import java.util.Scanner;

public class Ch02_OperatorEx03 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 두개의 정수를 입력받아서
		 * 정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수, 작은 수를
		 * 계산하여 화면에 출력하는 프로그램을 작성하시오.
		 * 큰 수와 작은 수를 구할 때는 조건연산자(삼항연산자)를 사용하시오
		 */
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		x = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		y = sc.nextInt();
		
		System.out.println("두 수의 합 : " + (x + y));
		System.out.println("두 수의 차 : " + (x - y));
		System.out.println("두 수의 곱 : " + (x * y));
		System.out.println("두 수의 평균 : " + (double)((x+y)/2));
		System.out.println("큰 수 : " + (x>y? x : y));
		System.out.println("작은 수 : " + (x>y? y : x));
		
				
	}

}
