package Ch09_Class;

class Cellphone {
	String model = "Galaxy 8";
	String color;
	int capacity;
	
	Cellphone(String color, int capacity) { // => 매개 변수가 있는 생성자 
											// this를 빼면 위의 클래스의 String color;인지???? 생성자의 String color; 인지???? 
		this.color = color;					// this는 객체를 뜻함. this.color => 객체 변수의 color를 말함. 즉, 클래스의 color !!
											// 구분이 안간다! 범위가 다를 때 부딪힌 경우 )
		this.capacity = capacity;
	/*
	 * 생성자의 특징
	 * 1) 클래스의 이름과 같다. 		2) 반환형이 없다. 		3) 인스턴스 생성시 단 한번만 자동 실행된다.
	 * 
	 * 생성자를 정의하지 않으면 void 생성자가 기본으로 제공
	 * 생성자를 정의하면 자바가 제공이 되는 void 생성자가 사라짐
	 * void 생성자를 사용하려면 따로 정의를 내려줘야함
	 */
	}
}


public class Ch09_16 {

	public static void main(String[] args) {

		//Cellphone myphone1 = new Cellphone(); // 에러 발생 Cellphone이 매개변수가 없는 생성자가 아니기 때문,,?
		Cellphone myphone = new Cellphone("Silver", 64);
		
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
	}

}
