package Ch06_While_Break_Continue;

import java.util.Random;
import java.util.Scanner;

public class Ch06_WhileEx06 {

	public static void main(String[] args) {

		/*
		 프로그램이 가지고 있는 정수를 사용자가 알아맞히는 게임.
		 1) 1부터 1000 사이의 정수 하나를 생성한다.
		 2) 사용자가 답을 추측하여 입력한다.
		 3) 정답이 아닐 경우 정답이 입력한 값보다 큰지 혹은 작은지 알려준다.
		 4) 정답일 경우, 성공 메시지 및 시도 횟수 출력할 것.
		 
		 정답을 추측하여 보시오 : 500
		 제시한 정수가 높습니다.
		 정답을 추측하여 보시오 : 250
		 제시한 정수가 낮습니다.
		 .
		 .
		 .
		 축하합니다. 시도횟수 = 8
		 */
		Scanner scanner = new Scanner(System.in);
		int answer; // 정답 입력할 변수
		int guess; // 사용자의 추측을 입력받을 변수
		int count = 0; 
		
		// 1) 1부터 1000사이의 정수 하나를 생성
		// answer = (int)(Math.random() * 1000) + 1;
		
		// util.Random 사용.
		
		// int nextInt(int n)  int 타입 0 ~ 매개값까지의 난수를 리턴합니다.
		Random random = new Random();
		answer = random.nextInt(999) + 1;
		// System.out.println(answer);
		
		// ======================================= 강사님 if문으로 풀이
//		while(true) {
//			count++;
//			// 2) 사용자가 답을 추측하여 입력한다.
//			System.out.print("정답을 추측하여 보시오: ");
//			guess = scanner.nextInt();
//			
//			// 3) 정답이 아닐 경우 정답이 입력한 값보다 큰지 혹은 작은지 알려준다
//			if (guess < answer) {
//				System.out.println("제시한 정수가 낮습니다");
//			}
//			else if (guess > answer) {
//				System.out.println("제시한 정수가 높습니다");
//			}
//			else {
//				// 4) 정답일 경우, 성공 메세지 및 시도 횟수를 출력할 것
//				System.out.println("축하합니다. 시도횟수 = " + count);
//				break;
//			}
//		}
		
		
		// ===================================== 강사님 do while문 풀이
		
		do {
			count++;
			// 2) 사용자가 답을 추측하여 입력한다.
			System.out.print("정답을 추측하여 보시오: ");
			guess = scanner.nextInt();
			
			// 3) 정답이 아닐 경우 정답이 입력한 값보다 큰 지 혹은 작은지 알려준다.
				if ( guess < answer) {
					System.out.println("제시한 정수가 낮습니다");
				}
				else if (guess > answer) {
				System.out.println("제시한 정수가 높습니다");
				}
		} while (guess != answer);
		//4) 정답일 경우, 성공 메세지 및 시도 횟수 출력하기
		System.out.println("축하합니다! 시도횟수 = " + count);
		
		
		
		
//		Random random = new Random();
//		int answer = random.nextInt(999) + 1;
//		
//		int count = 0;
//		
//		
//		while (true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("정답을 추측하여 보세요 : ");
//			int num = sc.nextInt();
//			count++;
//			if(num > answer) {
//				System.out.println("제시한 정수가 정답보다 큽니다.");
//				System.out.println();
//			}
//			else if (num < answer) {
//				System.out.println("제시한 정수가 정답보다 작습니다");
//				System.out.println();
//			}
//			else {
//				break;
//			}
//		}
//		System.out.println("축하합니다. 시도횟수: " + count);
		
		
		
		
	}
}
