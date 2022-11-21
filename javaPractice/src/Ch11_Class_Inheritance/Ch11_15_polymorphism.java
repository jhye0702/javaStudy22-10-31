package Ch11_Class_Inheritance;

public class Ch11_15_polymorphism {

	public static void main(String[] args) {
		
		/*
		 * instanceof 연산자
		 * a instanceof B : a는 B의 객체이다
		 */
		
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {			// fe는 FireEngine의 객체이다.
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car1) {				// fe는 Car1의 객체이다.
			System.out.println("This is a Car1 instance.");
		}
		if(fe instanceof Object) {				// fe는 Object의 객체이다.
			System.out.println("This is an Object instance.");
		}
		System.out.println();
		
		
		
		Car1 polyFe = new FireEngine();			// 다형성 사용해서 참조 변수 만듦
		
		if(polyFe instanceof FireEngine) {		// polyFe는 FireEngine의 객체이다.
			System.out.println("This is a FireEngine instance.");
		} else { System.out.println("not instance"); }
		if(polyFe instanceof Car1) {			// polyFe는 Car의 객체이다.
			System.out.println("This is a Car1 instance.");
		}
		if(polyFe instanceof Object) {			// polyFe는 Car의 객체이다.
			System.out.println("This is an Object instance.");
		}
		System.out.println();
		
		
		
		Car1 car = new Car1();					// 부모 클래스로 객체 생성
		
		if (car instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		} else { System.out.println("not instance"); }
		if(car instanceof Car1) {
			System.out.println("This is a Car1 instance");
		} else { System.out.println("not instance"); }
		if(car instanceof Object) {				// car는 Object의 객체이다.
			System.out.println("This is an Object instance.");
		}else { System.out.println("not instance"); }
		
	}
}
