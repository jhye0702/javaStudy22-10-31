package Ch07_Array;

import java.util.Arrays;

public class Ch07_Array07 {

	public static void main(String[] args) {

		/*
		 * �ζ� ��ȣ ���ϱ� (2)
		 * 1~45������ ������ �� ���ϱ�
		 * �ߺ��� üũ
		 */
		
		int range = 6;
		int[] numbers = new int[range];
		
		while (range > 0) {
			int temp = (int)(Math.random() * 45) + 1; // 1~45�� ������ ���� ��´�.
			
			//�ߺ�Ȯ��
			boolean result = true; // �ߺ� Ȯ�� ���� �����ϱ� ���� ����. �ߺ��̸� false
			for (int n : numbers) {
				if (n == temp) {
					System.out.println(temp + " => �ߺ��� ���Դϴ�.");
					result = false;
				}
			}
			if (result) {
				numbers[range - 1] = temp;
				range--;
			}
		}
		System.out.println(Arrays.toString(numbers));
		
		
	}
}
