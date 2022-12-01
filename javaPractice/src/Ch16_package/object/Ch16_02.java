package Ch16_package.object;

/*
 * Member Ŭ�������� id�� �̸�, ����ó�� �����ϴ� �ʵ尡 �ִ�.
 * Member Ŭ������ �ۼ��ϵ�, Object �� toString() �޼��带 �������ؼ� �Ʒ��� ���� �������� �ۼ��϶�.
 * 
 * ���� ���:
 * blue : ���Ķ�
 */
class Member {
	String id, name, phone;
	
	Member(String id, String name, String phone){
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + " : " + name;
	}
	
}

public class Ch16_02 {

	public static void main(String[] args) {
//		member�� ������ Ÿ���� Ŭ����Ÿ�������� �ڵ����� println �� �����鼭 ���ڿ�ȭ�� �˴ϴ�.
		
		Member member = new Member ("blue", "���Ķ�", "010-1234-5678");
		System.out.println(member);
	}

}
