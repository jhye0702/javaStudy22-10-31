package Ch14_innerclass;
/*
 static 내부 클래스의 정의
 내부 클래스가 static으로 지정된 클래스
 내부 클래스의 멤버가 static 으로 지정되었으면 내부 클래스도 반드시 static 으로 지정해야 됨
 */

// MyOuter3.Inner.getuserInfo()을 호출해서 아래 내용이 출력되도록 main() 메서드 작성
// '고객 정보 >> 주소는 : 세종시 세종구, 전화번호 : 010-1111-2222'

class MyOuter3 {
	private String name;
	private int age;
	
	public MyOuter3 (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() { return name; }
	public int getAge() { return age; }
	
	//============================ 내부 클래스 ================================
	
	static class Inner {
		private String address;
		static String tel = "010-111-2222";
		
		public Inner(String address) {
			this.address = address;
		}
		public String getUserInfo() {
			// static 내부 클래스에서 외부 클래스의 멤버 변수에 접근은 불가능 하다
			// return name + " " + age;
			return "주소는 : " + address + ", 전화번호 : " + tel;
		}
	} // end Inner_class
}// end Outer_class

public class Ch14_06 {
	public static void main(String[] args) {
		MyOuter3.Inner inner = new MyOuter3.Inner("세종시 세종구");
		
		System.out.println("고객 정보 >> " +inner.getUserInfo());
	}
}
