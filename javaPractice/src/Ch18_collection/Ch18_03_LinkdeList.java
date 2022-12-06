package Ch18_collection;

import java.util.LinkedList;

public class Ch18_03_LinkdeList {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// 링크드 리스트에 요소 추가
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
		System.out.println(linkedList); // 리스트 전체 출력
		// [A, B, C]
		
		linkedList.add(1, "D"); // 1번 인덱스에 추가
		System.out.println(linkedList);
		// [A, D, B, C]
		
		linkedList.addFirst("O"); // addFirst(): 맨 앞에 추가. LinkedList에서 사용
		System.out.println(linkedList);
		// [O, A, D, B, C]
		
		System.out.println(linkedList.removeLast()); 
		// removeLast() : 맨 뒤의 요소 삭제 및 반환. LinkedList에서 사용
		// 맨 뒤의 C가 리스트에서 삭제 된 후, 밖으로 나와서 C만 반환되어 선언됨. 삭제한 내용 확인 가능!
		System.out.println(linkedList);
		// [O, A, D, B]
	}

}
