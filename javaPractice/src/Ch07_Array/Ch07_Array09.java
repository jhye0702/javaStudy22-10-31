package Ch07_Array;


public class Ch07_Array09 {

	public static void main(String[] args) {

		/*
		 * 2���� �迭 �ʱ�ȭ �� ���
		 */
		
		int[][]arr = {
					{1, 2, 3},
					{4, 5, 6}
					}; // 2���� �迭 ����
		System.out.println("��: " + arr.length);
		System.out.println("��: " + arr[0].length);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
 
	}
}
