package Ch18_collection_Member;

public class MemberLinkedListTest {

	public static void main(String[] args) {
		MemberLinkedList memberLikedList = new MemberLinkedList();
		
		// ���ο� ȸ�� �ν��Ͻ� ����
		Member memberLee = new Member(1001, "������");
		Member memberSon = new Member(1002, "�չα�");
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberHong = new Member(1004, "ȫ�浿");
		
		// ArrayList�� ȸ�� �߰�
		memberLikedList.addMember(memberLee);
		memberLikedList.addMember(memberSon);
		memberLikedList.addMember(memberPark);
		memberLikedList.addMember(memberHong);
		
		memberLikedList.showAllMember(); // ��ü ȸ�� ���
		
		memberLikedList.removeMember(memberHong.getMemberID()); // ȫ�浿 ȸ�� ����
		memberLikedList.showAllMember();
		
	}

}
