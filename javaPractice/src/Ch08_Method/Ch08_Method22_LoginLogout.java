package Ch08_Method;

import java.util.Scanner;

public class Ch08_Method22_LoginLogout {

	public static void main(String[] args) {
		
		/*
		 * login() �޼���� logout() �޼��带 �����Ϸ��� �մϴ�.
		 * login() �޼��带 ȣ���� ���� �Ű������� id�� passwd�� �����ϰ�,
		 * logout() �޼���� id�� �Ű������� �����մϴ�.
		 * 
		 * 1) login() �޼���� �Ű��� id�� "admin", �Ű��� password�� "1234"�� ��쿡�� true�� �����ϰ�
		 * 	  �� ���� ���� ��쿡��  false�� �����ϵ��� �ϼ���.
		 * 2) logout() �޼���� "�α׾ƿ� �Ǿ����ϴ�."�� ��µǵ��� �ϼ���.
		 */
		
		Scanner scanner = new Scanner(System.in);
		String id, password;
		System.out.print("���̵� �Է��� �ּ���. >> ");
		id = scanner.nextLine();
		System.out.print("��й�ȣ�� �Է��� �ּ���. >> ");
		password = scanner.nextLine();
		
		// if(login(id, password)) { }�� ���ǽ��� �ٷ� �ֵ��� �ϸ� �� �����ϱ�� ��.
		boolean result = login(id, password);
			if(result) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				logout(id);
			}
			else {
				System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
			}
	}


		static boolean login(String id, String password) {
			return (id.equals("admin") && password.equals("1234"))? true : false; 
		}
			
		static void logout(String id) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			
		}
		
}
