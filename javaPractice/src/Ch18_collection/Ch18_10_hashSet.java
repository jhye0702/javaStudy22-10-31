package Ch18_collection;

import java.util.HashSet;

/* HashSet 
 * : 객체들을 순서 없이 저장, 동일한 객체는 ★★★중복 저장하지 않음★★★.
 * 
 * HashSet이 판단하는 동일한 객체란 꼭 같은 인스턴스를 뜻하지 않음.
 * 객체를 저장하기 전에
 * 1) 먼저 객체의 hashCode() 메서드들 호출해서 해시코드를 얻어내고
 * 	  이미 저장되어 있는 객체들의 해시코드와 비교
 * 2) 만약 동일한 해시코드가 있다면 다시 equals() 메소드로 두 객체를 비교해서
 */

public class Ch18_10_hashSet {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현정"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		
		// 중복된 문자열은 제거되고 출력 순서와 입력 순서는 상관 없음.
		System.out.println(hashSet);
	}

}
