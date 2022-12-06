package Ch16_package.object;

/*
 ������ �������� �����ϸ� ���� ���簡 �Ǳ� ������ ���� ����� ����Ŵ.
 �������� �纻�� ���� ���� clone() �޼��带 ���.
 ������ �纻�� ����� ���纻�� ����
 */

class Point { // ������ �ǹ��ϴ� Point Ŭ����
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
}

//��ü�� �����ص� �ȴٴ� �ǹ̷� Cloneable �������̽��� �Բ� ����
class Circle implements Cloneable{  
	// Cloneable�� �����ؾ� ���� ����.
	Point point;
	int radius;
	
	Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	public String toString() {
		return "������ " +point+ "�̰�, �������� " +radius+ "�Դϴ�.";
	}
	@Override
	// clone() �޼��带 ����� �� �߻��� �� �ִ� ������ ���� ó����.
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class Ch16_09_clone {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 Object clone() : ��ü�� �����Ͽ� ������ ��� ������ ���� �ν��Ͻ��� ����.
		 ��ü�� ������ �Ǵٸ� ��ü�� ��ȯ.
		 ��ü ������ �����س��� ���纻�� ����Ѵٰų�, �⺻Ʋ(prototype)�� ���纻�� �����
		 ������ �ν��Ͻ��� ����� ������ ���������� ������ �Ϸ��� ��� ���.
		 */
		
		// clone() �޼���� �ν��Ͻ� �����ϱ�
		Circle circle = new Circle(10, 20, 30);
		// clone() �޼��带 ����� circle �ν��Ͻ��� copyCircle�� ������.
		Circle copyCircle = (Circle)circle.clone(); //(Circle)�� �ٴ� �� ��ȯ���� Object�� ������ 
		
		// ���� ����
		System.out.println(circle); // ������  x=10, y=20�̰�, �������� 30�Դϴ�.
		System.out.println(copyCircle); // ������ x=10, y=20�̰�, �������� 30�Դϴ�.
		
		// �ּҰ��� �ٸ�
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}

}
