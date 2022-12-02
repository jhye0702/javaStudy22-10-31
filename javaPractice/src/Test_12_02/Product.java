package Test_12_02;

public class Product {

	private final int productID;		// ��ǰ �ڵ�
	private final String productName;	// ��ǰ �̸�
	private final int price;			// ����
	
	Product(int productID, String productName, int price) { // �����ڸ� ���� �Է�
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}

	public int getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}
	
}
