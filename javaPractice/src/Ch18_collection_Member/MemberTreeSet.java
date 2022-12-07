package Ch18_collection_Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet; // treeSet ����
		
		public MemberTreeSet() {
			treeSet = new TreeSet<Member>(); // treeSet ����
		}
		public void addMember (Member member) { 
			treeSet.add(member);  // treeSet�� ȸ�� �߰�
		}
		
		public boolean removeMember(int memberId) { // treeSet���� ȸ�� ����
			Iterator<Member> ir = treeSet.iterator();  
			
			while(ir.hasNext()) {					// ���� ������ id�� �ϳ��ϳ� �������ƾ��ؼ� while��
				Member member = ir.next();			// ȸ���� �ϳ��� �����ͼ�
				int tempId = member.getMemberID();	// ���̵� ��
				if(tempId == memberId) {		 	// ���� ���̵��� ���
					treeSet.remove(member);			// ȸ�� ����.
					return true;					// while���� ����, �޼��� ��ü�� �����
				}
			}
			System.out.println(memberId +" �� �������� �ʽ��ϴ�.");
			return false;
		}
		
		public void showAllMember() {	// ��� ȸ�� ���
			for (Member member : treeSet) {
				System.out.println(member);
			}
			System.out.println();
		}
}
