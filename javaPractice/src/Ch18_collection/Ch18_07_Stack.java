package Ch18_collection;

import java.util.Stack;

// Stack�� �̿��� �������̽�
class Coin { // ���� ���̽��� ������ Ŭ����
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}

public class Ch18_07_Stack {
	/* Stack�� �̿��� ���� ���̽� */
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// ������ ����.
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(10));
		
		while (!coinBox.isEmpty()) { // ���� ���̽��� ������� Ȯ��
			Coin coin = coinBox.pop(); // ���� ���̽����� ���� ���� ������ ����
			System.out.println("������ ���� : " + coin.getValue()+"��");
		}
//		������ ���� : 10��
//		������ ���� : 100��
//		������ ���� : 50��
//		������ ���� : 100��

	}

}
