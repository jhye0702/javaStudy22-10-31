package Ch13_abstract_interface_innerclass;

/*
 * 정수형 필드 num1, num2 가 있다.
 * num1, num2를 사용하여 특정 계산을 수행하는 int calc() 메서드를 추상 메서드로 정의한다.
 * void printResult() 메서드는
 * 일반 메서드로 calc() 메서드 실행 결과 리턴을 받아 출력하도록 미리 구현한다.
 * 
 * 1. 이 요구 사항을 충족하는 추상 클래스 Calculator 작성하라.
 * 
 * 2. Calculator 추상 클래스를 상속 받는 MyCalculator 클래스를 구현하라.
 */

abstract class Calculator {
	int num1, num2;
	abstract int calu();
	void printResult() {
		System.out.println("clau() 연산의 결과는 " + calu() + "입니다.");
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
		myCalculator.printResult(); // calu() 연산의 결과는 30입니다. 
	}

}
