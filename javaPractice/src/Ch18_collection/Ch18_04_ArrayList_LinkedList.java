package Ch18_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ch18_04_ArrayList_LinkedList {
/*
ArrayList 와 LinkedList 의 실행 비교

끝에서부터 (순차적으로) 추가 또는 삭제하는 경우 ArrayList가 빠르지만,
중간에 추가, 삭제하는 경우에는 앞 뒤 링크 정보만 변경하는 LinkedList가 더 빠름

ArrayList는 뒤쪽 인덱스들을 모두 1씩 증가 또는 감소시키는 시간이 필요하므로 처리 속도가 느림
 */
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// ============================= 1. 중간에 추가하는 경우 : LinkedList가 더 빠름
		System.out.println("1. 중간에 추가하는 경우");
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + " ns");
		// ArrayList 걸린시간 : 2693500 ns
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + " ns");
		// LinkedList 걸린시간 : 1703899 ns
		
		// ============================ 2. 끝에 순차적으로 추가하는 경우 : ArrayList가 빠름
		System.out.println();
		System.out.println("2. 끝에 순차적으로 추가하는 경우");
		startTime = System.nanoTime();
		for(int i=0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + " ns");
		// ArrayList 걸린시간 : 674700 ns
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + " ns");
		// LinkedList 걸린시간 : 694100 ns
	}

}
