package Test_12_02_Teacher;

import java.util.Scanner;

public class ShopCart {

	// ��ٱ��Ͽ� ���尡���� �ִ� ���� 10���� �迭
	Scanner sc = new Scanner(System.in);
	Cart[] carts = new Cart[10];
	int cntCart = 0;

	public void selectProduct() {
		int prductID, cnt;
		
		do {
			System.out.print("������ ��ǰ�� ��ȣ�� �Է��� �ֽʽÿ� >>> ");
			prductID = sc.nextInt(); // ������ ��ǰ ��ȣ
			System.out.print("��ǰ�� ���� ������ �Է��� �ּ��� >>> ");
			cnt = sc.nextInt();
			
			carts[cntCart++] = new Cart(prductID, cnt); 
		}
		while (confirmReShopping()); // while���� true���� do�� �� �����Ѵ�.
	}
	
	boolean confirmReShopping() {
		while(true)	{
			System.out.print("�������� ��ǰ�� �� �����Ͻðڽ��ϱ�?");
			System.out.print("�� ���Ÿ� ���Ͻø� Y, �׸� �����ϽǷ��� N�� �Է��� �ֽʽÿ� >>> ");
			String answer = sc.next();		
			if(answer.equals("Y") || answer.equals("y")) {
				return true;
			}
			else if(answer.equals("N") || answer.equals("n")) {
				return false;
			}
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
	
	public void printCart() {
		for(Cart choice : carts) {
			if ( choice != null ) {
				System.out.println(choice);
			}
		}
	}
	

}
