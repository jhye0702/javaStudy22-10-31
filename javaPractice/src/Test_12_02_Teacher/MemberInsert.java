package Test_12_02_Teacher;

import java.util.Scanner;

public class MemberInsert {
	Scanner sc = new Scanner(System.in);
	Member member;
	MemberInsert(String memberID, String password, String name) {
		member = new Member (memberID, password, name);
	}
	
// ===================== 추가 정보 입력 ==============================================================
	public void updateAddInfo() {
		boolean isMore = true;
		
		
		System.out.println("추가 정보를 입력하시겠습니까?");
		
		do {
			System.out.println("추가 정보를 입력하시려면 Y, 그만 하실려면 N을 입력해 주십시요. >>> ");
			String answer = sc.nextLine();
			if(answer.equals("Y") || answer.equals("y") || answer.equals("N") || answer.equals("n")) {
				isMore = false;
				if(answer.equals("Y") || answer.equals("y")) {
					System.out.println("주소를 입력해 주십시요 >>> ");
					String address = sc.nextLine();
					member.setAddress(address);
					System.out.println("이메일을 입력해 주십시요 >>> ");
					String email = sc.nextLine();
					member.setEmail(email);
				}
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		while (isMore);
	}
	
// =================== 로그인 하기 ================================================================
	
	public void login() {
		String memberID, password;
		System.out.println("로그인 정보를 입력해주세요.");
		do {
			System.out.print("아이디를 입력해 주세요 >>> ");
			memberID = sc.nextLine();
			System.out.println("비밀번호를 입력해주세요. >>> ");
			password = sc.nextLine();
		}
		while (!confirmLogin(memberID, password));
	}
	
	private boolean confirmLogin(String memberID, String password) {
		if(member.getMemberID().equals(memberID) && member.getPassword().equals(password)) {
			System.out.println("로그인 되었습니다.");
			return true;
		}
		else {
			System.out.println("로그인 정보가 정확하지 않습니다.");
			return false;
		}
	}
	
// ==================== 입력한 정보 출력===============================================================
	
	public void printMemberInfo() {
		System.out.println(member);
	}
}
