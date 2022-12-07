package Ch18_collection_Member;

import java.util.HashMap;
import java.util.Iterator;


public class MemberHashMap {
	private HashMap<Integer, Member> hashMap;	// HashMap ����
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>(); // HashMap ��ü ����
	}
	
	public void addMember(Member member) {			// ȸ�� �߰�.
		hashMap.put(member.getMemberID(), member); 	// key-value ������ �߰�
	}
	
	public boolean removeMember(int memberId) { // ȸ���� �����ϴ� �޼���.
		if(hashMap.containsKey(memberId)) {		// HashMap�� �Ű������� ���� Ű ���� ȸ�� ���̵� �ִٸ�
			hashMap.remove(memberId);			// �ش� ȸ�� ���� (HashMap�� �ݺ��� ������ �ʾƵ� ��)
			return true;
		}
		System.out.println(memberId + " �� �������� �ʽ��ϴ�!");
		return false;
	}
	
	public void showAllMember() { // iterator�� ����ؼ� ��ü ȸ���� ����ϴ� �޼���
		Iterator<Integer> ir = hashMap.keySet().iterator(); 
		while (ir.hasNext()) { // ���� key�� �ִٸ�
			int key = ir.next(); // key���� �����ͼ�
			Member member = hashMap.get(key); // key�� ���� value��������.
			System.out.println(member);
		}
		System.out.println();
	}
}
// *** Hash Map ***
//Map �������̽��� ������ ��ǥ���� Map �÷���
//HashMap �� Ű�� ����� ��ü�� hashCode()�� equals() �޼ҵ带 �������ؼ� ���� ��ü�� �� ������ ���ؾ���.
//
//��ü�� �޶� ���� ��ü���!!  ���� Ű�� �����ϰ� �ߺ�������� �ʵ��� �ϱ� ����
//���� ��ü�� ������  hashCode()�� ���ϰ��� ���ƾ��ϰ�, equals() �޼ҵ尡 true�� �����ؾ���.
//
//�ַ� Ű Ÿ���� String�� ���� ����ϴµ�, String�� ���ڿ��� ���� ���,
//���� ��ü�� �� �� �ֵ��� hashCode()�� equals() �޼ҵ尡 ������ �Ǿ�����.
