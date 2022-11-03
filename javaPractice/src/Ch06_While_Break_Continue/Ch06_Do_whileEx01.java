package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_Do_whileEx01 {

	public static void main(String[] args) {
		/*
		 * do~while문
		 * do~while문을 사용하여 사용자로부터 월의 번호를 입력받는 프로그램을 작성해보세요.
		 * 사용자가 올바른 월 번호를 입력할 때까지 반복을 계속합니다.
		 * 사용자가 올바른 월 번호를 입력해야만 다음 문장으로 넘어갑니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int month;
		
		do {
			System.out.println("올바른 월을 입력하세요 [1~12] : ");
			month = scanner.nextInt();
		} while ( month < 1 || month > 12);
		System.out.println("사용자가 입력한 월은 " +month+ "입니다.");

		// do~while문으로 음수가 나올때까지 입력한 양수만 합계 구하기
		// --> 그렇게 유효하지 않고 복잡해지고 같은 조건이 if와 while에 두번 들어가야함
		// --> 유효성 검사했을 때
		int value = 0;
		int sum = 0;
		
		do {
			System.out.print("정수를 입력하세요 : ");
			value = scanner.nextInt();
			if(value >= 0) {
				sum += value;
			}
		} while ( value >= 0 );
			System.out.println("정수의 합계는 " +sum+ "입니다.");
		
		
}
}
