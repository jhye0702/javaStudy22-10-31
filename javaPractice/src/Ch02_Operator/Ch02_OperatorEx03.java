package Ch02_Operator;

import java.util.Scanner;

public class Ch02_OperatorEx03 {

	public static void main(String[] args) {
		/*
		 * ����ڷκ��� �ΰ��� ������ �Է¹޾Ƽ�
		 * ������ ��, ������ ��, ������ ��, ������ ���, ū ��, ���� ����
		 * ����Ͽ� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ū ���� ���� ���� ���� ���� ���ǿ�����(���׿�����)�� ����Ͻÿ�
		 */
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		x = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		y = sc.nextInt();
		
		System.out.println("�� ���� �� : " + (x + y));
		System.out.println("�� ���� �� : " + (x - y));
		System.out.println("�� ���� �� : " + (x * y));
		System.out.println("�� ���� ��� : " + (double)((x+y)/2));
		System.out.println("ū �� : " + (x>y? x : y));
		System.out.println("���� �� : " + (x>y? y : x));
		
				
	}

}
