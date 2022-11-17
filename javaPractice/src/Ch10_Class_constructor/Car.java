package Ch10_Class_constructor;

public class Car {

	String color;		// ����
	String gearType;	// ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;			// ���� ����
	
	Car() {	
		this("white", "auto", 4);
	}
	Car(String color) {
		this(color, "auto", 4);
	}
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	Car(Car c) {					// �ν��Ͻ��� ���縦 ���� ������.
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
}
