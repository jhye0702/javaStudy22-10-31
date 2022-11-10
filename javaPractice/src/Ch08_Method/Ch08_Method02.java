package Ch08_Method;

import java.util.Scanner;

public class Ch08_Method02 {
	
	/*
	 * �޼��� ����� ����
	 1. �ڵ� �ݺ��� ���� �� ����.
	 ��κ��� ���α׷��� � �ڵ带 �ݺ��ؼ� ���.
	 �ݺ��Ǵ� �ڵ带 ��ġ�ϸ� ���������ϴ� ����� �ݺ��Ǵ� �ڵ�� ������ ������ �ǰ�,
	 �ڵ尡 �ݺ��Ǹ� ����ϰ� ������ ������ ��.
	 �� �ڵ带 �����ϰų� ���������� �� ���� �κ��� �����ؾ� �ϴ� ������ �߻�.
	 Dont't repeat yourself (DRY, �ݺ����� ����) ��Ģ�� ��Ű�� ��ǥ���� ����� �ٷ� '�޼��带 Ȱ���ϴ� ��'
	 
	 2. �� ���� �߻�ȭ�� �� �� �ִ�.
	 ���α׷� ���ο� �ִ� �ڵ带 �ϳ��ϳ� �Ű澴�ٸ� ���α׷��� ����� ���� �� ����.
	 �Լ��� Ȱ���ϸ� ���� �ڵ带 �ϳ��ϳ� �Ű澲�� �ʾƵ�, '�޼��� �̸�' ������ ���ϴ� ó���� �� �� ����.
	 
	 3���� ����, ü��, ������ �ִ밪�� ���ؼ� ǥ��(�޼��� �̿�)
	 �޼��带 ����� 1) �ҽ��� �پ�� main �޼����� �⺻ ������ �б� ���� 2) ������ �� �� �ִ�.
	 */
	
	
	// �޼ҵ�
	static int max ( int a, int b, int c ) { // a, b, c�� �ִ밪�� ��ȯ
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int range = 3;
		int [] height = new int [range]; // ����
		int [] weight = new int [range]; // ü��
		int [] age	  = new int [range]; // ����
		
		for ( int i = 0; i < range; i++ ) { // �Է�
			System.out.print("[" + (i+1) + "] ");
			System.out.print("���� : ");			height[i] = stdIn.nextInt();
			System.out.print("    ü�� : ");		weight[i] = stdIn.nextInt();
			System.out.print("    ���� : ");		age[i] 	  = stdIn.nextInt();
		}
		
		// �ִ밪�� ���Ѵ�
		int maxHeight = max(height[0], height[1], height[2]);	// ������ �ִ밪
		int maxWeight = max(weight[0], weight[1], weight[2]);	// ü���� �ִ밪
		int maxAge = max(age[0], age[1], age[2]);				// ������ �ִ밪
				
		System.out.println("������ �ִ밪�� " + maxHeight + "�Դϴ�.");
		System.out.println("ü���� �ִ밪�� " + maxWeight + "�Դϴ�.");
		System.out.println("������ �ִ밪�� " + maxAge + "�Դϴ�.");
		

	}

}
