package Test_12_02;

import java.util.Scanner;

public class MemberInsert extends Member {

	Scanner sc = new Scanner(System.in);
	MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
	}
	public void updateAddInfo() {
		System.out.println("추가 정보를 입력하시겠습니까?");
		System.out.println("추가 정보를 입력하시려면 Y, 그만 하실려면 N을 입력해 주십시요. >>> ");
		String addInfo = sc.nextLine();
		if(addInfo.equals("Y") || addInfo.equals("y")) {
			System.out.print("주소를 입력해주세요 >> ");
			String a = sc.nextLine();
			setAddress(a);
			System.out.print("이메일을 입력해주세요 >> ");
			setEmail(sc.nextLine());
		}
	}
	

	public void printMemberInfo() {
		System.out.println(toString());
	}

	public void login() {
		System.out.println("로그인 정보를 입력해주세요.");
		System.out.println("");
		System.out.println("아이디를 입력해주세요. >>> ");
		String memberID = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요. >>> ");
		String password = sc.nextLine();
		
		if(getMemberID().equals(memberID) && getPassword().equals(password)) {
			System.out.println("로그인 되었습니다.");
		}
		else {
			System.out.println("로그인 정보가 정확하지 않습니다.");
			login();
		}
	}


}
