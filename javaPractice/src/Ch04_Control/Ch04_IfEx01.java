package Ch04_Control;

import java.util.Scanner;

public class Ch04_IfEx01 {

	public static void main(String[] args) {
		/*
		 * 사용자에게 입력받은 정수가 양수인지,
		 * 0인지, 음수인지 알려주는 코드를 완성하세요.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = stdIn.nextInt();
		
		if (num > 0) {
			System.out.println(num + "은 양수입니다");
		}
		else if (num < 0) {
			System.out.println(num + "은 음수입니다");
		}
		else {
			System.out.println(num + "입니다");
		}
		stdIn.close();
		//잘못된 입력값으로 문자열이나 소수점있는 실수가 있는 경우를 위해!
		//scanner를 닫는게 아니라 변수를 닫아야합니다.
	}

}
