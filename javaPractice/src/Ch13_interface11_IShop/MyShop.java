package Ch13_interface11_IShop;

import java.util.ArrayList;
import java.util.Scanner;
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
// IShop 인터페이스를 구현한 MyShop 클래스
public class MyShop implements IShop {
	// 등록 회원 정보 배열
	User[] users = new User[2];
	
	// 등록 상품 정보 배열
	Product[] products = new Product[4];
	
	// 상품 추가를 위한 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// 키보드 입력으로 문자열 입력받기 위한 Scanner 객체 생성
	Scanner scan = new Scanner(System.in);
	
	// 선택된 사용자 index 보관
	int selUser;
	
	// 쇼핑몰 이름
	String title;
		
	@Override
	public void setTitle(String title) {	// 쇼핑몰 제목(이름) 설정
		this.title = title;
	}
	
	// 아래와 같이 /**로 시작하는 주석처리시 주석 뒤에 변수명에 마우스 올려두면 설명이 뜹니당
	
	/** 
	 * 프로그램에서 사용하기 위한 예제 사용자 등록 메서드
	 */
	@Override
	public void genUser() {
//		User user = new User("홍길동", PayType.CARD);
//		users[0] = user;
//		user = new User("블로거", PayType.CASH);
//		users[1] = user;
		
		PayType[] payTypes = {PayType.CARD, PayType.CASH};
		System.out.print( "사용자의 이름을 입력하세요 >> ");
		String userName = scan.next();
		System.out.print("결제 수단을 입력하세요. CARD는 [0], CASH는 [1]로 선택하여 입력 >> ");
		int payTypeInt = scan.nextInt();
		
		User user = new User(userName, payTypes[payTypeInt]);
		users[0] = user;
	}
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
	/**
	 * 프로그램에서 사용하기 위한 예제 상품 등록 메서드
	 */
	@Override
	public void genProduct() {
		CellPhone cellPhone = new CellPhone ("갤럭시 노트5", 1000000, "SKT", 1111, "삼성");
		products[0] = cellPhone;
		cellPhone = new CellPhone ("애플 아이폰7", 980000, "KT", 2222, "애플");
		products[1] = cellPhone;
		SmartTV smartTV = new SmartTV ("삼성 3D Smart Tv", 5000000, "4K", 3333, 50);
		products[2] = smartTV;
		smartTV = new SmartTV ("LG Smart Tv", 2500000, "Full HD", 4444, 79);
		products[3] = smartTV;
	}
	
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("============================");
		int i = 0;
		
		// 등록된 사용자 정보 출력
		for(User user : users) {
//			System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getName());
			if (user != null) {
			System.out.println("[" + i++ + "]" + user.getName() + "("+ user.getPayType() +")");
			}
		}
		
		System.out.println("[x] 종 료");
		System.out.print("사용자 번호 선택 : ");
		String sel = scan.next();
		System.out.println("## " +sel+ "선택 ##");
		
		// 선택된 메뉴에 따라 처리
		switch(sel) {
			case "x" :
				System.exit(0);
				break;
			default:
				selUser = Integer.parseInt(sel);
				productList();	// 유저 선택을 하면 자동으로 실행됩니다!
		}
	}
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
		/**
		 * 상품 목록을 보고 상품을 선택해 장바구니에 넣기 위한 메서드
		 */
		public void productList() {
			System.out.println(title + " : 상품 목록 - 상품 선택");
			System.out.println("============================");
			int i = 0;
		// 등록된 상품 정보 출력
		for(Product product : products) {
			System.out.println("["+i+"]");
			product.printDetail();
			i++;
		}
		
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.print("상품 번호 선택 : ");
		String sel = scan.next();
		System.out.println("## " +sel+ "선택 ##");
		
		// 선택된 메뉴에 따라 처리
		switch(sel) {
		case "h" :
			start();
			break;
		case "c" :
			checkOut();
			break;
		default:
			int psel = Integer.parseInt(sel);
			cart.add(products[psel]);
			productList();
		}
	}
	//----------------------------------------------------------------------------
	//----------------------------------------------------------------------------
		/**
		 * 결제 진행을 위한 체크아웃 처리 메서드
		 */
		
		public void checkOut() {
			System.out.println(title + " : 체크아웃");
			System.out.println("============================");
			int total = 0;
			int i = 0;
			
			// 장바구니에 등록된 상품 정보 출력
			for(Product p : cart) {
				System.out.printf("[%d]%s(%s)\n", i++, p.pname, p.price);
				
				total = total + p.price;
			}
			System.out.println("============================");
			
			// 선택한 사용자의 결제 방법 출력
			System.out.println("결제 방법 : " + users[selUser].getPayType());
			
			// 합계 출력
			System.out.println("합계: " +total+ " 원 입니다.");
			System.out.println("[p] 이전, [q] 결제 완료");
			System.out.println("선택 : ");
			String sel = scan.next();
			
			// 선택된 메뉴에 따라 처리
			switch(sel) {
			case "q" : System.out.println("## 결제가 완료되었습니다. 종료합니다 ##");
				System.exit(0); break;
			}
		}
}
