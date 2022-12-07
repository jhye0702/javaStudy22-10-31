package Ch18_collection;

import java.util.HashMap;
import java.util.Map;

class Student2 { // �й��� Ű�� ���ٸ� ������ Ű�� �ν�
	public int sno;
	public String name;
	
	public Student2(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() { // �й��� �̸��� ���ٸ� ������ ���� ����
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student2) {
			Student2 student = (Student2) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}
		else {
			return false;
		}
	}
}
public class Ch18_18_Map_HashMap {
	public static void main(String[] args) {
		Map<Student2, Integer> map = new HashMap<Student2, Integer>();
		
		// �й��� �̸��� ������ Student�� Ű�� ����.
		map.put(new Student2(1, "ȫ�浿"), 95);
		map.put(new Student2(1, "ȫ�浿"), 95);
		map.put(new Student2(1, "������"), 85);
		
		System.out.println("�� Entry �� : " + map.size());
	}

}
