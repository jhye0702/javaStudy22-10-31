package Ch04_Control;

import java.util.Scanner;

public class Ch04_If06max_min {

	public static void main(String[] args) {
		/* �� ������ �ִ밪 ���ϱ� */
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("����a �Է�: ");
		int a = stdIn.nextInt();
		System.out.print("����b �Է�: ");
		int b = stdIn.nextInt();
		System.out.print("����c �Է�: ");
		int c = stdIn.nextInt();
		
		//------- �ִ밪 ���ϱ�
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		System.out.println("�� ���� �� �ִ밪�� " + max + "�Դϴ�.");
		
		//------- �ּҰ� ���ϱ�
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		System.out.println("�� ���� �� �ּҰ��� " + min + "�Դϴ�.");
	}

}
