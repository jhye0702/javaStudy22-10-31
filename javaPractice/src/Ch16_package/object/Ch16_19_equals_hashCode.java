package Ch16_package.object;

import java.util.HashMap;
import java.util.Objects;

/*
 Student Ŭ������ �ۼ��ϵ� , Object�� equals()�� hashCode()�� �������ؼ�
 Student�� �й� studentNum �� ������ ���� ��ü�� �� �� �ֵ��� �غ�����.
 Student Ŭ������ �ʵ�� ������ �����ϴ�.
 hashCode()�� ���� ���� studentNum �ʵ� ���� �ؽ��ڵ带 �����ϵ��� �ϼ���.
 
 ���� ��� :
 1�� �л��� ���� : 95
 */

class Student2 {
	private String studentNum;
	
	public Student2 (String studentNum) {
		this.studentNum = studentNum;
	}
	public String getStudentNum() {
		return studentNum;
	}
	// ���⿡ �ڵ带 �ۼ��ϼ���
	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		return Objects.equals(studentNum, other.studentNum);
	}
}

public class Ch16_19_equals_hashCode {

	public static void main(String[] args) {
		// Student Ű�� ������ �����ϴ� HashMap ��ü ����
		HashMap<Student2, String> hashMap = new HashMap<Student2, String>();
		
		// new Student("1")�� ���� 95�� ����.
		hashMap.put(new Student2("1"), "95");
		
		String score = hashMap.get(new Student2("1"));
		System.out.println("1�� �л��� ���� : " + score);
	}

}
