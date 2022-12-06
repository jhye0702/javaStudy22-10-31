package Ch18_collection;

import java.util.LinkedList;

/* LinkedList 를 이용해서queue 자료 구조 구현
 * queue를 구현할 때 ArrayList, LinkedList 중 어느 것을 선택하는 것이 좋을까?
 */


// 왜 Stack에선 ArrayList를 썼는데,
// Queue에서는 LinkedList를 쓰는것일까? 생각해보기!
// => Queue는 맨 뒤가 아닌 맨 앞에 자료를 빼야만 하기 때문에 자료가 한칸씩 앞으로 움직여서 느려지기 보다는
// 	  앞에 자료를 빼도 자료가 이동하지 않도록..?

class MyQueue {
	private LinkedList<String> linkedList = new LinkedList<String>();
	
	public void enQueue(String data) {
		linkedList.add(data); // 큐의 맨 뒤에 추가
	}
	
	public String deQueue() {
		// 큐의 맨 앞에서 꺼냄
		int len = linkedList.size();
		if (len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return (linkedList.remove(0)); // 맨 앞의 자료 반환하고 배열에서 제거
	}
}

public class CH18_08_Queue_linkedList {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue()); // A
		System.out.println(queue.deQueue()); // B
		System.out.println(queue.deQueue()); // C
	}

}
