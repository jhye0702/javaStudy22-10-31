package Ch04_Control;

import java.util.Scanner;

public class Ch04_If04 {

	public static void main(String[] args) {
		/*
		 * ��ø if��
		 */
		
		String id, password;
		Scanner input = new Scanner(System.in);
		System.out.print("���̵� �Է����ּ���: ");
		id = input.nextLine();
		
		if ( id.equals("java")) {
			System.out.println("���̵� ��ġ");
			System.out.print("��й�ȣ�� �Է����ּ���: ");
			password = input.nextLine();
			if (password.equals("abc1234")) {
				System.out.println("��й�ȣ ��ġ");
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("��й�ȣ ����ġ");			
			}
		}
		else {
			System.out.println("���̵� ����ġ");
		}
		input.close();
	}
}
