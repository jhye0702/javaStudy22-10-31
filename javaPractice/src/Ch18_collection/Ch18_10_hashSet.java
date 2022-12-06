package Ch18_collection;

import java.util.HashSet;

/* HashSet 
 * : ��ü���� ���� ���� ����, ������ ��ü�� �ڡڡ��ߺ� �������� �����ڡڡ�.
 * 
 * HashSet�� �Ǵ��ϴ� ������ ��ü�� �� ���� �ν��Ͻ��� ������ ����.
 * ��ü�� �����ϱ� ����
 * 1) ���� ��ü�� hashCode() �޼���� ȣ���ؼ� �ؽ��ڵ带 ����
 * 	  �̹� ����Ǿ� �ִ� ��ü���� �ؽ��ڵ�� ��
 * 2) ���� ������ �ؽ��ڵ尡 �ִٸ� �ٽ� equals() �޼ҵ�� �� ��ü�� ���ؼ�
 */

public class Ch18_10_hashSet {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		hashSet.add(new String("ȫ����"));
		hashSet.add(new String("������"));
		hashSet.add(new String("������"));
		
		// �ߺ��� ���ڿ��� ���ŵǰ� ��� ������ �Է� ������ ��� ����.
		System.out.println(hashSet);
	}

}
