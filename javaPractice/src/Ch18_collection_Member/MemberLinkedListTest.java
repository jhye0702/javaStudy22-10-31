package Ch18_collection_Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		MemberLinkedList memberLikedList = new MemberLinkedList();
		
		// 새로운 회원 인스턴스 생성
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		
		// ArrayList에 회원 추가
		memberLikedList.addMember(memberLee);
		memberLikedList.addMember(memberSon);
		memberLikedList.addMember(memberPark);
		memberLikedList.addMember(memberHong);
		
		memberLikedList.showAllMember(); // 전체 회원 출력
		
		memberLikedList.removeMember(memberHong.getMemberID()); // 홍길동 회원 삭제
		memberLikedList.showAllMember();
		
	}

}
