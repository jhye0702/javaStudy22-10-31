package Ch14_innerclass;

class A {
	class InstanceInner{} //  ���� Ŭ����
	
	static class StaticInner{} // static ���� Ŭ����. 
	
	//����ƽ ������� ���� ����
	StaticInner st1 = new StaticInner();
	
	// �ν��Ͻ� ������� ���� ����
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		// ����ƽ ����� ����ƽ ���� Ŭ������ ���� ����
		StaticInner st2 = new StaticInner();
		
		// ����ƽ ����� �ν��Ͻ� ����� ���� �Ұ�
		// InstanceInner ii2 = new InstanceInner(); // ���� �߻�
		
//		static�� �ڵ� �������� ���� �ö󰡱� ������
//		instance ���� ���� ��� �� �� �ֱ� ������
//		�ڵ� ��ü�� ���Ƶ� ��.
				
	}
	
	void instanceMethod() {
		// �ν��Ͻ� ����� ��� ���� ����
		StaticInner st3 = new StaticInner();
		InstanceInner ii3 = new InstanceInner();
	}
}



public class Ch14_01 {

	public static void main(String[] args) {

	}

}
