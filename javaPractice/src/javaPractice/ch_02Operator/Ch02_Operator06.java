package javaPractice.ch_02Operator;

public class Ch02_Operator06 {

	public static void main(String[] args) {
		// ����(and)
		System.out.println(true && true); // true 1 * 1 = 1
		System.out.println(true && false); // false 1 * 0 = 0
		System.out.println(false && true); // false 0 * 1 = 0
		System.out.println(false && false); // false 0 * 0 = 0		
		
		// ����(or)
		System.out.println(true || true); // true 1 + 1 = 2
		System.out.println(true || false); // true 1 + 0 =1
		System.out.println(false || true); // true 0 + 1 = 1
		System.out.println(false || false); // false 0 + 0 = 0
		
		
		// ����ٷ� Dead code�� �ߴµ�, ���� ���� Ȯ������ �� ������� �������� ���!
		// �ڿ� ���� Ȯ������ �ʾƵ� �Ǳ� ������ Dead code�� �˴ϴ�
		
		
		// ��� �� && �� or �� 3���� ���ϴ� �Ͱ� ����. +�� x�� �� ���� ������ �ٲ� ��� ���� ������
		// false�� true�� �� �� ��ġ�� �ٲ� ����� ���� ��.
	}

}
