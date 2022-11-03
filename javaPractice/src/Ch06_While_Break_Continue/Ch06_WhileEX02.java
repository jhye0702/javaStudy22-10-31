package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_WhileEX02 {

	public static void main(String[] args) {
		// =============== 중간에 if문 쓰기
//		Scanner scanner = new Scanner(System.in);
//		String answer = "Y"; // while이 시작될 수 있도록 응답 값을 초기화
//		int count = 0;
//		
//		while (answer.equals("Y")) {
//			System.out.print("음악을 재생하시겠습니까?(Y/N) ");
//			answer = scanner.nextLine();
//			if (answer.equals("Y")) {
//				++count;
//				System.out.println("음악을 " + count + "번 재생했습니다.");
//			}
//		}
//		System.out.println("재생 종료");
		
		// =============== 중간에 if 빼보기
		Scanner scanner = new Scanner(System.in);
		String answer = "Y"; // while이 시작될 수 있도록 응답 값을 초기화
		int count = 0;
		
		while (answer.equals("Y")) {
			
		}
		

		// =============== 중간에 for문 쓰기
//		Scanner scanner = new Scanner(System.in);
//		int count = 0;
//		
//		for (String answer = "Y"; answer.equals("Y")||answer.equals("y");) {
//			System.out.println("음악을 재생하시겠습니까? (Y) ");
//			answer = scanner.nextLine(); //사용자의 응답을 받습니다.
//			
//			if (answer.equals("Y")||answer.equals("y")) {
//				++count;
//				System.out.println("음악을 " +count+ "번 재생했습니다");
//			}
//		}
//		System.out.println("재생 종료");
	}
}
