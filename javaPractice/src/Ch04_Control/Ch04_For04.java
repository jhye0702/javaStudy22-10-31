package Ch04_Control;

import java.util.Scanner;

public class Ch04_For04 {

	public static void main(String[] args) {
		/*
		 * for��
		 * 
		 */
		
		int sum = 0; 
		// �� ���� ���� ���� sum, 0�� �������ָ� sum���ٰ� i�� ���ؾ��ϴµ� �ƹ��͵� ���µ��ٰ� ���ڸ� ���� �� ���� ����
		for (int i = 1; i<=10; i++) {
			System.out.println("i=" + i + ", sum = " + (sum += i));
		}
	}


}