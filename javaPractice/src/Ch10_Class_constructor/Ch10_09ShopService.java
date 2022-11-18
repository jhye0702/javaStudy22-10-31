package Ch10_Class_constructor;

/*
 * ShopService 객체를 싱글톤으로 만들려고 한다.
 * ShopService의 getInstance() 메서드로 싱클턴을 얻을 수 있도록
 * ShopService 클래스를 작성하라
 */

class ShopService {
	// 객체 생성 방법 1
//	private static ShopService singleton = new ShopService();
//	
//	private ShopService() {	}
//	
//	static ShopService getInstance() {
//		return singleton;
//	}
	
	// 객체 생성 방법 2 ( 너~~~~~~무 중요한건 아님. 하지만 알아두기 )
	private static ShopService singleton = null;
	
	private ShopService() {	}
	
	static ShopService getInstance() {
		if(singleton == null) { // 처음 사용하는 것인지 확인하는 과정을 거친 후
//			singleton = new ShopService(); // 객체 생성..?
		}
		return singleton;
	}
	
}

public class Ch10_09ShopService {
	
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체입니다.");
		}
		
		
		
	}

}
