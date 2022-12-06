package Ch18_collection;

import java.util.ArrayList;
/*
 * ArrayList�� �̿��ؼ� stack �ڷ� ���� ����
 * stack�� ������ �� ArrayList, linkedList �� ��� ���� �����ϴ� ���� ������?
 * 
 * stack�� �����Ѵٴ� �� �����ڳ��� ��� !
 * �� �ڿ� �߰��ϰ� �� �ڿ� ������ ���̶�� !
 */
class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) { // ������ �� �ڿ� ��Ҹ� �߰�
		arrayStack.add(data);
	}
	
	// ================== pop ���� ==================
	public String pop() {
		int len = arrayStack.size(); // ����� ����
		if (len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return (arrayStack.remove(len-1)); // �� �ڿ� �ִ� �ڷ� ��ȯ�ϰ� �迭���� ����
	}
	
	// push(E Item) : �־��� ��ü�� ���ÿ� ����
	// peek()	: ������ �� �� ��ü�� ������. ��ü�� ���ÿ��� �������� ����.
	// pop()	: ������ �� �� ��ü�� ������. ��ü�� ���ÿ��� ����.
	
	// ================== peek ���� ==================
	public String peek() {
		int len = arrayStack.size(); // ����� ����
		if (len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return (arrayStack.get(len-1)); // �� �ڿ� �ִ� �ڷ� ��ȯ
	}
}
public class Ch18_06_arrayStack {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		// peek(); ���� ���� Ȯ�θ�! ���� X
		System.out.println(stack.peek()); // C
		System.out.println(stack.peek()); // C
		System.out.println(stack.peek()); // C
		
		// pop(); ���� ��� �� �� ��������!
		System.out.println(stack.pop()); // C
		System.out.println(stack.pop()); // B
		System.out.println(stack.pop()); // A
	}

}
