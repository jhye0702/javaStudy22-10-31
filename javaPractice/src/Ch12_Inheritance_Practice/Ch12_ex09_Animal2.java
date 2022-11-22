package Ch12_Inheritance_Practice;

class Animal2{
	void breath() {
		System.out.println("숨쉬기");
	}
}
class Lion extends Animal2{
	@Override // Object의 toSting(); 메서드를 재정의한다는 것.
	public String toString() {
		return "사자";
	}
}
class Rabbit extends Animal2{
	@Override
	public String toString() { // 동물 클래스를 상속한 토끼 클래스
		return "토끼";
	}
}
class Monkey extends Animal2{
//	@Override
//	public String toString() { // 동물 클래스를 상속한 원숭이 클래스
//		return "원숭이";
//	}
}
class Zookeeper {  				// 사육사 클래스
	void feed(Animal2 animal) {	// 먹이주는 메서드
		System.out.println(animal + "에게 먹이 주기");
	}
}
	// 아래와 같은 메서드를 일일이 적지 않고 위에 클래스 Zookeeper 처럼 하나로 만들 수 있음
//	void feed(Rabbit rabbit) {	// 토끼에게 먹이주는 메서드
//		System.out.println(rabbit + "에게 먹이 주기");
//	}
//	void feed(Monkey monkey) {	// 원숭이에게에게 먹이주는 메서드
//		System.out.println(monkey + "에게 먹이 주기");
//	}
// }


public class Ch12_ex09_Animal2 {
		
	public static void main(String[] args) {
		Zookeeper james = new Zookeeper();	// james 라는 이름의 사육사 인스턴스 생성
		Animal2 lion = new Lion();			// Lion 인스턴스 생성
		james.feed(lion);					// james 가 lion 에게 고기 주기
		Animal2 rabbit = new Rabbit();		// Rabbit 인스턴스 생성
		james.feed(rabbit);					// james 가 rabbit 에게 먹이 주기
		Animal2 monkey = new Monkey();		// Monkey 인스턴스 생성
		james.feed(monkey);					// james 가 monkey 에게 먹이 주기
 
		// 각 Lion Rabbit Monkey 클래스는 toString을 Object에서 상속받았기 때문에
		// Object를 같이 상속받는 Animal2 에도 상속되고 있으므로 실행될 수 있음.
	
	}
}


// toString
// 객체의 문자 정보를 리턴
// 객체의 문자 정보 : 객체를 문자열로 표현한 값
// 기본적으로 Object 클래스의 toString(); --> "클래스명 @16진수의 해시코드" 로 구성된 문자 정보를 리턴
// 
