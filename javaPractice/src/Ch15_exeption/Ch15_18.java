package Ch15_exeption;

import java.util.Scanner;


/* �α��� ������ Ʋ�� ��쿡 ����� ����� ���� ���� Ŭ������ �����.
 * ����(����ó��) ��ų ��
 */

class LoginUncertainException extends Exception{
	public LoginUncertainException(String message) {
		super(message);
	}
	/* ���ܰ� �߻��� �ÿ� �α׷� ����� �ڵ� */
	// ���� ����ó���� �ϴ� ����? id ����� Ʋ���� ��,
	// updateLog�� �����ߴ� id ����� ���δ�
	// ���� ���α׷����� ��ŷ�õ��� ����. �� �õ��� Ȯ���� �� �ִ�. Ư�� ip���� ������ ���̵�, ��� ��� �õ�
	// ���̵� ��й�ȣ ����� �̿��ؼ� ���� ��Ÿ �Ǽ��ε� ���� ���, ���Ű� �� �� ����...����
	
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
			System.out.println("�α��� �Ǿ����ϴ�");
			return true;
		}
		else {
			throw new LoginUncertainException("�α��� ������ ��Ȯ���� �ʽ��ϴ�.");// �α��� ������ Ʋ�� ���. ���� throw�� ������. �ٵ� �ؿ� �ִ°� ���� �ȵȴ�. 
															// �׷��ٰ� return false�� ���� �ø��ڴ� �� �ؿ��� ������ �ȵȴ�. 
		}												 	// ���ܹ߻� �� �� �Է��� �޾ƾ��ϹǷ�
	}
	
	public void login() {
		String memberID, password;
		Boolean answer; // �߰��Ǵ� �κ�
		System.out.println("�α��� ������ �Է����ּ���.");
		do {
			System.out.print("���̵� �Է����ּ��� >>> ");
			memberID = stdIn.nextLine();
			System.out.print("��й�ȣ�� �Է����ּ��� >>> ");
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

