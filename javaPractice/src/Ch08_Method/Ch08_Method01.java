package Ch08_Method;

import java.util.Scanner;

public class Ch08_Method01 {
		
	public static void main(String[] args) {
		
		/* �޼���� �� �ʿ��Ѱ�? */
		
		// 3���� ����, ü��, ������ �ִ밪�� ���ؼ� ǥ��
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
		
		// ������ �ִ밪�� ���Ѵ�
		int maxHeight = height[0];
		if (height[1] > maxHeight) maxHeight = height[1];
		if (height[2] > maxHeight) maxHeight = height[2];
		
		// ü���� �ִ밪�� ���Ѵ�.
		int maxWeight = weight[0];
		if (weight[1] > maxWeight) maxWeight = weight[1];
		if (weight[2] > maxWeight) maxWeight = weight[2];
		
		// ������ �ִ밪�� ���Ѵ�.
		int maxAge = age[0];
		if (age[1] > maxAge) maxAge = age[1];
		if (age[2] > maxAge) maxAge = age[2];
		
		System.out.println("������ �ִ밪�� " + maxHeight + "�Դϴ�.");
		System.out.println("ü���� �ִ밪�� " + maxWeight + "�Դϴ�.");
		System.out.println("������ �ִ밪�� " + maxAge + "�Դϴ�.");
		

	}

}
