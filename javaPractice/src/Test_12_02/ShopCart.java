package Test_12_02;

import java.util.Scanner;

public class ShopCart {

	// ��ٱ��Ͽ� ���尡���� �ִ� ���� 10���� �迭
	Cart[] MyProduct = new Cart[10];
	int cartCount = 0;
	Scanner sc = new Scanner(System.in);
//	int productNum;
//	int productCount;
	public void selectProduct() {
		while(true) {
			System.out.println("������ ��ǰ�� ��ȣ�� �Է��� �ֽʽÿ� >>> ");
			int productNum = sc.nextInt();
//			productNum = Integer.parseInt(sc.nextLine()); // ���������� ���� �� ������ ����.....?
			System.out.println("��ǰ�� ���� ������ �Է��� �ּ��� >>> ");
			int productCount = sc.nextInt();
//			productCount = Integer.parseInt(sc.nextLine());  // ���������� ���� �� ������ ����
			MyProduct[cartCount++] = new Cart(productNum, productCount);
//		System.out.println("�������� ��ǰ�� �� �����Ͻðڽ��ϱ�?");
//		System.out.println("�� ���Ÿ� ���Ͻø� Y, �׸� �����ϽǷ��� N�� �Է��� �ֽʽÿ� >>> ");
//		String selectMore = sc.next();		
//		if(selectMore.equals("Y") || selectMore.equals("y")) {
//			sumPrductCount();
//		}
//		else if(selectMore.equals("N") || selectMore.equals("n")) {
//			break;
//		}
	}
//	public void sumPrductCount() {
//		System.out.println("������ ��ǰ�� ��ȣ�� �Է��� �ֽʽÿ� >>> ");
//		int productNum2 = sc.nextInt();
//		System.out.println("��ǰ�� ���� ������ �Է��� �ּ��� >>> ");
//		int productCount2 = sc.nextInt();
//		for(int i=0; i<MyProduct.length; i++) {
//			if(i == productNum2) {
//					MyProduct[i] = new Cart(productNum2, +productNum2); 
//			}
//		}
//		System.out.println("�������� ��ǰ�� �� �����Ͻðڽ��ϱ�?");
//		System.out.println("�� ���Ÿ� ���Ͻø� Y, �׸� �����ϽǷ��� N�� �Է��� �ֽʽÿ� >>> ");
//		String selectMore = sc.next();
//		if(selectMore.equals("Y") || selectMore.equals("y")) {
//			return true;
//		}
//		else if(selectMore.equals("N") || selectMore.equals("n")) {
//			return false;
//		}
	}
	
	public void printCart() {
		for(Cart choice : MyProduct) {
			if ( choice != null ) {
				System.out.println(choice);
			}
		}
	}
	

}
