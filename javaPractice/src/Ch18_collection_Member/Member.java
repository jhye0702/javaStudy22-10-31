package Ch18_collection_Member;

import java.util.Objects;

public class Member implements Comparable<Member> { 
	// implements Comparable<Member> 는
	// ~~~~~~~~~~~~~ MemberTreeSet 하면서 추가하게 되었음.
	private int memberId; // 회원 아이디
	private String memberName; // 회원 이름
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	public int getMemberID() {
		return memberId;
	}

	public void setMemberID(int memberID) {
		this.memberId = memberID;
	}

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}
	@Override // =============== MemberHashSet 하면서 추가하게 된 오버라이딩
	public int hashCode() {
		return memberId;
	}
	@Override // =============== MemberHashSet 하면서 추가하게 된 오버라이딩
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
			return false;
	}
	@Override // ~~~~~~~~~~~~~~~~~~ MemberTreeSet 하면서 추가
	public int compareTo(Member member) { // Comparable을 구현하기 때문에 오버라이딩.
		// 비교하는 두 값 중 this 값이 더 크면 양수를 반환하여 오름차순으로 정렬.
		// 메서드를 호출하는 객체가 인자로 넘어온 객체보다 작을 경우에는 음수를 리턴하고,
		// 크기가 동일하다면 0, 클 경우에는 양수를 리턴.
		
//		return(this.memberId - member.memberId); 
		// this.memberId가 매개변수로 받은 memberId 보다 크면 자리가 바뀐다..
		// 악 ! 뭐래 ! 뭐라는건데 !
		// 0하고 음수일때 자리 바꿈이 없다.
		// memberId가 정수이기 때문에 오름차순으로 정렬됨.
		
		return (this.memberId - member.memberId) * (-1); 
		// 내림 차순으로 정렬하기 위해 반환값을 음수로 만듦
	}
	

}
