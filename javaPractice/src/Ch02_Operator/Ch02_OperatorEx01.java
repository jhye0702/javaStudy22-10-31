package Ch02_Operator;

public class Ch02_OperatorEx01 {
	/*
	 * 534�ڷ��� ������ 30���� �л��鿡�� �Ȱ��� ������ ������ �� �� �л��� ��� ���� �� �ְ�,
	 * ���������� �� ���� ������ ���ϴ� �ڵ�.
	 * 1 ��ſ� �˸��� �ڵ带 �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
	
			int pencils = 534;
			int students = 30;
			
			// �л� �� ���� ������ ���� ��
			int pencilsPerStudent = pencils / students;
			System.out.println(pencilsPerStudent);
			
			// ���� ���� ��
			int pencilsLeft = pencils % students;
			System.out.println(pencilsLeft);

	}
}
