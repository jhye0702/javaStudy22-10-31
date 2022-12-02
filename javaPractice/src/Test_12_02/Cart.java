package Test_12_02;

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
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	
}
