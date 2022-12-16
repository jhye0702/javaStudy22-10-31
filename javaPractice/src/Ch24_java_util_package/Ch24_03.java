package Ch24_java_util_package;

import java.util.Calendar;

public class Ch24_03 {
	
	/* get() �޼���� ���� �������� */
	public static String getDayToStr(int day) {
		String[] days = { "��", "��", "ȭ", "��", "��", "��", "��" };
		return days[day - 1];
	}
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		// Calendar Ŭ�������� �����͸� ��� ������ get() �޼��带 ���.
		// get() �޼����� ��ȯ Ÿ���� int �̸�, ������ ���� �� (MONTH) ��ȯ�� ���� ������ 1�� ���� ���� ��ȯ.
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // ���� ������ 1 ���� ���� ��ȯ
		int date = calendar.get(Calendar.DATE);
		
		System.out.println(year + "�� " + month + "�� " + date + "��");
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // ������ ��ȯ�ϴµ�, ��ȯ Ÿ���� ����
		// 1 = �Ͽ���, = 2 = ������ 7, = �����
		System.out.println("������ " +getDayToStr(calendar.get(Calendar.DAY_OF_WEEK))+ "�����Դϴ�.");
		System.out.println("�̹� �⵵���� ������ ���� °�ΰ�? : ");
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // �̹� �⵵�� ��ĥ����
		
		System.out.println("�̹� ���� ��ĥ���� �ִ°�? : ");
		System.out.println(calendar.getActualMaximum(Calendar.DATE));
		
	}
}
	
