package Ch18_collection_Membership;

import java.util.Objects;

//Member 객체를 중복없이 저장하는 HashSet
// hashCode()와 equals() 메소드를 재정의하지 않으면 저장된 객체가 2개

public class MemberShip {
	
	public String name;
	public int age;
	
	public MemberShip(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// hashCode()와 equals() 메소드 재정의

	@Override
	public boolean equals(Object obj) { // name과 age값이 같으면 true 리턴
		// name과 age 값이 같으면 true 반환
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
		// equals를 먼저 적었더라도 hashCode부터 확인합니다 !
		// name과 age 값이 같으면 동일한 hashCode 반환
		// age는 원래 int
		// name은 String 자료형이니까 동일한 문자에 hashCode실행하면 동일한 해시코드 나오도록 함.
//		 set은 미리 hashCode() 를 받아둔다...????
		return name.hashCode() + age; // String의 hashCode() 이용
	}
	
	
	
	
}
