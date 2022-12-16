package Ch24_java_util_package;

import java.time.LocalDateTime;

public class Ch24_11_java_time_LocalDateTime {

	public static void main(String[] args) {
		// �ð��� ���ϰ� ���� �޼��带 Ȯ���ϴ� �ڵ�
		// minusHours(long) �ð� ����, minusMinutes(long) �� ����, minusSeconds(long) �� ����, minusNanos(long) ������ ����
		// plusHours(long) �ð� ���ϱ�, plusMinutes(long) �� ���ϱ�, plusSeconds(long) �� ���ϱ�, plusNanos(long) ������ ���ϱ�
		
		LocalDateTime localDateTime = LocalDateTime.now(); // ���� �ð�
		System.out.println("���� �ð� : " + localDateTime); //���� �ð� : 2022-12-16T14:13:48.903751700
		
		LocalDateTime localDateTime1 = localDateTime.minusHours(5).plusMinutes(30).minusSeconds(4);
		
		// 5�ð��� ����, 30���� ���ϰ�, 4�ʸ� ��
		System.out.println("���� �ð� : " + localDateTime1); // ���� �ð� : 2022-12-16T09:43:44.903751700
		
		LocalDateTime localDateTime2 = localDateTime.minusHours(24);
		// ld2 ������ 24�ð��� ��
		System.out.println("�ڵ� ���� �ð� : " + localDateTime2);
		// �ڵ� ���� �ð� : 2022-12-15T14:13:39.197157100

	}

}
