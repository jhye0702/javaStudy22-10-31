package Ch18_collection_Member;

public class MemberTreeSet_Test {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "박서원");
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		// 아이디 중복된 객체를 저장하지 않으려면 equals(), hashCode() 메서드를 오버라이딩 해야함.
		Member memberHong = new Member(1003, "홍길동"); 
		// 1003 아이디 중복 회원 추가 
		// 동일한 주소값이 아니라서 아이디가 같아서 중복되도 저장이 됨.
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}
