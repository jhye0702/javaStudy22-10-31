package Ch11_Class_Inheritance;
/*
 * �Ӽ� : ������(maker) ���̸�(model) ����(color) ���� �ӵ�(curSpeed)
 * ���� : ����(speedUp) ����(speedDown)
 * 
 * 1. �� �Ӽ��� ���� ������ �������� �ϴ� Car Ŭ������ �����϶�
 * �� ���Ӱ� ������ ����� curSpeed�� �����Ǿ�� �Ѵ�.
 * 
 * 2. ������ CarŬ������ �Ķ���ͷ� ��� �ʵ带 �ʱ�ȭ�ϴ� �����ڸ� �߰��ϰ�, �Ӽ��� �ٸ� �ν��Ͻ� ������ �����϶�.
 * 
 * 3. Car Ŭ������ ��ӹ޴� SportCar Ŭ������ �����ϰ�, ���Ӱ� ���� �޼��带 ������ī�� �°� �������̵� �϶�.
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
//	public SportCar() {		// �θ� �����ڿ� �⺻�����ڰ� ���� �Ű� ������ �ִ� �����ڸ� �ִ� ���, 
//		super();			// �ڽ� �����ڿ����� �ݵ�� �θ� ������ ȣ���� ���� super(�Ű���, ...)�� ��������� ȣ���ؾ���.
//	}
//	
	// super(�Ű���,...)�� �ݵ�� �ڽ� ������ ù �ٿ� ��ġ�ؾ��Ѵ�.
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

public class Ch11_08Car���� {

	public static void main(String[] args) {
		Car car1 = new Car("����", "�ҳ�Ÿ", "����", 0);
		Car car2 = new Car("�׽���", "��1", "�Ķ�", 0);
		Car car3 = new Car("�ƿ��", "a6", "ȸ��", 0);
		
//		SportCar sCar = new SportCar();
//		sCar.curSpeed = 80;
//		sCar.speedUp();
//		System.out.println("������ī�� ���� �ӵ��� " + sCar.curSpeed + "km/h�Դϴ�");
	}

}
