package Ch09_Class;

public class Student {

		int studentID;		// �й�
		String studentName;	// �̸�
		int grade;			// �г�
		String address;		// �ּ�
		
		public void showStudentInfo() {							// ����� �̸�, �ּҸ� �˷���.
			System.out.println(studentName + ", " + address);	// �̸�, �ּ�
		}
		public String getStudentName() {						// studentName�� ��ȯ
			 //���ȯ��//��get���� �޼����..?
			return studentName;
		}
		public void setStudentName(String name) {				// studentName�� ����
			studentName = name;
		}
		
	}
