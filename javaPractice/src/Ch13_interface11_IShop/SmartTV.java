package Ch13_interface11_IShop;

// Product 클래스를 상속받는 클래스로, 스마트 TV의 제품 정보를 등록하는데 필요.

public class SmartTV extends Product {
	String resolution;	// 해상도
	int inchi;	// +++ 인치 추가
	
	public SmartTV (String pname, int price, String resolution, int pnumber, int inchi) {
		// 생성자로, 상품 이름과 가격, 해상도 정보를 받아서 처리
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
		this.pnumber = pnumber;
		this.inchi = inchi;
	}

	@Override
	public void printExtra() {
		// 추상클래스에 의해 정의된 추상 메서드를 오버라이딩
		// 추가 정보인 해상도 정보를 출력.
		System.out.println("해상도: " + resolution);
		System.out.println("인치 : " + inchi + "인치" );
	}
	
}
