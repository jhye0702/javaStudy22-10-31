package Ch11_Class_Inheritance;

/*
 * final 변수 : 
 * final 메서드 : 내용을 더이상 변경할 수 없는 메서드. 오버라이딩 불가
 * final 클래스 : 내용을 더이상 변경할 수 없는 클래스. 상속 불가
 */

final class FinalClass {
	final int number = 4; // 상수
}
class Parents/* extends FinalClass */ // 에러발생
{
	final void finalMethod() { // 오버라이딩 불가한 메서드
		System.out.println("상속 불가한 메서드");
	}
}
class Son extends Parents {
	// void finalMethod() { } // 오버라이딩이 불가하다고 에러발생
}
public class Ch11_12_final {

	public static void main(String[] args) {
		FinalClass member1 = new FinalClass();
		System.out.println(member1.number);
		//member1.number = 5; // 상수는 변경 불가
		
		Son son = new Son();
		son.finalMethod();
		
		Parents parents = new Parents();
		parents.finalMethod();
		}
}
