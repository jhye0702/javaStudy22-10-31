package Ch07_Array;

import java.util.Scanner;

public class Ch07_Array02 {

	public static void main(String[] args) {
		/* array�� ���ڸ� �Է¹޾Ƽ� ������ ���� ���غ����� */
		
		
		// �迭 �ε����� �̿��ϴ� ���
//		Scanner scanner = new Scanner(System.in);
//		int[] numbers = new int[4];
//		int sum;
//		
//		System.out.print("1��° ���ڸ� �Է��ϼ��� : ");
//		numbers[0] = scanner.nextInt();
//		System.out.print("2��° ���ڸ� �Է��ϼ��� : ");
//		numbers[1] = scanner.nextInt();
//		System.out.print("3��° ���ڸ� �Է��ϼ��� : ");
//		numbers[2] = scanner.nextInt();
//		System.out.print("4��° ���ڸ� �Է��ϼ��� : ");
//		numbers[3] = scanner.nextInt();
		
		
		
		// for�� �̿��ϴ� ���
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[4];
		int sum=0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i+1) + "��° ���ڸ� �Է��ϼ���: ");
			array[i] = scanner.nextInt();
		}
		for (int j = 0; j < array.length; j++) {
			sum += array[j];
		}
		System.out.println("�հ� ==> " + sum);
		scanner.close();
	}
}
