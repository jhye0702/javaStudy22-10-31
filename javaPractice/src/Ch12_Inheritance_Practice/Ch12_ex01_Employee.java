package Ch12_Inheritance_Practice;
/*
 * 일반 직원은 Employee 클래스로 모델링한다.
 * Employee 클래스를 상속받아서 관리자를 나타내는 Manager 클래스와
 * 프로그래머를 나타내는 Programer 클래스를 작성한다.
 * Employee 클래스 안에는 월급을 계산하는 getSalary() 메서드가 있다.
 * 이 메서드를 Manager 클래스와 Programer 클래스에서 오버라이딩해서 각 직급별로 다른 월급을 반환하도록 한다.
 * 오버라이딩을 할 때 Employee 클래스의 baseSalary을 사용하라.
 */

class Employee{
	public int baseSalary = 3000000;	// 기본급 - 혹시 private int baseSalary = 3000000; 이었다면
	int getSalary() {					//		   자식 클래스에서 private int salary=2000000; 따로 선언해서
		return baseSalary;				//		   return super.getSalary() + salary 하거나
	}									//		   따로 변수없이 return super.getSalary()+2000000; 해도됨
}
class Manager extends Employee {
	@Override
	int getSalary() {
		return (baseSalary + 2000000);		// 부모 클래스의 변수를 활용해서 숫자를 더해주는 것.
	}
}
class Programer extends Employee {
	@Override
	int getSalary() {
		return super.getSalary() + 3000000;	// private이었으면  super.getSalary() 해야합니다.
	}
}
class Owner extends Employee {
	int ownerSalary = 8000000;
	@Override
	int getSalary() {
		return ownerSalary;					// 따로 변수에 숫자를 지정해 넣어서 출력할 수도 있다.
	}
}

public class Ch12_ex01_Employee {

	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println("관리자의 월급 : " + manager.getSalary());
		// 출력 -> 관리자의 월급 : 5000000
		
		Programer programer = new Programer();
		System.out.println("프로그래머의 월급 : " + programer.getSalary());
		// 출력 -> 프로그래머의 월급 : 6000000
		
		Owner owner = new Owner();
		System.out.println("대표의 월급 : " + owner.getSalary());
	}

}
