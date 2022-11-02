package Ch04_Control;

import java.util.Scanner;

public class Ch04_If03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 >>> ");
		int age;
		// 1) 정수로 받음
		age = input.nextInt();
		
		// 2) 문자열로 입력 받은 후에 정수화
//		String tmp;
//		tmp = input.nextLine();
//		age = Integer.parseInt(tmp);
		
		/* 나이가 많은 순으로 조건문 만들기 */
//		if (age > 19) {
//			System.out.println("성인입니다.");
//			System.out.println("성인 요금이 적용됩니다.");
//		}
//		else if (age > 13) {
//			System.out.println("청소년입니다.");
//			System.out.println("청소년 요금이 적용됩니다.");
//		}
//		else if (age > 8) {
//			System.out.println("어린이입니다.");
//			System.out.println("어린이 요금이 적용됩니다.");
//		}
//		else {
//			System.out.println("유아입니다.");
//			System.out.println("유아 요금이 적용됩니다.");
//		}
//		System.out.println("결제를 진행해 주세요.");
		
		
		/* 나이가 작은 순으로 조건문 만들기 <=를 쓴건 경계선 나이 확인이 편함 */
		if (age <= 8) {
			System.out.println("유아 입니다");
			System.out.println("유아 요금이 적용됩니다");
		}
		else if (age <= 13 ) {
			System.out.println("어린이 입니다");
			System.out.println("어린이 요금이 적용됩니다");
		}
		else if (age <= 19) {
			System.out.println("청소년 입니다");
			System.out.println("청소년 요금이 적용됩니다");
		}
		else {
			System.out.println("성인 입니다");
			System.out.println("성인 요금이 적용됩니다");
		}
		System.out.println("결제를 진행해주세요");

	}
}
