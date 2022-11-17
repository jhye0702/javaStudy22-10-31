package Ch10_Class_constructor;

class Person {
	private String name, mobile, office, email;
	
	Person (String name, String mobile, String office, String email){
		this.name = name;
		this.mobile = mobile;
		this.office = office;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [name=" +name+ ", mobile=" +mobile+ ", office=" +office+ ", email=" +email+ "]";
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getMobile() {
//		return mobile;
//	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

public class Ch10_06Person {
	/*
	 * 클래스 작성 및 접근 제어
	 * 
	 * Person 이라는 클래스를 작성하고 테스트 하라.
	 * Person 이라는 클래스는 다음과 같은 필드와 메서드를 가진다.
	 * 
	 * # 필드
	 * name : 이름 (private)
	 * mobile : 핸드폰 번호 (private)
	 * office : 직장 전화번호 (private)
	 * email : 이메일 주소 (private)
	 * 
	 * # 메서드
	 * Person(n, m, oi, e) : 생성자 메서드
	 * toString(): 삼각형의 정보를 문자열로 변환하는 메서드
	 * setName(), getName()... : 각 속성에 대한 접근자와 설정자 메서드
	 */
	public static void main(String[] args) {
		Person person = new Person("박승준", "010-1234-5678", "053-123-4567", "test@naver.com");
		System.out.println(person);
		// 출력=>
		// Person{name='박승준', mobile='010-1234-5678', office='053-123-4567', email='test@naver.com'}
		person.setEmail("test@kakao.com");
		person.setMobile("010-5678-1234");
		System.out.println(person);
		// 출력=>
		// Person{name='박승준', mobile='010-5678-1234', office='053-123-4567', email='test@kakao.com'}
	}

}
