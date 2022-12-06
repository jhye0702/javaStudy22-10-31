package Ch18_collection_Member;

import java.util.ArrayList;

public class MemberArrayList {
	// ArrayList 선언 ( member라는 객체를 저장하는 arrayList )
	private ArrayList<Member> arrayList; 
	
	public MemberArrayList() {
		this.arrayList = new ArrayList<Member>(); // Member 형으로 선언한 ArrayList 생성
	}
	
	public void addMember(Member member) {
		arrayList.add(member); // 회원을 추가
	}
	
	
	// boolean removeMember를 대신해 forEach 문을 쓰면 어떻게 될까? 변경해보면 삭제할 때가 인덱스 번호가 없어서 문제가 될 수 있음.
	// ArrayList 는 중복을 허용한다. 홍길동이 두번 저장되어 있으면! 
	// remove시 동일한 게 있더라도 맨 앞에 것을 삭제하고 뒤에 것은 자료를 남겨둔다.
	public boolean removeMember(int memberID) {
		for(Member member : arrayList) {
			if(member.getMemberID() == memberID) { //  회원 아이디와 매개변수가 일치하면
				arrayList.remove(member); // 해당 회원을 삭제
				return true;
			}
		}
		System.out.println(memberID + "가 존재하지 않습니다!"); //반복문을 돌려서 해당아이디를 찾지 못한 경우
		return false;
	}
	
	
//	public boolean removeMember2nd (int memberID) {
//		for(int i = 0; i < arrayList.size(); i++) {
//			Member member = arrayList.get(i); 		// get() 메서드로 회원을 순차적으로 가져옴.
//			if(member.getMemberID() ==  memberID) { // 회원 아이디와 매개변수가 일치하면
//				arrayList.remove(i); 				// 해당 회원을 삭제
//				return true; // boolean 이기 때문에 true !
//			}
//		}
//		// 반복문을 돌려서 해당 아이디를 찾지 못한 경우
//		System.out.println(memberID + "가 존재하지 않습니다.");  
//		return false;
//	}
	
	public void showAllMember() { // 전체 회원을 출력하는 메서드
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
