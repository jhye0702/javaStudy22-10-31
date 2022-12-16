package Ch24_java_util_package;

import java.time.LocalDate;

public class Ch24_12_java_time_LocalDate {

	public static void main(String[] args) {
		/* Ŭ�������� ���� �� �����ϱ�
		 * �� Ŭ�������� �ʵ� ������ Ư�� ������ ������ �� �ִ� �޼��尡 ����.
		 * withyear(int) �� ����, withMonth(int) �� ����, withDayOfYear(int) ���� �� ����, withDayOfMonth(int) ���� �� ����,
		 */
		
		
		
		// ��¥�� �����ϴ� �ڵ�
		LocalDate ld = LocalDate.now();
		System.out.println(ld); // 2022-12-16
		
//		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(33);
		// ��ü�� . ��� �޼ҵ� ���� �ϴ°ǵ� ld�� 
		// ���� 1999��, ���� 8����, ���� ���� 33�Ϸ� ����.
//		System.out.println(new_ld); // 1999-02-02
		System.out.println(ld.withYear(1999).withMonth(8).withDayOfYear(33));
	}

}
