package Ch16_package.object;

class Student{
	
	int studentId;
	String studentName;
	
	public Student (int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public String toString() {
		return studentId + ", " + studentName;
	}
	//equals()메서드 재정의. 학번이 같으면 같은 학생으로 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {	// 동일한 클래스의 객체이면
			Student std = (Student)obj; // Student 클래스로 형 변환.
			if(studentId == std.studentId) // 이 객체의 학번과 매개변수로 넘어온 객체의 학번이 같으면 true반환
				return true;
			else return false; 
		}
		return false;
	}
	@Override
	public int hashCode() {	 // 해시코드 값으로 학번을 반환하도록 메서드 재정의.
		return studentId;
	}
	
	
	
}
public class Ch17_06 {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		/* 동일한 주소의 두 인스턴스 비교 */
		if(studentLee == studentLee2)
			System.out.println("★★★★★studentLee와 studentLee2의 주소는 같습니다.★★★★★");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		// studentLee와 studentLee2의 주소는 같습니다.
		
		if(studentLee.equals(studentLee2))
			System.out.println("★★★★★studentLee와 studentLee2는 동일합니다.★★★★★");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다");
		//studentLee와 studentLee2는 동일합니다.
		
		/* 동일인이지만 인스턴스의 주소가 다른 경우 */
		// 주소는 다르지만 equals 의 결과가 true인 경우
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("★★★★★studentLee와 studentSang의 주소는 다릅니다.★★★★★");
		// studentLee와 studentSang의 주소는 다릅니다.
		
		if(studentLee.equals(studentSang))
			System.out.println("★★★★★studentLee와 studentSang은 동일합니다.★★★★★");
		else
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
		// studentLee와 studentSang 은 동일합니다.
		
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
		System.out.println("studentSang의 hashCode : " + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
	}

}
