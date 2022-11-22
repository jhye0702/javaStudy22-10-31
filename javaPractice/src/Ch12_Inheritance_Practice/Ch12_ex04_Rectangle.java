package Ch12_Inheritance_Practice;

/*
 * �Ϲ����� �簢���� ��Ÿ���� Rectangle Ŭ������ �ִ�.
 * Rectangle Ŭ������ ��ӹ޾Ӽ� ���� �ִ� �簢���� ��Ÿ���� ColorRectangle Ŭ������ �������Ѵ�.
 * ColorRectangle Ŭ������ ������ ��Ÿ���� �ʵ� color �� �߰��ȴ�.
 * ColorRectangle Ŭ������ �����ڸ� �ۼ��϶�
 */

class Rectangle {
	int width, height;
	
	public Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
		}
}

class ColorRectangle extends Rectangle {
	String color;
	
	ColorRectangle(int width, int height, String color){
		super(width, height);
		this.color = color;
		
	}
}

public class Ch12_ex04_Rectangle {

	public static void main(String[] args) {
		ColorRectangle obj = new ColorRectangle(100, 100, "blue");
		System.out.println("���� : " + obj.width); 		// ���-> ���� : 100
		System.out.println("���� : " + obj.height); 		// ���-> ���� : 100
		System.out.println("���� : " + obj.color); 		// ���-> ���� : 100
	}

}
