package Ch07_Array;

public class Ch07_Array14 {

	public static void main(String[] args) {

		/*
		 * �Ʒ��� �迭�� �̿��Ͽ� �������� �� ���� �ϼ���
		 * �� ���� �ο��� 3�� �Դϴ�.
		 */
		
		String[] students = {"���ȯ", "������", "������", "������", "������",
				"�ڱ���", "�ڼ���", "�ڼ���", "������", "������",
				"���", "���ϴ�", "�ſ�ȭ", "������", "������",
				"������", "������", "���¹�", "�̱���", "�̼�ȣ",
				"�̽���", "�̿���", "����", "������", "�ֹμ�",
				"������", "Ȳ����" };
		int numberPerTeam = 3;
		int count = 0;
		
		// ����
		for(int i = 0; i < 100000; i++) {
			int n = (int)(Math.random() * students.length); // 0~students.length - 1���� �� ���� ���Ƿ� ��´�.
			String temp = students[0];
			students[0] = students[n];
			students[n] = temp;
		}
		for(int i = 0; i < students.length; i++) {
			if ( (i+1) % numberPerTeam == 1 ) {
				System.out.print( ++count + "�� : " );
			}	
			System.out.print(students[i] + " ");
			if ( (i+1) % numberPerTeam == 0 ) {
				System.out.println();
			}
		}
	}
}	
