package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_Break01 {

	public static void main(String[] args) {
		/*
		 * while, break를 사용하여 사용자가 입력한 점수들의 평균을 내는 프로그램을 작성합니다.
		 * 만약 사용자가 음수를 입력하면 break에 의하여 반복 루프가 종료되게 합니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		// 내가 한 풀이
//		int grade;
//		int count = 0;
//		int sum = 0;
//		double avg = 0;
//		
//		while (true) {
//			System.out.print("점수를 입력하세요 : ");
//			grade = scanner.nextInt();
//			if (grade < 0) {
//				break;
//			}
//			sum += grade;
//			count++;
//		}
//		avg = sum/count;
//		System.out.println("평균 점수는 " +avg+ "입니다");
		
		// 선생님이 하신 거
		int count = 0;
		int total = 0;
		
		while (true) {
			System.out.print("점수를 입력하세요 : ");
			int grade = scanner.nextInt();
			if (grade < 0) {
				break;
			}
			total += grade;
			count++;
		}
		System.out.println("평균 점수 : " + total / (double)count );

	}
}

// 코드를 짤때 줄이 짧을 수록 좋다!