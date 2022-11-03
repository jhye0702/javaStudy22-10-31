package Ch05_For;

import java.util.Scanner;

public class Ch04_For05 {

	public static void main(String[] args) {
		/*
		 * for문을 이용해서 1부터 100까지의 정수 중에서
		 * 3의 배수의 총합을 구하는 코드를 작성해 보세요.
		 */
		
		// 세분화 시키기 =>
		// for문 돌려서 i 를 1부터 100까지 나오도록 한다.
		// 3의 배수일때만 출력을 해보자.
		// 출력한 3의 배수들의 합을 더해보자.
		
		// 1번째 방법
		
//		int sum = 0;
//		for (int i = 1; i<=100; i++) {
//			if ( i % 3 == 0 ) {
//				sum += i;
//			}
//		}
//		System.out.println("3의 배수의 총합은 " + sum);
		
		
		// 2번째 방법  ->  반복횟수가 적은만큼 시스템 작업이 줄어들어서 통상적으로 더 좋은 코드라고 칭함.
		int sum = 0;
		for (int i = 3; i <= 100; i += 3) {
			sum += i;
		}
		System.out.println("3 배수의 합: " + sum);
	}
}
