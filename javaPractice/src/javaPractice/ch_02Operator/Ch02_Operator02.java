package javaPractice.ch_02Operator;

public class Ch02_Operator02 {

	public static void main(String[] args) {
		/*
		 * ���� ������
		 * �ܵ����� ������� �ʴ� ��쿡�� ����, ������ ���� ��� ���� �ٸ�
		 */
		
		int i = 5, j = 5;
		System.out.println(i++); // 5�� ��� �� 1������ 6���� �ٲ�������� ����� �ȵ� ����
		// ����
		// print i;
		// i = i + 1;
		System.out.println(++j); // 1���� �� �� 6 ���
		// ����
		// j = j + 1;
		// print j;
		System.out.println("i = " + i + ", j = " + j); //  6 6 ���� �Ŀ��� ������ ��
	}

}