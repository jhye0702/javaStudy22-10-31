package Test_12_02;

public class Cart {

	int productID, cnt;
	Cart(int productID, int cnt) {
		this.productID = productID; 	// ��ǰ�ڵ�
		this.cnt = cnt;					// ���Ű���
	}
	@Override
	public String toString() {
		return "��ǰ ��ȣ : " + productID + ", ���� :" + cnt;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	
}
