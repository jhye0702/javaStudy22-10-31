package Ch18_collection_Membership;

import java.util.HashSet;
import java.util.Set;

public class Ch18_12_set_HashSet {

	public static void main(String[] args) {
		Set<MemberShip> set = new HashSet<MemberShip>();
		
		// �ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����ϹǷ� ��ü 1���� ����
		set.add(new MemberShip("ȫ�浿", 30));
		set.add(new MemberShip("ȫ�浿", 30));
		
		System.out.println("�� ��ü�� : " + set.size());
	}

}
