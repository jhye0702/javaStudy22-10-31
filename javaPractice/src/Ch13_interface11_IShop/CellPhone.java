package Ch13_interface11_IShop;

// Product �߻� Ŭ������ ��ӹ޾� ������ CellPhone Ŭ����
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
		System.out.println("��Ż�: " + carrier );
		System.out.println("������: " + maker);
	}
	
}
