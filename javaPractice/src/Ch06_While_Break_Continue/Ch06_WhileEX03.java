package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_WhileEX03 {

	public static void main(String[] args) {
		/*
		 * �ݺ����� ���������� �����
		 * 1) ���ǽ��� false�� �ǰų�
		 * 2) break���� ����
		 * break���� �ݺ��� ���߰� ��
		 * �ݺ����� ����Ǵٰ� break���� ������ ��ٷ� �ݺ����� �����
		 * �ݺ��� ������ �ڵ带 ����!
		 */
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int num;
		
		while(true) { //������ true�� �������ִ� �κ��� ������ ���� �ݺ��ǹǷ� break�� ������Ѿ���
			System.out.print("���� ���ڸ� �Է��ϼ��� (�����Ϸ��� 0 �Է�) : ");
			num = scanner.nextInt(); // ���� �Է¹޾Ƽ� i�� ����
			if (num == 0) { // ���� 0�� �Է��Ͽ��ٸ� ����
				break;
			}
			sum += num; //�Է¹��� �� �����ֱ� 
			// ������ break�� ������ ����� ��ġ�� �ʰ�
			// while�� �ƿ� ������ �������� ������.
		}
		System.out.println("��������� ���� = " +sum);
		
		
	}
}
