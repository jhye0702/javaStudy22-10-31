package Ch11_Class_Inheritance;

class User {
	private String name;
	private int age;
	
	User(String name, int age){ // �Ű������� ���� ������
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
		User user1 = new User("ö��", 20); // �ν��Ͻ� ����
		User user2 = new User("����", 19); // �ν��Ͻ� ����
		
		System.out.println(user1.getName() + "�� ���̴� " + user1.getAge());
//		user2.age = 1000; // private�� ���ٿ� ������ �ǰ� �����Ƿ� 1000�� �׳� �����ϴ� ���� �Ұ��� ��.
//		user2.setAge(1000);
		System.out.println(user2.getName() + "�� ���̴� " + user2.getAge());
	}
}
