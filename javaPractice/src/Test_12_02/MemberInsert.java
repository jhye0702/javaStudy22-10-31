package Test_12_02;

import java.util.Scanner;

public class MemberInsert extends Member {

	Scanner sc = new Scanner(System.in);
	MemberInsert(String memberID, String password, String name) {
		super(memberID, password, name);
	}
	public void updateAddInfo() {
		System.out.println("�߰� ������ �Է��Ͻðڽ��ϱ�?");
		System.out.println("�߰� ������ �Է��Ͻ÷��� Y, �׸� �ϽǷ��� N�� �Է��� �ֽʽÿ�. >>> ");
		String addInfo = sc.nextLine();
		if(addInfo.equals("Y") || addInfo.equals("y")) {
			System.out.print("�ּҸ� �Է����ּ��� >> ");
			String a = sc.nextLine();
			setAddress(a);
			System.out.print("�̸����� �Է����ּ��� >> ");
			setEmail(sc.nextLine());
		}
	}
	

	public void printMemberInfo() {
		System.out.println(toString());
	}

	public void login() {
		System.out.println("�α��� ������ �Է����ּ���.");
		System.out.println("");
		System.out.println("���̵� �Է����ּ���. >>> ");
		String memberID = sc.nextLine();
		System.out.println("��й�ȣ�� �Է����ּ���. >>> ");
		String password = sc.nextLine();
		
		if(getMemberID().equals(memberID) && getPassword().equals(password)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
			login();
		}
	}


}
