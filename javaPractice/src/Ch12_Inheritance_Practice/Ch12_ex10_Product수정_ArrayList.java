package Ch12_Inheritance_Practice;

import java.util.ArrayList;
/*
 * ȯ�� ����� �߰��ϱ� ���� �迭���� ArrayList�� ����Ǵ� ������ Ÿ���� ����
 */

class Buyer2 {
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

public class Ch12_ex10_Product����_ArrayList {
}
