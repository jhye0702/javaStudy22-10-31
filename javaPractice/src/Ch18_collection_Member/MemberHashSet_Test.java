package Ch18_collection_Member;

public class MemberHashSet_Test {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberSon);
		memberHashSet.addMember(memberPark);
		memberHashSet.showAllMember();

		memberHashSet.addMember(memberLee); // �ߺ��� ��ü ����
		memberHashSet.showAllMember();		// �ߺ��� ��ü�� ������� ����
		
		// ���̵� �ߺ��� ��ü�� �������� �������� equals(), hashCode() �޼��带 �������̵� �ؾ���.
		Member memberHong = new Member(1003, "ȫ�浿"); 
		// 1003 ���̵� �ߺ� ȸ�� �߰� 
		// ������ �ּҰ��� �ƴ϶� ���̵� ���Ƽ� �ߺ��ǵ� ������ ��.
		// ���̵� 
		memberHashSet.addMember(memberHong);
		memberHashSet.showAllMember();
	}

}
