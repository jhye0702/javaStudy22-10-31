package Ch17_;

import java.util.ArrayList;

/*
 ������ ���׸��� ������ 
 ���� �迭�� ArrayList�� Ÿ�� �μ� ���� ����غ���
 �ٸ� �ڷ����� ������ ���ڿ��� ���������� 
 �� Object�� �ļ��̹Ƿ� ���忡�� ���� ����.
 ������ ��Ҹ� ���� ���� ������ ĳ������ �ؾ���.
 */
public class Ch17_01_generic {
	public static void main(String[] args) {
		ArrayList arNum = new ArrayList();
		arNum.add(1);
		arNum.add("���ڿ�");
		int value = (int)arNum.get(0);
		// int temp = (int)arNum.get(1); // "���ڿ�"�̶�� �������°� �;��ϴµ� int ������ �����Ա� ������ ���� �߻�
		System.out.println(value);
	}

}
