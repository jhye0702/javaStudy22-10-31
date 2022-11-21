package Ch11_Class_Inheritance;

public class Ch11_02_Test {

	public static void main(String[] args) {

		Ch11_02_GeneralChick2 generalChick = new Ch11_02_GeneralChick2();
		// generalChick 은 아무것도 없이 상속받는게 전부!
		generalChick.display();
		Ch11_02_RedChick redChick = new Ch11_02_RedChick();
		redChick.display();
		// redChick 은 아무것도 없이 상속받는게 전부!
		System.out.println(redChick.x);		// 부모 생성자가 자동으로 실행
	}

}
