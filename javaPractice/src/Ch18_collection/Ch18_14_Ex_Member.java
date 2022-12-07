package Ch18_collection;

import java.util.HashSet;
import java.util.Objects;

/*
 * 출력 결과가 다음처럼 나오도록 Member 클래스를 구현하세요.
 * [400 : 정약용, 100 : 김유신, 200 : 강감찬, 300 : 이순신]
 * 출력 순서는 상관 없습니다.
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
		set.add(new Member("100", "김유신"));
		set.add(new Member("200", "강감찬"));
		set.add(new Member("300", "이순신"));
		set.add(new Member("400", "정약용"));
		set.add(new Member("100", "홍길동"));
		
		System.out.println(set);
	}

}
