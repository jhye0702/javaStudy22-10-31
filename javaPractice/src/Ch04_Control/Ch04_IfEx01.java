package Ch04_Control;

import java.util.Scanner;

public class Ch04_IfEx01 {

	public static void main(String[] args) {
		/*
		 * ����ڿ��� �Է¹��� ������ �������,
		 * 0����, �������� �˷��ִ� �ڵ带 �ϼ��ϼ���.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int num = stdIn.nextInt();
		
		if (num > 0) {
			System.out.println(num + "�� ����Դϴ�");
		}
		else if (num < 0) {
			System.out.println(num + "�� �����Դϴ�");
		}
		else {
			System.out.println(num + "�Դϴ�");
		}
		stdIn.close();
		//�߸��� �Է°����� ���ڿ��̳� �Ҽ����ִ� �Ǽ��� �ִ� ��츦 ����!
		//scanner�� �ݴ°� �ƴ϶� ������ �ݾƾ��մϴ�.
	}

}
