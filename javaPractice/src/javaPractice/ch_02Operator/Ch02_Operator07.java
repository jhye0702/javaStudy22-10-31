package javaPractice.ch_02Operator;

public class Ch02_Operator07 {

	public static void main(String[] args) {
		/*
		 * �� ������
		 * 2�� �������̰�, ���� boolean ���̰� ����� boolean
		 */
		
		int a = 10;
		System.out.println(5 < a && a < 15); //true -> true && true
		System.out.println((5 < a && a < 15) && a % 2 ==0); // true -> true && true
		
		a = 4;
		System.out.println((5 < a && a < 15) && a % 2 == 0); // false -> false && true
		System.out.println((5 < a && a < 15) || a % 2 == 0); // true -> false || true
	}
}
