package Ch12_Inheritance_Practice;

import java.util.ArrayList;
/*
 * 환불 기능을 추가하기 위해 배열에서 ArrayList로 저장되는 데이터 타입을 변경
 */

class Buyer2 {
		int money = 1000;
		int bonusPoint = 0;
		ArrayList item = new ArrayList();	// 구입한 제품을 저장하는데 사용할 ArrayList 객체
		
		void buy(Product p) {
			if(money < p.price) {
				System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
				return;
			}
			money -= p.price;				// 가진 돈에서 구입한 제품의 가격을 뺀다.
			bonusPoint += p.bonusPoint;		// 제품의 보너스 점수를 추가한다.
			item.add(p);					// 구입한 제품을 ArrayList 저장한다.
			System.out.println(p + "을/를 구입하셨습니다.");
		}
		void refund(Product p) {			// 구입한 제품을 환불한다.
			if(item.remove(p)) {			// 제품을 ArrayList에서 제거한다.
				money += p.price;			
				bonusPoint -= p.bonusPoint;
				System.out.println(p + "을/를 반품하셨습니다.");
			}
			else {
				System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
				return;
			}
			
		}
		void summary() {				// 구매한 물품에 대한 정보를 요약해서 보여준다.
			int sum = 0;				// 구입한 물품들의 가격 합계
			String itemList = "";		// 구입한 물품 목록
			// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
			
			if(item.isEmpty()) {
				System.out.println("구입하신 제품이 없습니다.");
				return;
			}
			
			// Vector 의 i번째에 있는 객체를 얻어온다.
			for (int i = 0; i < item.size(); i++) {
				Product p = (Product)item.get(i);
				sum += p.price;
				itemList += (i==0)? "" + p : ", " + p;
			}
			System.out.println("구입하신 물품의 총금액은 " + sum + "만원 입니다.");
			System.out.println("구입하신 제품은 " + itemList + " 입니다.");
		}
}

public class Ch12_ex10_Product수정_ArrayList {
}
