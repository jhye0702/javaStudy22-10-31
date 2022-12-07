package Ch18_collection;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

import Ch18_collection_Member.Member;

class Student {
	public int studentNum;
	public String name;
	
	Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentNum == student.studentNum)
			return true;
		else
			return false;
		}
		return false;
	}
	
}

public class Ch18_13_Ex_Student {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�"));	// �й��� ���Ƽ� ������� ����.
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + "-" + student.name);
		}
		/* ���
		 1-ȫ�浿
		 2-�ſ��
		 */
	}

}
