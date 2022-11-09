package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_WhileEX04 {


		/*
		 while문과 Sccanner 를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 완성해주세요.
		 프로그램 실행을 하면 다음과 같은 실행 결과가 나와야 합니다. (Scanner 의 nextLine() 사용)
		 	 
		 */
		
		public static void main(String[] args) {
			boolean run = true;
			int balance = 0; // 잔액
			Scanner scanner = new Scanner(System.in);
			while (run) {
				System.out.println("----------------------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("----------------------------------------");
				System.out.print("선택 > ");
				
				/* 코드 시작 */
				int menuNum = Integer.parseInt(scanner.nextLine());
				switch(menuNum) {
					case 1 :
						System.out.print("예금액 > ");
						balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2 :
						System.out.print("출금액 > ");
						balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3 :
						System.out.print("잔고 > ");
						System.out.println(balance);
						break;
					case 4 :
						run = false;
						break;
				}
				System.out.println();
				/* 코드 종료 */
			}
			System.out.println("프로그램 종료");
		
		
		
	}
}
