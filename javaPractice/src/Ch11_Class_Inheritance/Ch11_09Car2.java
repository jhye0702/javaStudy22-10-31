package Ch11_Class_Inheritance;

class Car2 {
	// 생성자가 없으면 자동으로 매개변수가 없는 생성자가 만들어지고,
	// 생성자를 정의하면 매개변수가 없는 생성자가 만들어지지 않음.
	int wheel;
	int speed;
	String color;
	
	public Car2(String color) {
		this.color = color;
	}
	
}
class SportsCar extends Car2 {
	int speedLimit;		// 제한 속도 km
	
	SportsCar(String color, int speedLimit){
		// 자식 클래스의 객체가 만들어지면 자식 클래스의 생성자가 자동으로 실행이 되고,
		// 자식 클래스의 생성자가 실행되기 전에 부모 클래스의 생성자가 자동으로 실행.
		// 부모 클래스의 생성자를 코딩하지 않으면, 부모 클래스의 매개변수가 없는 생성자가 자동으로 실행.
		
		super(color);
		//this.color = color;
		this.speedLimit = speedLimit;
	}
}

public class Ch11_09Car2 {

	public static void main(String[] args) {
		SportsCar sportsCar = new SportsCar("red", 330);
		
		System.out.println(sportsCar.color);
		System.out.println(sportsCar.speedLimit);
	}
}
