package Test_12_02_Teacher;

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
	
	
	
}
