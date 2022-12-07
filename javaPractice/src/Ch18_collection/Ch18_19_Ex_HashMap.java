package Ch18_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap�� ���̵�(String)�� ����(Integer)�� ����Ǿ� ����
// ���� ����� ���� [ ��� ���� ]�� ����ϰ�, [ �ְ� ���� ]�� [ �ְ� ������ ���� ���̵� ]�� ����� ��

public class Ch18_19_Ex_HashMap {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;		// �ְ� ������ ���� ���̵� ����
		int maxScore = 0;		// �ְ� ���� ����
		int totalScore = 0; 	// ���� �հ� ����
		
		// �ۼ� ��ġ
		Iterator<String> entrySet = map.keySet().iterator();
		while (entrySet.hasNext()) { // �ݺ��ؼ� Ű�� ��� ���� Map���� ��
			String key = entrySet.next();
			int thisScore = map.get(key);
			totalScore += thisScore;
			if (maxScore < thisScore) {
				maxScore = thisScore;
				name = key;
			}
		}
		System.out.println("��� ���� : " + totalScore / map.size());
		System.out.println("�ְ� ���� : " + maxScore);
		System.out.println("�ְ� ������ ���� ���̵� : " + name);
		
		
//		��� ���� : 91
//		�ְ� ���� : 96
//		�ְ� ������ ���� ���̵� : blue
		
	}

}
