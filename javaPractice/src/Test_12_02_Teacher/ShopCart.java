package Test_12_02_Teacher;

import java.util.Scanner;

public class ShopCart {

	// 장바구니에 저장가능한 최대 개수 10개인 배열
	Scanner sc = new Scanner(System.in);
	Cart[] carts = new Cart[10];
	int cntCart = 0;

	public void selectProduct() {
		int prductID, cnt;
		
		do {
			System.out.print("구매할 상품의 번호를 입력해 주십시오 >>> ");
			prductID = sc.nextInt(); // 구매할 상품 번호
			System.out.print("상품의 구매 개수를 입력해 주세요 >>> ");
			cnt = sc.nextInt();
			
			carts[cntCart++] = new Cart(prductID, cnt); 
		}
		while (confirmReShopping()); // while문이 true여야 do를 또 실행한다.
	}
	
	boolean confirmReShopping() {
		while(true)	{
			System.out.print("상점에서 상품을 더 구매하시겠습니까?");
			System.out.print("더 구매를 원하시면 Y, 그만 쇼핑하실려면 N을 입력해 주십시요 >>> ");
			String answer = sc.next();		
			if(answer.equals("Y") || answer.equals("y")) {
				return true;
			}
			else if(answer.equals("N") || answer.equals("n")) {
				return false;
			}
			else {
				System.out.println("잘못된 입력입니다.");
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
