package Ch18_collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 일반적으로 Comparator 인터페이스 보다는 Comparable 인터페이스를 더 많이 사용.
 다만 어떤 클래스가 이미 Comparable 인터페이스를 구현한 경우에 
 이 클래스의 정렬 방식을 정의할 때 Comparator 인터페이스를 사용.
 String 클래스가 Comparable 인터페이스를 구현했고, 
 compareTo() 메서드는 오름차순을 구현.
 */

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2) * -1);  
		// String 클래스의 compareTo() 메서드를 반대로. 양수를 음수. 음수를 양수로
	}
	
}

public class Ch18_16_Comparator {
	public static void main(String[] args) {

		// Set<String> set = new TreeSet<String>();
		// TreeSet 생성자에 Comparator를 구현한 객체를 매개변수로 전달함.
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);  // 출력 결과 => [ccc, bbb, aaa]
	}

}
