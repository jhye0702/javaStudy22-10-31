package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_WhileEx05 {

	public static void main(String[] args) {

		/*
		 * 음수가 입력될 때까지,
		 * 사용자가 입력한 정수의 합계를 계산하여 출력하는 프로그램을 작성하세요
		 * while문을 사용, break 사용하지 말 것
		 */
		
//		int sum = 0;
//		boolean run = true;
//		
//		while (run) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.print("정수를 입력하세요 : ");
//			int num = scanner.nextInt();
//			if( num >= 0 ) {
//				sum += num;
//			}
//			else {
//				run = false;
//				System.out.println("입력한 정수들의 합 : " + sum);
//			}
//		}

		// ============================== 선생님 코드
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int value = 0;
		// while문의 조건이 1) 처음에 참이 되어야 하고 2) 합에 영향을 미치지 않아야함.
		while (value >= 0) {
			sum += value;
			System.out.print("정수를 입력하세요: ");
			value = scanner.nextInt();
		}
		System.out.println("정수의 합계는 " + sum + "입니다.");
		
		
	}
}
