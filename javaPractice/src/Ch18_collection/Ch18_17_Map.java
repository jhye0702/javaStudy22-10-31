package Ch18_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* �̸��� key��, ������ value�� �����ϱ� */
public class Ch18_17_Map {
	
// ============= Map �÷��� ���� ===============================================
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		//<String, Integer> -> String �� Ű��, Integer�� ������ ���
		
// ============= ��ü ���� ===============================================
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);	// key �� ���� ������ ���� ���������� ������ ������ ��ü
								// ȫ�浿  90 => ȫ�浿 95 �� �ٲ�ϴ�.
		System.out.println("�� Entry �� : " + map.size());
	
// ============= ��ü ã�� ===============================================
		
		// �̸�(key)���� ����(value)�� �˻�
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿")); // key�� ���� �� �˻�
		System.out.println();
		
// ============= ��ü�� �ϳ��� ó�� ===============================================
		// key ���� Set �ڷ������� �����ϴ°� �켱!
		// �ߺ��� ���� �ִ��� key ��ü�� �ߺ��� ������� �ʱ� ������
		// Set �ڷ������� �����ص� ������.
		Set<String> keySet = map.keySet(); // keySet() : ��� Ű�� Set ��ü�� ��Ƽ� ����. key Set ����
		Iterator<String> keyIterator = keySet.iterator(); // Iterator�� key���� ���� ��ȯ�� �غ�.
		while (keyIterator.hasNext()) { // �ݺ��ؼ� Ű�� ��� ���� Map���� ��
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
// ============= forEach���� ����� ��� ===============================================
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			String strKey = entry.getKey();
			Integer intValue = entry.getValue();
			System.out.println(strKey + " : " + intValue );
		}
		System.out.println();
		
// ============= ��ü ���� ===============================================
		
		map.remove("ȫ�浿"); // Ű�� Map.Entry�� ����
		System.out.println("�� Entry �� : " + map.size()); // �� Entry �� : 2
		
// ============= ��ü�� �ϳ��� ó�� ===============================================
		
		// entrySet() : Ű�� ���� ������ ������ ��� Map.Entry ��ü�� Set�� ��Ƽ� ����
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Map.Entry Set ����
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
// ======== ��ü ��ü ���� ===============================================
		
		map.clear();
		System.out.println("�� Entry �� : " + map.size()); // �� Entry �� : 0
	} 

}
