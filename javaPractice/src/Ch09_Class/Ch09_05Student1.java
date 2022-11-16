package Ch09_Class;

public class Ch09_05Student1 {

	public static void main(String[] args) {
		
		Student studentAhn = new Student();
		studentAhn.studentName = "안승연";
		
		// 같은 결과가 나옴
		System.out.println(studentAhn.studentName); // 안승연
		System.out.println(studentAhn.getStudentName()); // 안승연
		
//		
//		값을 가져오는 방법
//		1. 바로 접근해서 변수명으로 가져오기	(잘 사용하지 않음)
//		2. 메소드를 이용하기				(주로 이용하는 방법)
//		
		
	}

}
