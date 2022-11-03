package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_Do_whileEx01 {

	public static void main(String[] args) {
		/*
		 * do~while��
		 * do~while���� ����Ͽ� ����ڷκ��� ���� ��ȣ�� �Է¹޴� ���α׷��� �ۼ��غ�����.
		 * ����ڰ� �ùٸ� �� ��ȣ�� �Է��� ������ �ݺ��� ����մϴ�.
		 * ����ڰ� �ùٸ� �� ��ȣ�� �Է��ؾ߸� ���� �������� �Ѿ�ϴ�.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int month;
		
		do {
			System.out.println("�ùٸ� ���� �Է��ϼ��� [1~12] : ");
			month = scanner.nextInt();
		} while ( month < 1 || month > 12);
		System.out.println("����ڰ� �Է��� ���� " +month+ "�Դϴ�.");

		// do~while������ ������ ���ö����� �Է��� ����� �հ� ���ϱ�
		// --> �׷��� ��ȿ���� �ʰ� ���������� ���� ������ if�� while�� �ι� ������
		// --> ��ȿ�� �˻����� ��
		int value = 0;
		int sum = 0;
		
		do {
			System.out.print("������ �Է��ϼ��� : ");
			value = scanner.nextInt();
			if(value >= 0) {
				sum += value;
			}
		} while ( value >= 0 );
			System.out.println("������ �հ�� " +sum+ "�Դϴ�.");
		
		
}
}
