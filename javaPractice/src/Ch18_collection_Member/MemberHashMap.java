package Ch18_collection_Member;

import java.util.HashMap;
import java.util.Iterator;


public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;	// HashMap 선언
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>(); // HashMap 객체 생성
	}
	
	public void addMember(Member member) {			// 회원 추가.
		hashMap.put(member.getMemberID(), member); 	// key-value 쌍으로 추가
	}
	
	public boolean removeMember(int memberId) { // 회원을 삭제하는 메서드.
		if(hashMap.containsKey(memberId)) {		// HashMap에 매개변수로 받은 키 값인 회원 아이디가 있다면
			hashMap.remove(memberId);			// 해당 회원 삭제 (HashMap은 반복문 돌리지 않아도 됨)
			return true;
		}
		System.out.println(memberId + " 가 존재하지 않습니다!");
		return false;
	}
	
	public void showAllMember() { // iterator를 사용해서 전체 회원을 출력하는 메서드
		Iterator<Integer> ir = hashMap.keySet().iterator(); 
		while (ir.hasNext()) { // 다음 key가 있다면
			int key = ir.next(); // key값을 가져와서
			Member member = hashMap.get(key); // key로 부터 value가져오기.
			System.out.println(member);
		}
		System.out.println();
	}
}
// *** Hash Map ***
//Map 인터페이스를 구현한 대표적인 Map 컬렉션
//HashMap 의 키로 사용할 객체는 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야함.
//
//객체가 달라도 동등 객체라면!!  같은 키로 간주하고 중복저장되지 않도록 하기 위함
//동등 객체의 조건은  hashCode()의 리턴값이 같아야하고, equals() 메소드가 true를 리턴해야함.
//
//주로 키 타입은 String을 많이 사용하는데, String은 문자열이 같을 경우,
//동등 객체가 될 수 있도록 hashCode()와 equals() 메소드가 재정의 되어있음.
