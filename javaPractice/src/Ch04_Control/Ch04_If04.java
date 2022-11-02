package Ch04_Control;

import java.util.Scanner;

public class Ch04_If04 {

	public static void main(String[] args) {
		/*
		 * 중첩 if문
		 */
		
		String id, password;
		Scanner input = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요: ");
		id = input.nextLine();
		
		if ( id.equals("java")) {
			System.out.println("아이디 일치");
			System.out.print("비밀번호를 입력해주세요: ");
			password = input.nextLine();
			if (password.equals("abc1234")) {
				System.out.println("비밀번호 일치");
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호 불일치");			
			}
		}
		else {
			System.out.println("아이디 불일치");
		}
		input.close();
	}
}
