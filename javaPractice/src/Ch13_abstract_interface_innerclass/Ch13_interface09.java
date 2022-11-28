package Ch13_abstract_interface_innerclass;

interface Buy {
	void buy();
	void info();
	
	default void order() {
		System.out.println("���� �ֹ�");
	}
}

interface Sell{
	void sell();
	void info();
	
	default void order() {
		System.out.println("�Ǹ� �ֹ�");
	}
}

class Customer implements Buy, Sell {
	@Override
	public void buy() {
		System.out.println("�Ǹ��ϱ�");
	}
	@Override
	public void sell() {
		System.out.println("�����ϱ�");
	}
	
	// ����Ʈ �޼��尡 �ߺ��� �Ǿ����� �� �������̽��� �����ϴ� Customer Ŭ�������� ������ �ؾ���
	/*
	 * �� �������̽��� ����Ʈ �޼��尡 �ߺ��Ǵ� ���.
	 * �� Ŭ������ ���� ������ �������̽��� ������ ����Ʈ �޼��尡 �ִ� ���
	 * �������̵��� �ؾ���.
	 */
	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}
	
	// �� �������̽��� �̸��� ���� �޼��尡 ����Ǿ��ٰ� �ص� 
	// ������ Ŭ�������� �̷�����Ƿ�,
	// � �޼��带 ȣ���ؾ��ϴ��� ��ȣ���� ����.
	@Override
	public void info() {
		System.out.println("Customer �Դϴ�.");
	}
}
/*
 * �� Ŭ������ ���� �������̽��� �����ϴ� ���
 * �� Ŭ������ ���� Ŭ������ ��ӹ����� �޼��� ȣ���� ��ȣ������ ������ �߻��� �� ����.
 * �׷��� �ڹٴ� ���� ����� �������� ����.
 * 
 * ������ �������̽��� �� Ŭ������ ���� �������̽��� ������ �� ����.
 * �������̽��� ���� �ڵ峪 ��� ������ ������ �ʱ� ������ �������� ���ÿ� ���� �� ����.
 * �� �������̽��� �̸��� ���� �޼��尡 ����Ǿ��ٰ� �ص� ������ Ŭ�������� �̷�����Ƿ�,
 * � �޼��带 ȣ���ؾ��ϴ��� ��ȣ���� ���� ��.
 */

public class Ch13_interface09 {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer Ŭ���� ���� customer�� Buy �������̽� ���� buyer�� �����Ͽ� �� ��ȯ.
		// buyer�� Buy �������̽��� �޼��常 ȣ�� ����
		Buy buyer = customer;
		buyer.buy();
		//buyer.sell();
		buyer.order();	// �� �Ǹ� �ֹ�
		
		// Customer Ŭ���� ���� customer�� Sell �������̽����� seller�� �����Ͽ� �� ��ȯ.
		// seller�� Sell �������̽��� �޼��常 ȣ�� ����.
		Sell seller = customer;
		//Sell seller = (Sell)customer; // (Sell) ��������.
		seller.sell();
		buyer.order();  // �� �Ǹ� �ֹ�
		// seller.buy();
		
		if (seller instanceof Customer) {
			// seller�� ���� Ŭ�������� Customer�� �ٽ� ����ȯ
			Customer customer2 = (Customer) seller;
			customer2.buy();
			customer2.sell();
			customer2.order();
		}
		customer.order();
	}
}
