package Ch19_design_patton;
/* 
 * ����͸� �����ϸ�
 * : ��ȯ�� converter ��� �� �� ����.
 * ��ȯ���� ������ ���� �ٸ� �� �������̽� ���̿� ����� �����ϰ� �ϴ� ��.
 */
class ServiceA {
	void runWork() {
		System.out.println("work");
	}
}
class ServiceB {
	void runStudy() {
		System.out.println("study");
	}
}

class AdapterServiceA {
	ServiceA serviceA = new ServiceA();
	void runService() {
		serviceA.runWork();
	}
}
class AdapterServiceB {
	ServiceB serviceB = new ServiceB();
	void runService() {
		serviceB.runStudy();
	}
}
public class Ch19_01_Adapter {
	public static void main(String[] args) {
		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterServiceB asb1 = new AdapterServiceB();
		
		// ������ �޼��� ���� ����� �� ����.
		// ������ ? ���ο� ����� ������ ���´� �� ���, 
		// �޼������ ���� ������ �ȿ� �����Ұ� �ּ�ȭ �ȴ�..
		asa1.runService();
		asb1.runService();
		
	}

}
