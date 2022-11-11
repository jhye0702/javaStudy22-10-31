package Ch08_Method;

import java.util.Scanner;

public class Ch08_Method20 {
	
	/*
	 * ���Ϻ��� ������ ���� �ﰢ���� ǥ���ϼ���.
	 * ���� ��µǴ� �κ��� putStars() �޼��带 �����ؼ� �����ϼ���.
	 * �� �� : 4
	 		*
	 	   **
	 	  ***
	 	 ****
	 */
	static void putStars(int n, int total) {
		for (int i=0; i <= total; i++) {
			if (i<=total - n) {
				System.out.print(' ');
			}
			else {
				System.out.print('*');
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("���Ϻ��� ������ �����ﰢ���� ǥ���մϴ�.");
		System.out.print("�� �� : ");
		int total = stdIn.nextInt();
		
		for (int i = 1; i <= total; i++) {
			putStars(i, total);
			System.out.println();
		}
	
	}
}	

