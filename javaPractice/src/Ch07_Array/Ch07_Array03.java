package Ch07_Array;

import java.util.Arrays;

public class Ch07_Array03 {

	public static void main(String[] args) {
		// ���̰� 5�� �迭 ����. �迭 ���� ����
		int[] a = new int[] {10, 20, 4, 25, 18};
		
		// ���̰� 7�� �迭 ����. new int[] ����
		int[] b = {1, 2, 3, 4, 5, 6, 7};
		
		// for������ �迭 �ʱ�ȭ
		int[] c = new int[10];
		for(int i = 0; i < c.length; i++) {
			c[i] = i;
		}
		
		// for���� �̿��� ���
//		System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
		// foreach ���� �̿��� ��� -----------> �ε��� ���� �� �� ����.
//		int = 0;
		int[] counts = new int[c.length];
		for(int d: c) {
			System.out.print(d);
			System.out.println(counts[0]);
			counts[d]++;
		}
		
		
			
		System.out.println(Arrays.toString(c));
		// Arrays.toString �ż��� ���

	}
}
