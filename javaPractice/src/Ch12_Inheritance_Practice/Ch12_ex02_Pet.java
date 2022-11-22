package Ch12_Inheritance_Practice;

public class Ch12_ex02_Pet {
	
	// p�� �����ϴ� �ν��Ͻ��� �ڱ�Ұ��� ��Ų��.
	static void intro(Pet p) {
		p.introduce();
	}
	
	public static void main(String[] args) {
		// �ֿϵ��� Ŭ������ �̿�
		// ��(�޼ҵ��� �μ��� �������� ����)
		
		Pet[] a = {
				new Pet("Kurt", "����"),			// Pet a = new Pet
				new RobotPet("R2D2", "��ũ"),	// Pet a = new RobotPet
				new Pet("����Ŭ", "����")			// Pet a = new Pet
		};
		
		for (Pet p : a) {
			intro(p);				// p�� �����ϴ� �ν��Ͻ��� �ڱ�Ұ��� ��Ų��
			System.out.println( );
		}
		
	}
}
