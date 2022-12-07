package Ch18_collection_Member;

public class MemberHashSet_Test {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();

		memberHashSet.addMember(memberLee); // 중복된 객체 저장
		memberHashSet.showAllMember();		// 중복된 겍체는 저장되지 않음
		
		// 아이디 중복된 객체를 저장하지 않으려면 equals(), hashCode() 메서드를 오버라이딩 해야함.
		Member memberHong = new Member(1003, "홍길동"); 
		// 1003 아이디 중복 회원 추가 
		// 동일한 주소값이 아니라서 아이디가 같아서 중복되도 저장이 됨.
		// 아이디 
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}

}
