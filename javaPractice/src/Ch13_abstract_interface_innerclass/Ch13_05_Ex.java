package Ch13_abstract_interface_innerclass;

/*
 * ������ �ʵ� num1, num2 �� �ִ�.
 * num1, num2�� ����Ͽ� Ư�� ����� �����ϴ� int calc() �޼��带 �߻� �޼���� �����Ѵ�.
 * void printResult() �޼����
 * �Ϲ� �޼���� calc() �޼��� ���� ��� ������ �޾� ����ϵ��� �̸� �����Ѵ�.
 * 
 * 1. �� �䱸 ������ �����ϴ� �߻� Ŭ���� Calculator �ۼ��϶�.
 * 
 * 2. Calculator �߻� Ŭ������ ��� �޴� MyCalculator Ŭ������ �����϶�.
 */

abstract class Calculator {
	int num1, num2;
	abstract int calu();
	void printResult() {
		System.out.println("clau() ������ ����� " + calu() + "�Դϴ�.");
	}
}
class MyCalculator extends Calculator {
	int num1, num2;

	@Override
	public int calu() {
		return this.num1 + this.num2;
	}
}

public class Ch13_05_Ex {

	
	public static void main(String[] args) {
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.num1 = 10;
		myCalculator.num2 = 20;
		myCalculator.printResult(); // calu() ������ ����� 30�Դϴ�. 
	}

}
