package Ch04_If;

import java.util.Scanner;

public class Ch04_If05 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ ǥ���մϴ�.\n�� ���Դϱ�? : ");
		int month = stdIn.nextInt();
		
		if (month >= 3 && month <=5) {
			System.out.println(month + "���� ���Դϴ�.");
		}
		else if (month >= 6 && month <= 8) {
			System.out.println(month + "���� �����Դϴ�");
		}
		else if (month >= 9 && month <= 11) {
			System.out.println(month + "���� �����Դϴ�");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.println(month + "���� �ܿ��Դϴ�");
		}
		else {
			System.out.println("�߸��� �Է°��Դϴ�.");
		}
	}

}
