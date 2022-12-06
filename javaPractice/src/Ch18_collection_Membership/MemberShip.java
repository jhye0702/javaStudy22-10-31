package Ch18_collection_Membership;

import java.util.Objects;

//Member ��ü�� �ߺ����� �����ϴ� HashSet
// hashCode()�� equals() �޼ҵ带 ���������� ������ ����� ��ü�� 2��

public class MemberShip {
	
	public String name;
	public int age;
	
	public MemberShip(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// hashCode()�� equals() �޼ҵ� ������

	@Override
	public boolean equals(Object obj) { // name�� age���� ������ true ����
		// name�� age ���� ������ true ��ȯ
		if (obj instanceof MemberShip) {
			MemberShip memberShip = (MemberShip) obj;
			return memberShip.name.equals(name) && (memberShip.age == age);
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() { 
		// equals�� ���� �������� hashCode���� Ȯ���մϴ� !
		// name�� age ���� ������ ������ hashCode ��ȯ
		// age�� ���� int
		// name�� String �ڷ����̴ϱ� ������ ���ڿ� hashCode�����ϸ� ������ �ؽ��ڵ� �������� ��.
//		 set�� �̸� hashCode() �� �޾Ƶд�...????
		return name.hashCode() + age; // String�� hashCode() �̿�
	}
	
	
	
	
}
