package Ch10_Class_constructor;

class User_A {
	private String name;
	private int age;
	
	User_A(String name, int age) {	// �Ű������� ���� ������
		this.name = name;
		this.age = age;
	}
	public int getAge() { // private�� �Ժη� ������ ����. �Ϸ��� �޼��带 ���ؼ� �ؾ���
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
		User_A user1 = new User_A ("ö��", 20);		// �ν��Ͻ� ����
		User_A user2 = new User_A ("����", 19);		// �ν��Ͻ� ����
		
		// user2.age = 99; // �����߻�. ������ ���� �Ұ�
		
		user2.setAge(20);
		System.out.println(user2.getName() + "�� ���̴� " + user2.getAge());
		
	}

}
