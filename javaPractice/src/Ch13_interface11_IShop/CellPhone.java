package Ch13_interface11_IShop;

// Product 추상 클래스를 상속받아 구현한 CellPhone 클래스
public class CellPhone extends Product {
	String carrier;
	String maker;
	
	public CellPhone(String pname, int price, String carrier, int pnumber, String maker) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
		this.pnumber = pnumber;
		this.maker = maker;
	}

	@Override
	public void printExtra() {
		System.out.println("통신사: " + carrier );
		System.out.println("제조사: " + maker);
	}
	
}
