package Ch18_collection;

import java.util.TreeSet;

public class Ch18_12_TreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		treeSet.add("������");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		// ���� �������� ������ �Ǿ� ���
//		������
//		�̼���
//		ȫ�浿

	}

}
