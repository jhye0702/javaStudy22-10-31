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
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));	// 학번이 같아서 저장되지 않음.
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + "-" + student.name);
		}
		/* 결과
		 1-홍길동
		 2-신용권
		 */
	}

}
