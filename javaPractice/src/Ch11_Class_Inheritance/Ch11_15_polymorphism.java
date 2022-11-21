package Ch11_Class_Inheritance;

public class Ch11_15_polymorphism {

	public static void main(String[] args) {
		
		/*
		 * instanceof ������
		 * a instanceof B : a�� B�� ��ü�̴�
		 */
		
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {			// fe�� FireEngine�� ��ü�̴�.
			System.out.println("This is a FireEngine instance.");
		}
		if(fe instanceof Car1) {				// fe�� Car1�� ��ü�̴�.
			System.out.println("This is a Car1 instance.");
		}
		if(fe instanceof Object) {				// fe�� Object�� ��ü�̴�.
			System.out.println("This is an Object instance.");
		}
		System.out.println();
		
		
		
		Car1 polyFe = new FireEngine();			// ������ ����ؼ� ���� ���� ����
		
		if(polyFe instanceof FireEngine) {		// polyFe�� FireEngine�� ��ü�̴�.
			System.out.println("This is a FireEngine instance.");
		} else { System.out.println("not instance"); }
		if(polyFe instanceof Car1) {			// polyFe�� Car�� ��ü�̴�.
			System.out.println("This is a Car1 instance.");
		}
		if(polyFe instanceof Object) {			// polyFe�� Car�� ��ü�̴�.
			System.out.println("This is an Object instance.");
		}
		System.out.println();
		
		
		
		Car1 car = new Car1();					// �θ� Ŭ������ ��ü ����
		
		if (car instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		} else { System.out.println("not instance"); }
		if(car instanceof Car1) {
			System.out.println("This is a Car1 instance");
		} else { System.out.println("not instance"); }
		if(car instanceof Object) {				// car�� Object�� ��ü�̴�.
			System.out.println("This is an Object instance.");
		}else { System.out.println("not instance"); }
		
	}
}
