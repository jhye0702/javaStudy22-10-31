package Ch04_Control;

import java.util.Scanner;

public class Ch04_If03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� >>> ");
		int age;
		// 1) ������ ����
		age = input.nextInt();
		
		// 2) ���ڿ��� �Է� ���� �Ŀ� ����ȭ
//		String tmp;
//		tmp = input.nextLine();
//		age = Integer.parseInt(tmp);
		
		/* ���̰� ���� ������ ���ǹ� ����� */
//		if (age > 19) {
//			System.out.println("�����Դϴ�.");
//			System.out.println("���� ����� ����˴ϴ�.");
//		}
//		else if (age > 13) {
//			System.out.println("û�ҳ��Դϴ�.");
//			System.out.println("û�ҳ� ����� ����˴ϴ�.");
//		}
//		else if (age > 8) {
//			System.out.println("����Դϴ�.");
//			System.out.println("��� ����� ����˴ϴ�.");
//		}
//		else {
//			System.out.println("�����Դϴ�.");
//			System.out.println("���� ����� ����˴ϴ�.");
//		}
//		System.out.println("������ ������ �ּ���.");
		
		
		/* ���̰� ���� ������ ���ǹ� ����� <=�� ���� ��輱 ���� Ȯ���� ���� */
		if (age <= 8) {
			System.out.println("���� �Դϴ�");
			System.out.println("���� ����� ����˴ϴ�");
		}
		else if (age <= 13 ) {
			System.out.println("��� �Դϴ�");
			System.out.println("��� ����� ����˴ϴ�");
		}
		else if (age <= 19) {
			System.out.println("û�ҳ� �Դϴ�");
			System.out.println("û�ҳ� ����� ����˴ϴ�");
		}
		else {
			System.out.println("���� �Դϴ�");
			System.out.println("���� ����� ����˴ϴ�");
		}
		System.out.println("������ �������ּ���");

	}
}
