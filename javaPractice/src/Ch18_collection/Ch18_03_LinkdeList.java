package Ch18_collection;

import java.util.LinkedList;

public class Ch18_03_LinkdeList {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		
		// ��ũ�� ����Ʈ�� ��� �߰�
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
		System.out.println(linkedList); // ����Ʈ ��ü ���
		// [A, B, C]
		
		linkedList.add(1, "D"); // 1�� �ε����� �߰�
		System.out.println(linkedList);
		// [A, D, B, C]
		
		linkedList.addFirst("O"); // addFirst(): �� �տ� �߰�. LinkedList���� ���
		System.out.println(linkedList);
		// [O, A, D, B, C]
		
		System.out.println(linkedList.removeLast()); 
		// removeLast() : �� ���� ��� ���� �� ��ȯ. LinkedList���� ���
		// �� ���� C�� ����Ʈ���� ���� �� ��, ������ ���ͼ� C�� ��ȯ�Ǿ� �����. ������ ���� Ȯ�� ����!
		System.out.println(linkedList);
		// [O, A, D, B]
	}

}
