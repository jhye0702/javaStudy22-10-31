package Test_12_02_Teacher;

public class Cart {

	int productID, cnt;
	Cart(int productID, int cnt) {
		this.productID = productID; 	// 상품코드
		this.cnt = cnt;					// 구매개수
	}
	@Override
	public String toString() {
		return "상품 번호 : " + productID + ", 갯수 :" + cnt;
	}
	
	
	
}
