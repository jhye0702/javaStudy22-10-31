package Ch09_Class;

public class Student {

		int studentID;		// 학번
		String studentName;	// 이름
		int grade;			// 학년
		String address;		// 주소
		
		public void showStudentInfo() { // 저장된 이름, 주소를 알려줌.
			System.out.println(studentName + ", " + address); // 이름, 주소
		}
		public String getStudentName() { // studentName을 반환
			return studentName;
		}
		public void setStudentName(String name) { // studentName을 저장
			studentName = name;
		}
		
	}

