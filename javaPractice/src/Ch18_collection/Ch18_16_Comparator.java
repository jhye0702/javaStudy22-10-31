package Ch18_collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 �Ϲ������� Comparator �������̽� ���ٴ� Comparable �������̽��� �� ���� ���.
 �ٸ� � Ŭ������ �̹� Comparable �������̽��� ������ ��쿡 
 �� Ŭ������ ���� ����� ������ �� Comparator �������̽��� ���.
 String Ŭ������ Comparable �������̽��� �����߰�, 
 compareTo() �޼���� ���������� ����.
 */

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2) * -1);  
		// String Ŭ������ compareTo() �޼��带 �ݴ��. ����� ����. ������ �����
	}
	
}

public class Ch18_16_Comparator {
	public static void main(String[] args) {

		// Set<String> set = new TreeSet<String>();
		// TreeSet �����ڿ� Comparator�� ������ ��ü�� �Ű������� ������.
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);  // ��� ��� => [ccc, bbb, aaa]
	}

}
