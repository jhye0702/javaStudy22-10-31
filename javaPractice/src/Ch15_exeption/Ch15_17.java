package Ch15_exeption;

import java.util.Scanner;


/* �α��� ������ Ʋ�� ��쿡 ����� ����� ���� ���� Ŭ������ �����.
 * ����(����ó��) ��ų ��
 */
public class Ch15_17 {
	String memberID = "abc";
	String password = "1234";
	Scanner stdIn = new Scanner(System.in);
	
	private boolean confirmLogin (String memberID, String password) {
		if(this.memberID.equals(memberID)&& this.password.equals(password)) {
			System.out.println("�α��� �Ǿ����ϴ�");
			return true;
		}
		else {
			System.out.println("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");
			return false;
		}
	}
	
	public void login() {
		String memberID, password;
		System.out.println("�α��� ������ �Է����ּ���.");
		do {
			System.out.print("���̵� �Է����ּ��� >>> ");
			memberID = stdIn.nextLine();
			System.out.print("��й�ȣ�� �Է����ּ��� >>> ");
			password = stdIn.nextLine();
		}
		while (!confirmLogin(memberID, password));
	}
	
	public static void main(String[] args) {
		Ch15_17 ex = new Ch15_17();
		ex.login();
	}
}

