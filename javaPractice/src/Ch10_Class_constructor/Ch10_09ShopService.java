package Ch10_Class_constructor;

/*
 * ShopService ��ü�� �̱������� ������� �Ѵ�.
 * ShopService�� getInstance() �޼���� ��Ŭ���� ���� �� �ֵ���
 * ShopService Ŭ������ �ۼ��϶�
 */

class ShopService {
	// ��ü ���� ��� 1
//	private static ShopService singleton = new ShopService();
//	
//	private ShopService() {	}
//	
//	static ShopService getInstance() {
//		return singleton;
//	}
	
	// ��ü ���� ��� 2 ( ��~~~~~~�� �߿��Ѱ� �ƴ�. ������ �˾Ƶα� )
	private static ShopService singleton = null;
	
	private ShopService() {	}
	
	static ShopService getInstance() {
		if(singleton == null) { // ó�� ����ϴ� ������ Ȯ���ϴ� ������ ��ģ ��
//			singleton = new ShopService(); // ��ü ����..?
		}
		return singleton;
	}
	
}

public class Ch10_09ShopService {
	
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("���� ShopService ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
		}
		
		
		
	}

}
