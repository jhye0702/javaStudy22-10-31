package Ch18_collection_Member;

import java.util.LinkedList;

public class MemberLinkedList {

	
		// LinkedList ���� ( member��� ��ü�� �����ϴ� LinkedList )
		private LinkedList<Member> linkedList; 
		
		public MemberLinkedList() {
			linkedList = new LinkedList<Member>(); // Member ������ ������ LinkedList ����
		}
		
		public void addMember(Member member) {
			linkedList.add(member); // ȸ���� �߰�
		}
		
		public boolean removeMember (int memberID) {
			for(int i = 0; i < linkedList.size(); i++) {
				Member member = linkedList.get(i); 		// get() �޼���� ȸ���� ���������� ������.
				if(member.getMemberID() ==  memberID) { // ȸ�� ���̵�� �Ű������� ��ġ�ϸ�
					linkedList.remove(i); 				// �ش� ȸ���� ����
					return true; // boolean �̱� ������ true !
				}
			}
			// �ݺ����� ������ �ش� ���̵� ã�� ���� ���
			System.out.println(memberID + "�� �������� �ʽ��ϴ�.");  
			return false;
		}
		
		public void showAllMember() { // ��ü ȸ���� ����ϴ� �޼���
			for (Member member : linkedList) {
				System.out.println(member);
			}
			System.out.println();
		}
}

