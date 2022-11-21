package Ch11_Class_Inheritance;

class Car2 {
	// �����ڰ� ������ �ڵ����� �Ű������� ���� �����ڰ� ���������,
	// �����ڸ� �����ϸ� �Ű������� ���� �����ڰ� ��������� ����.
	int wheel;
	int speed;
	String color;
	
	public Car2(String color) {
		this.color = color;
	}
	
}
class SportsCar extends Car2 {
	int speedLimit;		// ���� �ӵ� km
	
	SportsCar(String color, int speedLimit){
		// �ڽ� Ŭ������ ��ü�� ��������� �ڽ� Ŭ������ �����ڰ� �ڵ����� ������ �ǰ�,
		// �ڽ� Ŭ������ �����ڰ� ����Ǳ� ���� �θ� Ŭ������ �����ڰ� �ڵ����� ����.
		// �θ� Ŭ������ �����ڸ� �ڵ����� ������, �θ� Ŭ������ �Ű������� ���� �����ڰ� �ڵ����� ����.
		
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
