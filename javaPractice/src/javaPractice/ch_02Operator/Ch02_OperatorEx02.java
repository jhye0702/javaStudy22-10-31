package javaPractice.ch_02Operator;

public class Ch02_OperatorEx02 {
	/*
	 * ������ ���� �ڸ� ���ϴ� ������ �ڵ�.
	 * ���� value�� ���� 356�̶�� 300�� ���� �� �ֵ��� �ڵ� �ۼ�. ��� �����ڸ� ���
	 * �̶� � ���� �־ 100������ ���� ���� �� �ֵ���
	 */
	public static void main(String[] args) {
		int value = 356;
		System.out.println(value - (value % 100));
		System.out.println((value / 100) * 100);
	}

}
