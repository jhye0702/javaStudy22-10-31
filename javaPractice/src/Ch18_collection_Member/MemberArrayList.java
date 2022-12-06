package Ch18_collection_Member;

import java.util.ArrayList;

public class MemberArrayList {
	// ArrayList ���� ( member��� ��ü�� �����ϴ� arrayList )
	private ArrayList<Member> arrayList; 
	
	public MemberArrayList() {
		this.arrayList = new ArrayList<Member>(); // Member ������ ������ ArrayList ����
	}
	
	public void addMember(Member member) {
		arrayList.add(member); // ȸ���� �߰�
	}
	
	
	// boolean removeMember�� ����� forEach ���� ���� ��� �ɱ�? �����غ��� ������ ���� �ε��� ��ȣ�� ��� ������ �� �� ����.
	// ArrayList �� �ߺ��� ����Ѵ�. ȫ�浿�� �ι� ����Ǿ� ������! 
	// remove�� ������ �� �ִ��� �� �տ� ���� �����ϰ� �ڿ� ���� �ڷḦ ���ܵд�.
	public boolean removeMember(int memberID) {
		for(Member member : arrayList) {
			if(member.getMemberID() == memberID) { //  ȸ�� ���̵�� �Ű������� ��ġ�ϸ�
				arrayList.remove(member); // �ش� ȸ���� ����
				return true;
			}
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�!"); //�ݺ����� ������ �ش���̵� ã�� ���� ���
		return false;
	}
	
	
//	public boolean removeMember2nd (int memberID) {
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i); 		// get() �޼���� ȸ���� ���������� ������.
//			if(member.getMemberID() ==  memberID) { // ȸ�� ���̵�� �Ű������� ��ġ�ϸ�
//				arrayList.remove(i); 				// �ش� ȸ���� ����
//				return true; // boolean �̱� ������ true !
//			}
//		}
//		// �ݺ����� ������ �ش� ���̵� ã�� ���� ���
//		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");  
//		return false;
//	}
	
	public void showAllMember() { // ��ü ȸ���� ����ϴ� �޼���
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
