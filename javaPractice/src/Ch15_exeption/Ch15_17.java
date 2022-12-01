package Ch15_exeption;

import java.util.Scanner;


/* 로그인 정보가 틀릴 경우에 사용할 사용자 정의 예외 클래스를 만들고.
 * 적용(예외처리) 시킬 것
 */
public class Ch15_17 {
	String memberID = "abc";
	String password = "1234";
	Scanner stdIn = new Scanner(System.in);
	
	private boolean confirmLogin (String memberID, String password) {
		if(this.memberID.equals(memberID)&& this.password.equals(password)) {
			System.out.println("로그인 되었습니다");
			return true;
		}
		else {
			System.out.println("로그인 정보가 정확하지 않습니다.");
			return false;
		}
	}
	
	public void login() {
		String memberID, password;
		System.out.println("로그인 정보를 입력해주세요.");
		do {
			System.out.print("아이디를 입력해주세요 >>> ");
			memberID = stdIn.nextLine();
			System.out.print("비밀번호를 입력해주세요 >>> ");
			password = stdIn.nextLine();
		}
		while (!confirmLogin(memberID, password));
	}
	
	public static void main(String[] args) {
		Ch15_17 ex = new Ch15_17();
		ex.login();
	}
}

