package Ch01_Type;

public class Ch01_Type14 {

	public static void main(String[] args) {
		/*
		 * ������ ������ ���� ��� ���� ����.
		 * ������ �Ǽ��� ���� ��� ���� �Ǽ�.
		 */
		
		byte kor, math, eng; 
		kor = 55;
		math = 99;
		eng = 87;
		
		int sum = kor + math + eng;
		System.out.println("���� : " + sum); 		// ���� : 241
		
		int avg_01 = sum / 3;					// ���� / ����
		System.out.println("��� : " + avg_01); 	// ��� : 80
		
		double avg_02 = sum / 3;				// ���� / ����
		System.out.println("��� : " + avg_02); 	// ��� : 80.8 -> ���� �������� �������� ���� �Ŀ� �Ǽ��� ����.
		
		double avg_03 = (double)sum / 3; 		// �Ǽ� / ���� -> �Ǽ���
		System.out.println("��� : " + avg_03); 	// ��� : 80.33333333333333
		
		double avg_04 = sum / 3.0; 				// ���� / �Ǽ� -> �Ǽ���
		System.out.println("��� : " + avg_04); 	// ��� : 80.33333333333333
		
		double avg_05= (double)sum / 3.0; 		// �Ǽ� / �Ǽ� -> �Ǽ���
		System.out.println("��� : " + avg_05); 	// ��� : 80.33333333333333
		
	}

}
