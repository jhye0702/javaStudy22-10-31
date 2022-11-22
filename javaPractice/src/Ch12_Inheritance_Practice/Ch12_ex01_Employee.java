package Ch12_Inheritance_Practice;
/*
 * �Ϲ� ������ Employee Ŭ������ �𵨸��Ѵ�.
 * Employee Ŭ������ ��ӹ޾Ƽ� �����ڸ� ��Ÿ���� Manager Ŭ������
 * ���α׷��Ӹ� ��Ÿ���� Programer Ŭ������ �ۼ��Ѵ�.
 * Employee Ŭ���� �ȿ��� ������ ����ϴ� getSalary() �޼��尡 �ִ�.
 * �� �޼��带 Manager Ŭ������ Programer Ŭ�������� �������̵��ؼ� �� ���޺��� �ٸ� ������ ��ȯ�ϵ��� �Ѵ�.
 * �������̵��� �� �� Employee Ŭ������ baseSalary�� ����϶�.
 */

class Employee{
	public int baseSalary = 3000000;	// �⺻�� - Ȥ�� private int baseSalary = 3000000; �̾��ٸ�
	int getSalary() {					//		   �ڽ� Ŭ�������� private int salary=2000000; ���� �����ؼ�
		return baseSalary;				//		   return super.getSalary() + salary �ϰų�
	}									//		   ���� �������� return super.getSalary()+2000000; �ص���
}
class Manager extends Employee {
	@Override
	int getSalary() {
		return (baseSalary + 2000000);		// �θ� Ŭ������ ������ Ȱ���ؼ� ���ڸ� �����ִ� ��.
	}
}
class Programer extends Employee {
	@Override
	int getSalary() {
		return super.getSalary() + 3000000;	// private�̾�����  super.getSalary() �ؾ��մϴ�.
	}
}
class Owner extends Employee {
	int ownerSalary = 8000000;
	@Override
	int getSalary() {
		return ownerSalary;					// ���� ������ ���ڸ� ������ �־ ����� ���� �ִ�.
	}
}

public class Ch12_ex01_Employee {

	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println("�������� ���� : " + manager.getSalary());
		// ��� -> �������� ���� : 5000000
		
		Programer programer = new Programer();
		System.out.println("���α׷����� ���� : " + programer.getSalary());
		// ��� -> ���α׷����� ���� : 6000000
		
		Owner owner = new Owner();
		System.out.println("��ǥ�� ���� : " + owner.getSalary());
	}

}
