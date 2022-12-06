package Ch18_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// *** for문은 불가능하지만 forEach문은 가능합니다.
public class Ch18_11_hashSet {
	/* String 객체를 중복 없이 저장하는 HashSet */
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet / JSP");
		set.add("Java");	// Java는 한 번만 저장됨.
		set.add("iBATIS");
		
		int size = set.size();	// 저장된 객체 수 얻기
		System.out.println("총 객체수 : " + size);	// 총 객체수 : 4
		
		System.out.println("foreach문으로 출력 시작");
		for (String s : set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		//=====================================================
		
		Iterator<String> iterator = set.iterator(); // 반복자 얻기
		while (iterator.hasNext()) { // 객채 수만큼 루핑
			String element = iterator.next(); // 1개의 객체를 가져옴
			System.out.println(("\t" + element));
		}
		set.remove("JDBC"); // 1개의 객체 삭제
		set.remove("iBATIS"); // 1개의 객체 삭제
		
		System.out.println("총 객체수 : " + set.size()); // 총 객체수 : 2
		
		System.out.println("foreach문으로 출력 시작");
		for (String s : set) {
			System.out.println("\t" + s);
		}
		System.out.println();
		
		set.clear(); // 모든 객체를 제거하고 비움.
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
