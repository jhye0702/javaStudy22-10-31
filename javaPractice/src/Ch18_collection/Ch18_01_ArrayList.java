package Ch18_collection;

import java.util.ArrayList;
import java.util.List;

public class Ch18_01_ArrayList {
/* String 객체를 저장하는 ArrayList */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// String 객체 저장 ( add 메소드를 사용해서 추가 )
		list.add("Java");
		list.add("JDBC");
		list.add("Serverlet/JSP");
		list.add(2,"Database"); // 배열에서는 인덱스번호에 덮어씌워짐. 
								// ArrayList는 원래 있던 2번 자리에 들어가고 2번은 3번으로 밀려남.
		list.add("iBATIS");
		
		int size = list.size();	// 저장된 총 객체수 얻기
		System.out.println("총 객체수 : " + size); // 총 객체수 : 5
		System.out.println();
		
		String skill = list.get(2); // 2번 인덱스에 저장된 객체 얻기
		System.out.println("2 : " + skill);  // 2 : Database
		
		// 저장된 객체 출력
		for (int i = 0; i <list.size(); i++) { // 저장된 갯수만큼 반복
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
//		0:Java
//		1:JDBC
//		2:Database
//		3:Serverlet/JSP
//		4:iBATIS
		
		System.out.println();
		for(String str : list) { // foreach로도 출력가능
			System.out.println(str);
		}
		System.out.println();
		
		list.remove(2); // 2번 인덱스 Database 삭제 
						// -> 삭제 후 그 자리에 뒷 차례에 있던 값이 2번 자리로 옵니다!
		list.remove(2); // 2번 인덱스 Serverlet/JSP 삭제
		list.remove("iBATIS");
		
		for (int i=0; i<list.size(); i++) { // 저장된 갯수만큼 반복
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
//		0 : Java
//		1 : JDBC
	}
	
 // 예를 들어 데이터가 1000개가 있는 경우 
 // 중간에 한개가 추가/ 삭제가 되면 나머지 뒤에 데이터가 1000개 가까이가 이동을 해야한다.
 // 그래서 많은 작업이 이루어져야 하므로
 // 데이터의 수가 작을 때만 쓰는걸 권유하는 편이다
}
