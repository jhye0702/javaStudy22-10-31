package Ch07_Array;

public class Ch07_Array04 {

	public static void main(String[] args) {

		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		
		int max = score[0]; // �迭�� ù��° ������ �ִ밪�� �ʱ�ȭ�Ѵ�.
		int min = score[0]; // �迭�� ù��° ������ �ּҰ��� �ʱ�ȭ�Ѵ�.
		
		for ( int i = 1; i < score.length; i++) { // i�� 1���� �����ϴ� ������ �ִ�,�ּҰ����� 0�� �־��־��� �����̴�.
			if (score[i] > max) { 
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}// end of for
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
	}
}
