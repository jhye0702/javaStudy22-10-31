package Ch18_collection;

import java.util.LinkedList;

/* LinkedList �� �̿��ؼ�queue �ڷ� ���� ����
 * queue�� ������ �� ArrayList, LinkedList �� ��� ���� �����ϴ� ���� ������?
 */


// �� Stack���� ArrayList�� ��µ�,
// Queue������ LinkedList�� ���°��ϱ�? �����غ���!
// => Queue�� �� �ڰ� �ƴ� �� �տ� �ڷḦ ���߸� �ϱ� ������ �ڷᰡ ��ĭ�� ������ �������� �������� ���ٴ�
// 	  �տ� �ڷḦ ���� �ڷᰡ �̵����� �ʵ���..?

class MyQueue {
	private LinkedList<String> linkedList = new LinkedList<String>();
	
	public void enQueue(String data) {
		linkedList.add(data); // ť�� �� �ڿ� �߰�
	}
	
	public String deQueue() {
		// ť�� �� �տ��� ����
		int len = linkedList.size();
		if (len == 0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		return (linkedList.remove(0)); // �� ���� �ڷ� ��ȯ�ϰ� �迭���� ����
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
