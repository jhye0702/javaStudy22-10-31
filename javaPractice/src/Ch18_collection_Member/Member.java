package Ch18_collection_Member;

import java.util.Objects;

public class Member implements Comparable<Member> { 
	// implements Comparable<Member> ��
	// ~~~~~~~~~~~~~ MemberTreeSet �ϸ鼭 �߰��ϰ� �Ǿ���.
	private int memberId; // ȸ�� ���̵�
	private String memberName; // ȸ�� �̸�
	
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
		return memberName + "ȸ������ ���̵�� " + memberId + "�Դϴ�.";
	}
	@Override // =============== MemberHashSet �ϸ鼭 �߰��ϰ� �� �������̵�
	public int hashCode() {
		return memberId;
	}
	@Override // =============== MemberHashSet �ϸ鼭 �߰��ϰ� �� �������̵�
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
	@Override // ~~~~~~~~~~~~~~~~~~ MemberTreeSet �ϸ鼭 �߰�
	public int compareTo(Member member) { // Comparable�� �����ϱ� ������ �������̵�.
		// ���ϴ� �� �� �� this ���� �� ũ�� ����� ��ȯ�Ͽ� ������������ ����.
		// �޼��带 ȣ���ϴ� ��ü�� ���ڷ� �Ѿ�� ��ü���� ���� ��쿡�� ������ �����ϰ�,
		// ũ�Ⱑ �����ϴٸ� 0, Ŭ ��쿡�� ����� ����.
		
//		return(this.memberId - member.memberId); 
		// this.memberId�� �Ű������� ���� memberId ���� ũ�� �ڸ��� �ٲ��..
		// �� ! ���� ! ����°ǵ� !
		// 0�ϰ� �����϶� �ڸ� �ٲ��� ����.
		// memberId�� �����̱� ������ ������������ ���ĵ�.
		
		return (this.memberId - member.memberId) * (-1); 
		// ���� �������� �����ϱ� ���� ��ȯ���� ������ ����
	}
	

}
