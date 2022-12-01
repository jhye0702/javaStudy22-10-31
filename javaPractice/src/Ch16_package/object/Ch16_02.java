package Ch16_package.object;

/*
 * Member 클래스에는 id와 이름, 연락처를 저장하는 필드가 있다.
 * Member 클래스를 작성하되, Object 의 toString() 메서드를 재정의해서 아래와 같이 나오도록 작성하라.
 * 
 * 실행 결과:
 * blue : 이파란
 */
class Member {
	String id, name, phone;
	
	Member(String id, String name, String phone){
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return id + " : " + name;
	}
	
}

public class Ch16_02 {

	public static void main(String[] args) {
//		member의 데이터 타입은 클래스타입이지만 자동으로 println 에 들어오면서 문자열화가 됩니다.
		
		Member member = new Member ("blue", "이파란", "010-1234-5678");
		System.out.println(member);
	}

}
