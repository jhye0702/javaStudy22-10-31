package Ch10_Class_constructor;

public class Singleton {
	/*
	�̱��� singleton
	��ü ���α׷����� �� �ϳ��� ��ü�� ���� �����ؾ��ϴ� ��쿡 ���.
	�����ڸ� ȣ���� ��ŭ ��ü�� �����Ǳ� ������
	�̱����� ������� Ŭ���� �ܺο��� new �����ڷ� �����ڸ� ȣ���� �� ������ ���ƾ� ��.
	�ܺο��� �����ڸ� ȣ���� �� ������ ������ �տ� private ���������ڸ� �ٿ���.
	
	�׸��� �ڽ��� Ÿ���� ���� �ʵ带 �ϳ� ���� �ϰ� �ڽ��� ��ü�� ������ �ʱ�ȭ��
	�����ڰ� private ������ Ŭ���� ���ο����� ȣ���� ����
	���� �ʵ嵵 private ���� �����ڸ� �ٿ� �ܺο��� �ʵ尪�� �������� ���ϵ��� ����.
	
	��� �ܺο��� ȣ���� �� �ִ� ���� �޼ҵ��� getInstance()�� �����ϰ�
	���� �ʵ忡�� �����ϰ� �ִ� �ڽ��� ��ü�� ����
	
	*/
	
	private static Singleton singleton = new Singleton(); 
	// static�� �پ�� �ϴ� ����? =>
	// static���� singleton�� ���������� �ö󰬴µ�
	// 
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
