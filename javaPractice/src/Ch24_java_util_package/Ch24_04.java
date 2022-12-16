package Ch24_java_util_package;

import java.util.Calendar;

public class Ch24_04 {

	public static void main(String[] args) {
		/* set()���� ��¥ �����ϱ� */
		// set() �޼���� Calendar �ν��Ͻ��� ���� ������ �� ���
		// �ΰ��� �Ķ���͸� �ʿ�� �ϸ� ù ��° �Ķ���ʹ� �ٲ���� �׸�, �ι�° �Ķ���ʹ� �ٲ� ���� ����.
		// set(�ٲ���� �׸�, �ٲ� ��);
		// set(��, ��, ��);
		
		/* D-day �� ���ϴ� �ڵ� */
		Calendar today = Calendar.getInstance(); // ���� ��¥�� ��Ÿ���� �񱳷� �� �� ����ϴ� ��ü
		Calendar endOfYear = Calendar.getInstance(); // ���� ��¥�� ������ ��ü
		Calendar christmas = Calendar.getInstance(); // ũ�������� ��¥�� ������ ��ü
		
		endOfYear.set(Calendar.MONTH, 11); // endOfYear ��ü�� ���� 12���� ����
		endOfYear.set(Calendar.DATE, 31); // endOfYear ��ü�� ���� 31�Ϸ� ����
		long diff = endOfYear.getTimeInMillis() - today.getTimeInMillis(); // �������� ��������� �ʸ� ��
		System.out.println("�������� ���� �� : " + diff / (24 * 60 * 60 * 1000) + "��"); 
		// �Ϸ� 24�ð�, �ð��� 60��, �д� 60��, 1�ʸ� 1000���� ........!!!
		// �������� ��������� �ʸ� �Ϸ� ��ȯ
		
		christmas.set(2022, 11, 25); // 2022�� 12�� 25��. ���� -1 �� �Է�.
		diff = christmas.getTimeInMillis() - today.getTimeInMillis(); // ũ������������ ���� �ʸ� ��
		System.out.println("ũ������������ ���� �� : " + diff / (24 * 60 * 60 * 1000) + "��"); 
		// ũ������������ ��������� �ʸ� �Ϸ� ��ȯ
	}

}
