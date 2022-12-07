package Ch18_collection_Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
	private TreeSet<Member> treeSet; // treeSet 선언
		
		public MemberTreeSet() {
			treeSet = new TreeSet<Member>(); // treeSet 생성
		}
		public void addMember (Member member) { 
			treeSet.add(member);  // treeSet에 회원 추가
		}
		
		public boolean removeMember(int memberId) { // treeSet에서 회원 삭제
			Iterator<Member> ir = treeSet.iterator();  
			
			while(ir.hasNext()) {					// 삭제 기준이 id라서 하나하나 돌려보아야해서 while문
				Member member = ir.next();			// 회원을 하나씩 가져와서
				int tempId = member.getMemberID();	// 아이디 비교
				if(tempId == memberId) {		 	// 같은 아이디인 경우
					treeSet.remove(member);			// 회원 삭제.
					return true;					// while문도 종료, 메서드 자체가 종료됨
				}
			}
			System.out.println(memberId +" 가 존재하지 않습니다.");
			return false;
		}
		
		public void showAllMember() {	// 모든 회원 출력
			for (Member member : treeSet) {
				System.out.println(member);
			}
			System.out.println();
		}
}
