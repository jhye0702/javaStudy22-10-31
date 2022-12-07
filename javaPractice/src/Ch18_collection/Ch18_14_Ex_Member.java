package Ch18_collection;

import java.util.HashSet;
import java.util.Objects;

/*
 * ��� ����� ����ó�� �������� Member Ŭ������ �����ϼ���.
 * [400 : �����, 100 : ������, 200 : ������, 300 : �̼���]
 * ��� ������ ��� �����ϴ�.
 */
class Member {
	private String memberId;
	private String name;
	
	Member(String num, String name){
		this.memberId = num;
		this.name = name;
	}

	@Override
	public String toString() {
		return memberId + " : " + name ;
	}

	@Override
	public int hashCode() {
		return this.memberId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if  (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.memberId.equals(member.memberId)){
				return true;
			}
			else
				return false;
		}
		return false;
	}
	
}

public class Ch18_14_Ex_Member {

	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<Member>();
		set.add(new Member("100", "������"));
		set.add(new Member("200", "������"));
		set.add(new Member("300", "�̼���"));
		set.add(new Member("400", "�����"));
		set.add(new Member("100", "ȫ�浿"));
		
		System.out.println(set);
	}

}
