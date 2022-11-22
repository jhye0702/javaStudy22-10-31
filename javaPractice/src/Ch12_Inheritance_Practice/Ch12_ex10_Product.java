package Ch12_Inheritance_Practice;

import java.util.ArrayList;
/*
 * 환불 기능을 추가하기 위해 배열에서 ArrayList로 저장되는 데이터 타입을 변경
 */

//=============================== Product ===============================
class Product {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품 구매시 제공하는 보너스 점수
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);		// 보너스 점수는 제품 가격의 10%
	}
}
//=============================== Tv ===============================
class Tv extends Product {
	Tv() {
		// 조상 클래스의 생성자 Product(int price)를 호출한다.
		super(100);			// Tv의 가격을 100만원으로 한다.
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
//=============================== Computer ===============================
class Computer extends Product {
	Computer() {
		// 조상 클래스의 생성자 Product(int price)를 호출한다.
		super(200);			// Computer의 가격을 200만원으로 한다.
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
//=============================== Buyer 첫번째 ===============================

//class Buyer { // 고객, 물건을 사는 사람
//	int money = 1000;						// 소유 금액
//	int bonusPoint = 0;						// 보너스 점수
//
//	/*
//	 * 수정 : 1) 구매한 물품을 저장하는 기능 추가
//	 * 		 2) 구매한 물품에 대한 정보를 요약해서 보여주는 기능 추가 
//	 */
//	
//	Product[] item = new Product[10];	// 구입한 제품을 저장하기 위한 배열
//	int i = 0;							// Product배열에 사용될 카운터 (구입한 제품 갯수 확인, 내가 저장해야할 물건 갯수 확인)
//	
//	
//	// 제품 구매 / 제품값 차감 / 보너스 점수 추가  / 구매갯수, 구매목록 저장
//	void buy(Product p) {	// 부모 클래스 타입으로 매개변수 받음.
//		//부모 클래스의 필드 사용. price, bonusPoint
//		if(money < p.price) {
//			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
//			return;
//		}
//		
//		money -= p.price;				// 가진 돈에서 구입한 제품의 가격을 뺀다.
//		bonusPoint += p.bonusPoint;		// 제품의 보너스 점수를 추가한다.
//		item[i++] = p;					// 제품을 Product[] item에 저장한다.
//		
//		System.out.println(p + "을/를 구입하셨습니다.");
//	}
//	
//	// 메소드 추가
//	void summary() {					// 구매한 물품에 대한 정보를 요약해서 보여준다.
//		int sum = 0;					// 구입한 물품들의 가격 합계
//		String itemList = "";			// 구입한 물품 목록
//		// 1. ---------------------------------- 기본 for문에서 i 반복구간을 i < this.i; 로 지정 
//		//-------------------------------------- (코딩 테스트시 이렇게 하는게 점수가 높음)
//		for(int i=0; i < this.i; i++) {
//			sum += item[i].price;
//			itemList += (item[i] + " ");
//		}
//		// 2. ---------------------------------- forEach문을 쓰면
////		for(Product p: item) {
////			if (p == null) {
////				break;
////			}
////			sum += p.price;
////			itemList += p + ", ";
////		}
//		
//		// 3. ---------------------------------- 기본 for문을 쓰면 i 반복구간을 item.length;로 지정
////		for (int i = 0; i < item.length; i++) {
////			if(item[i] == null)
////				break;
////			sum += item[i].price;
////			itemList += item[i] + ", ";
////		}
//		System.out.println("구입하신 물품의 총금액은 " + sum + "만원 입니다.");
//		System.out.println("구입하신 제품은 " + itemList + " 입니다.");
//	}
//}


/*
 * 환불 기능을 추가하기 위해 배열에서 ArrayList로 저장되는 데이터 타입을 변경
 */
//=============================== Buyer 첫번째 ===============================
class Buyer {
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



	
//=============================== 메인 함수 ===============================
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
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점 입니다.");
				
				
				
	}
}