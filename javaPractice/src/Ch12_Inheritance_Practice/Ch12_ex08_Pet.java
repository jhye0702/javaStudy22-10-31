package Ch12_Inheritance_Practice;

public class Ch12_ex08_Pet {
	public static void main(String[] args) {

		// 애완동물 클래스의 이용 예 (다형성의 검증)
		// 다형성의 오버라이딩
		
		Pet kurt;
		kurt = new Pet("Kurt", "아이");
		kurt.introduce(); // 출력 -> ■ 내 이름은 Kurt입니다!	■ 주인님은 아이입니다!
		System.out.println();
		
		RobotPet r2d2 = new RobotPet("R2D2", "루크");
		r2d2.introduce(); // 출력 -> ◇ 저는 로봇입니다. 내 이름은 R2D2입니다! ◇ 주인님은 루크입니다!
		r2d2.work(0);	  // 출력 -> 청소를 합니다.
		System.out.println();
		
		Pet toy = new RobotPet("toy", "아이2");
		toy.introduce(); // (함수명이 같으므로 뒤에 클래스 함수로 실행됨)
						 // ◇ 저는 로봇입니다. 내 이름은 toy입니다! ◇ 주인님은 아이2입니다!
		// toy.work(0);  // 부모인 Pet클래스에 없는 함수라서 실행되지 않습니다
		System.out.println();
		
		Pet p = r2d2; // 값 복사X 참조변수 복사 O
		p.introduce(); // (함수명이 같으므로 r2d2의 뒤에 클래스 함수로 실행됨) 
					   // 출력 -> ◇ 저는 로봇입니다. 내 이름은 R2D2입니다! ◇ 주인님은 루크입니다!
		System.out.println();

		r2d2.setName("아이로봇");
		r2d2.introduce(); // 출력 -> ◇ 저는 로봇입니다. 내 이름은 아이로봇입니다! ◇ 주인님은 루크입니다!
		p.introduce(); // 출력 -> ◇ 저는 로봇입니다. 내 이름은 아이로봇입니다! ◇ 주인님은 루크입니다!
	}
}
