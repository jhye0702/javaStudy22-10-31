package Ch13_interface11_IShop;

// Product Ŭ������ ��ӹ޴� Ŭ������, ����Ʈ TV�� ��ǰ ������ ����ϴµ� �ʿ�.

public class SmartTV extends Product {
	String resolution;	// �ػ�
	int inchi;	// +++ ��ġ �߰�
	
	public SmartTV (String pname, int price, String resolution, int pnumber, int inchi) {
		// �����ڷ�, ��ǰ �̸��� ����, �ػ� ������ �޾Ƽ� ó��
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
		this.pnumber = pnumber;
		this.inchi = inchi;
	}

	@Override
	public void printExtra() {
		// �߻�Ŭ������ ���� ���ǵ� �߻� �޼��带 �������̵�
		// �߰� ������ �ػ� ������ ���.
		System.out.println("�ػ�: " + resolution);
		System.out.println("��ġ : " + inchi + "��ġ" );
	}
	
}
