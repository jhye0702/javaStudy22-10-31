package javaPractice.ch_03Scanner;

import java.util.Scanner;

public class Ch03_Scanner01 {

	public static void main(String[] args) {
		/*
		 * �ֿܼ��� �Է¹��� ���� Scanner Ŭ���� ���
		 */
		Scanner sc = new Scanner(System.in);
		int x, y, sum;
		
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�: "); // println���� ln�� ���� ���� �ٲ��� �ʴ´�.
		x = sc.nextInt(); // ���� �Է�
		
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�: ");
		y = sc.nextInt();
		
		sum = x + y;
		System.out.println(sum); // ���� ����Ѵ�.
	}

}
