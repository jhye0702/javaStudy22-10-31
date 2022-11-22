package Ch12_Inheritance_Practice;

/*
 * 일반적인 사각형을 나타내는 Rectangle 클래스가 있다.
 * Rectangle 클래스를 상속받앙서 색이 있는 사각형을 나타내는 ColorRectangle 클래스르 ㄹ정의한다.
 * ColorRectangle 클래스는 색상을 나타내는 필드 color 가 추가된다.
 * ColorRectangle 클래스와 생성자를 작성하라
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
		System.out.println("가로 : " + obj.width); 		// 출력-> 가로 : 100
		System.out.println("세로 : " + obj.height); 		// 출력-> 세로 : 100
		System.out.println("색상 : " + obj.color); 		// 출력-> 색상 : 100
	}

}
