package Ch10_Class_constructor;

public class Ch10_02Car2 {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.color = "green";
		Car car2 = new Car(car1);	// c1�� ���纻 c2�� �����Ѵ�.
		System.out.println("c1�� color=" + car1.color + ", gearType="
							+ car1.gearType + ", door=" + car1.door);
		System.out.println("c2�� color=" + car2.color + ", gearType="
							+ car2.gearType + ", door=" + car2.door);
		
		car1.door = 100;
		System.out.println("c1.door=100; ���� ��");
		System.out.println("c1�� color=" + car1.color + ", gearType="
							+ car1.gearType + ", door=" + car1.door);
		System.out.println("c2�� color=" + car2.color + ", gearType="
							+ car2.gearType + ", door=" + car2.door);
	}

}