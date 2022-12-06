package Ch18_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ch18_04_ArrayList_LinkedList {
/*
ArrayList �� LinkedList �� ���� ��

���������� (����������) �߰� �Ǵ� �����ϴ� ��� ArrayList�� ��������,
�߰��� �߰�, �����ϴ� ��쿡�� �� �� ��ũ ������ �����ϴ� LinkedList�� �� ����

ArrayList�� ���� �ε������� ��� 1�� ���� �Ǵ� ���ҽ�Ű�� �ð��� �ʿ��ϹǷ� ó�� �ӵ��� ����
 */
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// ============================= 1. �߰��� �߰��ϴ� ��� : LinkedList�� �� ����
		System.out.println("1. �߰��� �߰��ϴ� ���");
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð� : " + (endTime - startTime) + " ns");
		// ArrayList �ɸ��ð� : 2693500 ns
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� : " + (endTime - startTime) + " ns");
		// LinkedList �ɸ��ð� : 1703899 ns
		
		// ============================ 2. ���� ���������� �߰��ϴ� ��� : ArrayList�� ����
		System.out.println();
		System.out.println("2. ���� ���������� �߰��ϴ� ���");
		startTime = System.nanoTime();
		for(int i=0; i < 10000; i++) {
			list1.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð� : " + (endTime - startTime) + " ns");
		// ArrayList �ɸ��ð� : 674700 ns
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð� : " + (endTime - startTime) + " ns");
		// LinkedList �ɸ��ð� : 694100 ns
	}

}
