package Ch18_collection_Member;

public class Member {
	private int memberID; // 회원 아이디
	private String memberName; // 회원 이름
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	
	
	@Override
	public String toString() {
		return memberID + "회원님의 아이디는 " + memberName + "입니다.";
	}
	public static void main(String[] args) {
		
	}

}
