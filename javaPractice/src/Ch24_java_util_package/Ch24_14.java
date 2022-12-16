package Ch24_java_util_package;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class Ch24_14 {
/*
 	with() �޼���� TemporalAdjusters Ÿ���� ���ڷ� ������ Ư�� ��¥�� ����
 	firstDayOfYear() : �⵵�� ù��° ��
 	lastDayOfYear() : �⵵�� ù��° ��
 	firstDayOfMonth() : ���� ù��° ��
 	lastDayOfMonth() : ���� ������ ��
 	firstInMonth(DayofWeek dayOfWeek) : ���� ù��° ����
 	lastInMonth(DayofWeek dayOfWeek) : ���� ������ ����
 	next(DayOfWeek dayOfWeek) : ���ƿ��� ����
 	nextOrSame(DayOfWeek dayOfWeek) : ������ ������ ���ƿ��� ����
 	previous(DayOfWeek dayOfWeek) : ���� ����
 	previousOrSame(DAyOfWeek dayOfWeek) : ������ ������ ���� ����
 */
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2022-12-16T15:21:20.416512200
		LocalDateTime new_ldt;
		
		// �⵵�� ù��° ��
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfYear()); 
		System.out.println("������ ù��° �� : " + new_ldt); //2022-01-01T15:21:20.416512200
		// �⵵�� ������ ��
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("������ ������ �� : " + new_ldt); //2022-12-31T15:21:20.416512200
		
		
		// ���� ù��° ��
		new_ldt = ldt.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("�̹� ���� ù��° �� : " + new_ldt); // 2022-12-01T15:21:20.416512200
		// ���� ������ ��
		new_ldt = ldt.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("�̹� ���� ù��° �� : " + new_ldt); // 2022-12-31T15:24:43.038069
		
		// ���� ù��° ����
		new_ldt = ldt.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("�̹����� ù ������ : " + new_ldt); // 2022-12-05T15:24:17.481834800
		// ���� ������ ����
		new_ldt = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
		System.out.println("�̹����� ������ �Ͽ��� : " + new_ldt); // 2022-12-25T15:24:08.302853200
		
		
		// ���ƿ��� ����
		new_ldt = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
		System.out.println("���ƿ��� �ݿ��� : " + new_ldt); // 2022-12-23T15:23:59.119908100
		// ������ ������ ���ƿ��� ����
		new_ldt = ldt.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
		System.out.println("������ ������ ���� �ݿ��� : " + new_ldt); // 2022-12-16T15:23:45.829767100
		
		
		// ���� ����
		new_ldt = ldt.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("���� ������ : " + new_ldt); // 2022-12-12T15:23:32.994077600
		// ������ ������ ���� ����
		new_ldt = ldt.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("������ ������ ���� ������ : " + new_ldt); // 2022-12-12T15:20:00.764136400
	}
	
}
