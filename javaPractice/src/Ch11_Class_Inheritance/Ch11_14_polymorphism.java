package Ch11_Class_Inheritance;

class Car1{
	String color;
	int door;
	
	void drive() {		// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	void stop() {		// 멈추는 기능
		System.out.println("stop!!");
	}
}
class FireEngine extends Car1 {  	// 소방차
	void water() {		// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}

public class Ch11_14_polymorphism {

	public static void main(String[] args) {
		
		/* 다형성과 형변환
		 * 자식 타입에서 부모 타입으로는 자동 형 변환이 되지만 부모에서 자식 타입으로는 명시적 형변환.
		 */
		
		Car1 car;
		FireEngine fe = new FireEngine();
		FireEngine fe2;
		
		fe.water();
		car = fe;		// 상속관계에 있기 때문에 이렇게 적을 수 있음. // car = (Car)fe; 에서 형 변환이 생략된 형태
		//car.water();	//	Car타입의 참조변수로는 water()를 호출할 수 없음.
		fe2 = (FireEngine)car;	// 부모타입에서 자식타입으로 대입할 때는 형 변환을 해줘야함.
		fe2.water();
		
		}
}
