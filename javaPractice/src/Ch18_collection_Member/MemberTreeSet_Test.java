package Ch18_collection_Member;

public class MemberTreeSet_Test {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		memberTreeSet.addMember(memberPark);
		memberTreeSet.showAllMember();
		
		// ���̵� �ߺ��� ��ü�� �������� �������� equals(), hashCode() �޼��带 �������̵� �ؾ���.
		Member memberHong = new Member(1003, "ȫ�浿"); 
		// 1003 ���̵� �ߺ� ȸ�� �߰� 
		// ������ �ּҰ��� �ƴ϶� ���̵� ���Ƽ� �ߺ��ǵ� ������ ��.
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}

}
