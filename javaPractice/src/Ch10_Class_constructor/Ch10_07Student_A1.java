package Ch10_Class_constructor;

class Student_A {
	public String name;
	private String rollno;
	public int age;
	
	Student_A(String name, String rollno, int age){
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 학번 : " + rollno);
		System.out.println("학생의 나이 : " + age);
		
		System.out.println("Student 객체가 생성되었습니다.");
	}
}

public class Ch10_07Student_A1 {
	/*
	 * 학생을 나타내는 클래스 Student를 만든다.
	 * 학생은 이름(name)과 학번(rollno), 나이(age)를 가진다.
	 * 학번은 private로 선언한다.
	 */
	public static void main(String[] args) {
		
		Student_A student = new Student_A("Kim", "0001", 20);
		
		
		
		/*
		 * 출력 결과물 =>
		 * 학생의 이름 : Kim
		 * 학생의 학번 : 0001
		 * 학생의 나이 : 20
		 * Student 객체가 생성되었습니다.
		 */
		
	}

}
