package Ch18_collection;

import java.util.ArrayList;
/*
 * ArrayList를 이용해서 stack 자료 구조 구현
 * stack을 구현할 때 ArrayList, linkedList 중 어느 것을 선택하는 것이 좋을까?
 * 
 * stack을 구현한다는 건 개발자끼리 약속 !
 * 맨 뒤에 추가하고 맨 뒤에 삭제할 것이라고 !
 */
class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { // 스택의 맨 뒤에 요소를 추가
		arrayStack.add(data);
	}
	
	// ================== pop 구현 ==================
	public String pop() {
		int len = arrayStack.size(); // 저장된 개수
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return (arrayStack.remove(len-1)); // 맨 뒤에 있는 자료 반환하고 배열에서 제거
	}
	
	// push(E Item) : 주어진 객체를 스택에 넣음
	// peek()	: 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거하지 않음.
	// pop()	: 스택의 맨 위 객체를 가져옴. 객체를 스택에서 제거.
	
	// ================== peek 구현 ==================
	public String peek() {
		int len = arrayStack.size(); // 저장된 개수
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return (arrayStack.get(len-1)); // 맨 뒤에 있는 자료 반환
	}
}
public class Ch18_06_arrayStack {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		// peek(); 값을 들고와 확인만! 삭제 X
		System.out.println(stack.peek()); // C
		System.out.println(stack.peek()); // C
		System.out.println(stack.peek()); // C
		
		// pop(); 값을 들고 온 후 삭제까지!
		System.out.println(stack.pop()); // C
		System.out.println(stack.pop()); // B
		System.out.println(stack.pop()); // A
	}

}
