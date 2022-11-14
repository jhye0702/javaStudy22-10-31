package Ch08_Method;

import java.util.Scanner;

public class Ch08_Method22_LoginLogout {

	public static void main(String[] args) {
		
		/*
		 * login() 메서드와 logout() 메서드를 선언하려고 합니다.
		 * login() 메서드를 호출할 때는 매개값으로 id와 passwd를 제공하고,
		 * logout() 메서드는 id만 매개값으로 제공합니다.
		 * 
		 * 1) login() 메서드는 매개값 id가 "admin", 매개값 password가 "1234"일 경우에만 true로 리턴하고
		 * 	  그 외의 값일 경우에는  false를 리턴하도록 하세요.
		 * 2) logout() 메서드는 "로그아웃 되었습니다."가 출력되도록 하세요.
		 */
		
		Scanner scanner = new Scanner(System.in);
		String id, password;
		System.out.print("아이디를 입력해 주세요. >> ");
		id = scanner.nextLine();
		System.out.print("비밀번호를 입력해 주세요. >> ");
		password = scanner.nextLine();
		
		// if(login(id, password)) { }로 조건식을 바로 넣도록 하면 더 간단하기는 함.
		boolean result = login(id, password);
			if(result) {
				System.out.println("로그인 되었습니다.");
				logout(id);
			}
			else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
			}
	}


		static boolean login(String id, String password) {
			return (id.equals("admin") && password.equals("1234"))? true : false; 
		}
			
		static void logout(String id) {
			System.out.println("로그아웃 되었습니다.");
			
		}
		
}
