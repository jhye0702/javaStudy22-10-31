package Ch24_java_util_package;

import java.util.Calendar;

/*
 	Calendar Ŭ������ �޷��� ǥ���� Ŭ�����Դϴ�.
 	
 	Calendar Ŭ������ ����Ͽ� ���� �ð��� �������� �����ϼ���
 	
 	 ������:
 	 2022�� 12�� 16��
 	 �ݿ��� ���� 
 	 11�� 10�� 58�� 
 	 
 */
public class Ch24_05 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); // ��
		int month = now.get(Calendar.MONTH) +1; // ��
		int day = now.get(Calendar.DAY_OF_MONTH); // ��
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null; // ����
//		switch (week) {
//			case Calendar.MONDAY;
//				strWeek = "��";
//				break;
//			case Calendar.TUESDAY;
//				strWeek = "ȭ";
//				break;
//			case Calendar.WENDESDAY;
//				strWeek = "��";
//				break;
//			case Calendar.THURSDAY;
//				strWeek = "��";
//				break;
//			case Calendar.FRIDAY;
//				strWeek = "��";
//				break;
//			case Calendar.SATURDAY;
//				strWeek = "��";
//				break;
//			case Calendar.SUNDAY;
//				strWeek = "��";
//				break;
//		}
		String strAmPm = null; // ���� ����
		int hour = 0; // ��
		int minute = 0; // ��
		int second = 0; // ��
		
		int amPm = now.get(Calendar.AM_PM);
		if (amPm == Calendar.AM) {
			strAmPm = "����";
		} else {
			strAmPm = "����";
		}
		
		System.out.print( year + "�� " );
		System.out.print( month + "�� " );
		System.out.println( day + "�� " );
		System.out.print( strWeek + "���� " );
		System.out.println( strAmPm + " " );
		System.out.print( hour + "�� " );
		System.out.print( minute + "��" );
		System.out.print( second + "��" );
	}

}
