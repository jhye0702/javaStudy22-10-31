package Ch11_Class_Inheritance;
/*
 * 속성 : 제조사(maker) 모델이름(model) 색상(color) 현재 속도(curSpeed)
 * 행위 : 가속(speedUp) 감속(speedDown)
 * 
 * 1. 이 속성과 행위 설명을 바탕으로 하는 Car 클래스를 정의하라
 * 단 가속과 감속의 결과는 curSpeed와 연동되어야 한다.
 * 
 * 2. 정의한 Car클래스에 파라미터로 모든 필드를 초기화하는 생성자를 추가하고, 속성이 다른 인스턴스 세개를 생성하라.
 * 
 * 3. Car 클래스를 상속받는 SportCar 클래스를 정의하고, 가속과 감속 메서드를 스포츠카에 맞게 오버라이딩 하라.
 */

class Car {
	private String maker, model, color;
	protected int curSpeed;

	Car(String maker, String model, String color, int curSpeed){
		maker = this.maker;  
		model = this.model;
		color = this.color;  
		curSpeed = this.curSpeed;
	}
	public void speedUp() {
		++this.curSpeed;
	}
	public void speedDown() {
		--this.curSpeed;
	}
}

class SportCar extends Car {
//	public SportCar() {		// 부모 생성자에 기본생성자가 없고 매개 변수가 있는 생성자만 있는 경우, 
//		super();			// 자식 생성자에서도 반드시 부모 생성자 호출을 위해 super(매개값, ...)을 명시적으로 호출해야함.
//	}
//	
	// super(매개값,...)은 반드시 자식 생성자 첫 줄에 위치해야한다.
	public SportCar(String maker, String model, String color, int curSpeed){ 
		super(maker, model, color, curSpeed);
		
	}
		
	@Override
	public void speedUp() {
		curSpeed += 10;
	}

	@Override
	public void speedDown() {
		curSpeed -= 10;
	}
}

public class Ch11_08Car문제 {

	public static void main(String[] args) {
		Car car1 = new Car("현대", "소나타", "검정", 0);
		Car car2 = new Car("테슬라", "모델1", "파랑", 0);
		Car car3 = new Car("아우디", "a6", "회색", 0);
		
//		SportCar sCar = new SportCar();
//		sCar.curSpeed = 80;
//		sCar.speedUp();
//		System.out.println("스포츠카의 현재 속도는 " + sCar.curSpeed + "km/h입니다");
	}

}
