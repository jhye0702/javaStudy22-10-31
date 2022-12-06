package Test_12_02;

import java.util.Scanner;

public class ShopCart {

	// 장바구니에 저장가능한 최대 개수 10개인 배열
	Cart[] MyProduct = new Cart[10];
	int cartCount = 0;
	Scanner sc = new Scanner(System.in);
//	int productNum;
//	int productCount;
	public void selectProduct() {
		while(true) {
			System.out.println("구매할 상품의 번호를 입력해 주십시오 >>> ");
			int productNum = sc.nextInt();
//			productNum = Integer.parseInt(sc.nextLine()); // 문자형으로 받은 걸 정수로 변형.....?
			System.out.println("상품의 구매 개수를 입력해 주세요 >>> ");
			int productCount = sc.nextInt();
//			productCount = Integer.parseInt(sc.nextLine());  // 문자형으로 받은 걸 정수로 변형
			MyProduct[cartCount++] = new Cart(productNum, productCount);
//		System.out.println("상점에서 상품을 더 구매하시겠습니까?");
//		System.out.println("더 구매를 원하시면 Y, 그만 쇼핑하실려면 N을 입력해 주십시요 >>> ");
//		String selectMore = sc.next();		
//		if(selectMore.equals("Y") || selectMore.equals("y")) {
//			sumPrductCount();
//		}
//		else if(selectMore.equals("N") || selectMore.equals("n")) {
//			break;
//		}
	}
//	public void sumPrductCount() {
//		System.out.println("구매할 상품의 번호를 입력해 주십시오 >>> ");
//		int productNum2 = sc.nextInt();
//		System.out.println("상품의 구매 개수를 입력해 주세요 >>> ");
//		int productCount2 = sc.nextInt();
//		for(int i=0; i<MyProduct.length; i++) {
//			if(i == productNum2) {
//					MyProduct[i] = new Cart(productNum2, +productNum2); 
//			}
//		}
//		System.out.println("상점에서 상품을 더 구매하시겠습니까?");
//		System.out.println("더 구매를 원하시면 Y, 그만 쇼핑하실려면 N을 입력해 주십시요 >>> ");
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
