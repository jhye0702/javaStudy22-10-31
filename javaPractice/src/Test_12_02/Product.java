package Test_12_02;

public class Product {

	private final int productID;		// 상품 코드
	private final String productName;	// 상품 이름
	private final int price;			// 가격
	
	Product(int productID, String productName, int price) { // 생성자를 통해 입력
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
