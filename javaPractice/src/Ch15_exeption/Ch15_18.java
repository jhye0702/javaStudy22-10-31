package Ch15_exeption;

import java.util.Scanner;


/* 로그인 정보가 틀릴 경우에 사용할 사용자 정의 예외 클래스를 만들고.
 * 적용(예외처리) 시킬 것
 */

class LoginUncertainException extends Exception{
	public LoginUncertainException(String message) {
		super(message);
	}
	/* 예외가 발생할 시에 로그로 남기는 코드 */
	// 굳이 예외처리를 하는 이유? id 비번이 틀렸을 때,
	// updateLog에 실패했던 id 비번이 쌓인다
	// 요즘 프로그램으로 해킹시도가 많다. 그 시도를 확인할 수 있다. 특정 ip에서 여러개 아이디, 비번 계속 시도
	// 아이디 비밀번호 기록을 이용해서 고객의 오타 실수인데 우기는 경우, 증거가 될 수 있음...등등ㅎㅎ
	
	public LoginUncertainException(String message, String memberID, String password) {
		super(message);
		updateLog(memberID, password);
	}
	public void updateLog(String memberID, String password) {
		
	}
	
}
public class Ch15_18 {
	String memberID = "abc";
	String password = "1234";
	Scanner stdIn = new Scanner(System.in);
	
	private boolean confirmLogin (String memberID, String password) throws LoginUncertainException {
		if(this.memberID.equals(memberID)&& this.password.equals(password)) {
			System.out.println("로그인 되었습니다");
			return true;
		}
		else {
			throw new LoginUncertainException("로그인 정보가 정확하지 않습니다.");// 로그인 정보가 틀릴 경우. 여기 throw가 들어가야함. 근데 밑에 있는게 실행 안된다. 
															// 그렇다고 return false를 위로 올리자니 그 밑에서 실행이 안된다. 
		}												 	// 예외발생 후 또 입력을 받아야하므로
	}
	
	public void login() {
		String memberID, password;
		Boolean answer; // 추가되는 부분
		System.out.println("로그인 정보를 입력해주세요.");
		do {
			System.out.print("아이디를 입력해주세요 >>> ");
			memberID = stdIn.nextLine();
			System.out.print("비밀번호를 입력해주세요 >>> ");
			password = stdIn.nextLine();
			try {
				answer = confirmLogin(memberID, password);
			}
			catch (LoginUncertainException e) {
				System.out.println(e.getMessage());
				answer = false;
			}
		}
		while (!answer);
	}
	
	public static void main(String[] args) {
		Ch15_18 ex = new Ch15_18();
		ex.login();
	}
}

