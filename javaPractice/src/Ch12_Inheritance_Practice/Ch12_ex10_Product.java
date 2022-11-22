package Ch12_Inheritance_Practice;

import java.util.ArrayList;
/*
 * ȯ�� ����� �߰��ϱ� ���� �迭���� ArrayList�� ����Ǵ� ������ Ÿ���� ����
 */

//=============================== Product ===============================
class Product {
	int price;			// ��ǰ�� ����
	int bonusPoint;		// ��ǰ ���Ž� �����ϴ� ���ʽ� ����
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);		// ���ʽ� ������ ��ǰ ������ 10%
	}
}
//=============================== Tv ===============================
class Tv extends Product {
	Tv() {
		// ���� Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100);			// Tv�� ������ 100�������� �Ѵ�.
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
//=============================== Computer ===============================
class Computer extends Product {
	Computer() {
		// ���� Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(200);			// Computer�� ������ 200�������� �Ѵ�.
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
//=============================== Computer ===============================
class Audio extends Product {
	Audio() {
		super(50);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}
//=============================== Buyer ù��° ===============================

//class Buyer { // ��, ������ ��� ���
//	int money = 1000;						// ���� �ݾ�
//	int bonusPoint = 0;						// ���ʽ� ����
//
//	/*
//	 * ���� : 1) ������ ��ǰ�� �����ϴ� ��� �߰�
//	 * 		 2) ������ ��ǰ�� ���� ������ ����ؼ� �����ִ� ��� �߰� 
//	 */
//	
//	Product[] item = new Product[10];	// ������ ��ǰ�� �����ϱ� ���� �迭
//	int i = 0;							// Product�迭�� ���� ī���� (������ ��ǰ ���� Ȯ��, ���� �����ؾ��� ���� ���� Ȯ��)
//	
//	
//	// ��ǰ ���� / ��ǰ�� ���� / ���ʽ� ���� �߰�  / ���Ű���, ���Ÿ�� ����
//	void buy(Product p) {	// �θ� Ŭ���� Ÿ������ �Ű����� ����.
//		//�θ� Ŭ������ �ʵ� ���. price, bonusPoint
//		if(money < p.price) {
//			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
//			return;
//		}
//		
//		money -= p.price;				// ���� ������ ������ ��ǰ�� ������ ����.
//		bonusPoint += p.bonusPoint;		// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
//		item[i++] = p;					// ��ǰ�� Product[] item�� �����Ѵ�.
//		
//		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
//	}
//	
//	// �޼ҵ� �߰�
//	void summary() {					// ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
//		int sum = 0;					// ������ ��ǰ���� ���� �հ�
//		String itemList = "";			// ������ ��ǰ ���
//		// 1. ---------------------------------- �⺻ for������ i �ݺ������� i < this.i; �� ���� 
//		//-------------------------------------- (�ڵ� �׽�Ʈ�� �̷��� �ϴ°� ������ ����)
//		for(int i=0; i < this.i; i++) {
//			sum += item[i].price;
//			itemList += (item[i] + " ");
//		}
//		// 2. ---------------------------------- forEach���� ����
////		for(Product p: item) {
////			if (p == null) {
////				break;
////			}
////			sum += p.price;
////			itemList += p + ", ";
////		}
//		
//		// 3. ---------------------------------- �⺻ for���� ���� i �ݺ������� item.length;�� ����
////		for (int i = 0; i < item.length; i++) {
////			if(item[i] == null)
////				break;
////			sum += item[i].price;
////			itemList += item[i] + ", ";
////		}
//		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "���� �Դϴ�.");
//		System.out.println("�����Ͻ� ��ǰ�� " + itemList + " �Դϴ�.");
//	}
//}


/*
 * ȯ�� ����� �߰��ϱ� ���� �迭���� ArrayList�� ����Ǵ� ������ Ÿ���� ����
 */
//=============================== Buyer ù��° ===============================
class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	ArrayList item = new ArrayList();	// ������ ��ǰ�� �����ϴµ� ����� ArrayList ��ü
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;				// ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;		// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		item.add(p);					// ������ ��ǰ�� ArrayList �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	void refund(Product p) {			// ������ ��ǰ�� ȯ���Ѵ�.
		if(item.remove(p)) {			// ��ǰ�� ArrayList���� �����Ѵ�.
			money += p.price;			
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
		}
		else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
			return;
		}
		
	}
	void summary() {				// ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum = 0;				// ������ ��ǰ���� ���� �հ�
		String itemList = "";		// ������ ��ǰ ���
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		// Vector �� i��°�� �ִ� ��ü�� ���´�.
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0)? "" + p : ", " + p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + " �Դϴ�.");
	}
}



	
//=============================== ���� �Լ� ===============================
public class Ch12_ex10_Product{
	public static void main(String[] args) {		
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();

		System.out.println();
		b.refund(com);
		b.summary();
		
		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ� ������ " + b.bonusPoint + "�� �Դϴ�.");
				
				
				
	}
}