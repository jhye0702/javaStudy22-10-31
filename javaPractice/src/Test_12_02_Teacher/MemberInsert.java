package Test_12_02_Teacher;

import java.util.Scanner;

public class MemberInsert {
	Scanner sc = new Scanner(System.in);
	Member member;
	MemberInsert(String memberID, String password, String name) {
		member = new Member (memberID, password, name);
	}
	
// ===================== �߰� ���� �Է� ==============================================================
	public void updateAddInfo() {
		boolean isMore = true;
		
		
		System.out.println("�߰� ������ �Է��Ͻðڽ��ϱ�?");
		
		do {
			System.out.println("�߰� ������ �Է��Ͻ÷��� Y, �׸� �ϽǷ��� N�� �Է��� �ֽʽÿ�. >>> ");
			String answer = sc.nextLine();
			if(answer.equals("Y") || answer.equals("y") || answer.equals("N") || answer.equals("n")) {
				isMore = false;
				if(answer.equals("Y") || answer.equals("y")) {
					System.out.println("�ּҸ� �Է��� �ֽʽÿ� >>> ");
					String address = sc.nextLine();
					member.setAddress(address);
					System.out.println("�̸����� �Է��� �ֽʽÿ� >>> ");
					String email = sc.nextLine();
					member.setEmail(email);
				}
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		while (isMore);
	}
	
// =================== �α��� �ϱ� ================================================================
	
	public void login() {
		String memberID, password;
		System.out.println("�α��� ������ �Է����ּ���.");
		do {
			System.out.print("���̵� �Է��� �ּ��� >>> ");
			memberID = sc.nextLine();
			System.out.println("��й�ȣ�� �Է����ּ���. >>> ");
			password = sc.nextLine();
		}
		while (!confirmLogin(memberID, password));
	}
	
	private boolean confirmLogin(String memberID, String password) {
		if(member.getMemberID().equals(memberID) && member.getPassword().equals(password)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			return true;
		}
		else {
			System.out.println("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
			return false;
		}
	}
	
// ==================== �Է��� ���� ���===============================================================
	
	public void printMemberInfo() {
		System.out.println(member);
	}
}
