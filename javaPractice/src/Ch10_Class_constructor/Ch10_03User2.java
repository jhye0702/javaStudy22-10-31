package Ch10_Class_constructor;

class User_A {
	private String name;
	private int age;
	
	User_A(String name, int age) {	// 매개변수를 가진 생성자
		this.name = name;
		this.age = age;
	}
	public int getAge() { // private는 함부로 값변경 못함. 하려면 메서드를 통해서 해야함
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
}

public class Ch10_03User2 {

	public static void main(String[] args) {
		User_A user1 = new User_A ("철수", 20);		// 인스턴스 생성
		User_A user2 = new User_A ("영희", 19);		// 인스턴스 생성
		
		// user2.age = 99; // 에러발생. 직접적 접근 불가
		
		user2.setAge(20);
		System.out.println(user2.getName() + "의 나이는 " + user2.getAge());
		
	}

}
