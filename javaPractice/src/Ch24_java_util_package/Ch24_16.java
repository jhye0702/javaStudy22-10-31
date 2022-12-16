package Ch24_java_util_package;

import java.math.BigDecimal;

public class Ch24_16 {

	/*
	 * BigDecimal : ��Ȯ�� �Ҽ��� ������ �ؾ��� �� BigDecimal Ŭ������ ���
	 * double , long ���� �Ҽ��� ������ �� �� ������ ���� �κ��� ����.
	 */
	public static void main(String[] args) {
		// double�� ����� ����� BigDecimal�� ����� ����� ��
		double a = 24.3953;
		double b = 50.343998;
		System.out.println(a + b); // 74.73929799999999
		
		BigDecimal number = new BigDecimal(String.valueOf(a));
		// BigDecimal �� �ڷḦ ���ڿ��� ��ȯ�� BigDecimal �� ��ü ����
		BigDecimal number2 = new BigDecimal(String.valueOf(b));
		// add() �޼ҵ带 Ȱ���Ͽ� ��Ȯ�� ��� ���� ��ȯ
		System.out.println(number.add(number2)); // 74.739298
	}

}
