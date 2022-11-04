package Ch07_Array;


public class Ch07_Array12 {

	public static void main(String[] args) {

		/*
		 * �� ���� ���� ������ �ٸ� ���
		 * ��ø for���� �̿��ؼ� �־��� �迭�� ��ü �׸��� �հ� ��հ��� ���ϼ���
		 */
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		//�ۼ���ġ
		int count = 0; // ������ ������ �ٸ� 2���� �迭�̶� ������ ���� �� ����, ī������ �ؾ���.
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count;
		
		System.out.println("sum : " + sum); // 881
		System.out.println("avg : " + avg); // 88.1
		
	}
}