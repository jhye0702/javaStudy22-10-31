package Ch18_collection;

import java.util.HashMap;
import java.util.Map;

class Student2 { // 학번과 키가 같다면 동일한 키로 인식
	public int sno;
	public String name;
	
	public Student2(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() { // 학번과 이름이 같다면 동일한 값을 리턴
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
		
		// 학번과 이름이 동일한 Student를 키로 저장.
		map.put(new Student2(1, "홍길동"), 95);
		map.put(new Student2(1, "홍길동"), 95);
		map.put(new Student2(1, "박유신"), 85);
		
		System.out.println("총 Entry 수 : " + map.size());
	}

}
