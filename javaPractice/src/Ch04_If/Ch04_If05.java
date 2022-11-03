package Ch04_If;

import java.util.Scanner;

public class Ch04_If05 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("계절을 표시합니다.\n몇 월입니까? : ");
		int month = stdIn.nextInt();
		
		if (month >= 3 && month <=5) {
			System.out.println(month + "월은 봄입니다.");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println(month + "월은 여름입니다");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println(month + "월은 가을입니다");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "월은 겨울입니다");
		}
		else {
			System.out.println("잘못된 입력값입니다.");
		}
	}

}
