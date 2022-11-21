package Ch11_Class_Inheritance;

class User {
	private String name;
	private int age;
	
	User(String name, int age){ // 매개변수를 가진 생성자
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
//		if(age < 100) {
			this.age = age;
//		}
	}
	
}

public class Ch11_10_private {

	public static void main(String[] args) {
		User user1 = new User("철수", 20); // 인스턴스 생성
		User user2 = new User("영희", 19); // 인스턴스 생성
		
		System.out.println(user1.getName() + "의 나이는 " + user1.getAge());
//		user2.age = 1000; // private로 접근에 제한이 되고 있으므로 1000을 그냥 적용하는 것은 불가능 함.
//		user2.setAge(1000);
		System.out.println(user2.getName() + "의 나이는 " + user2.getAge());
	}
}
