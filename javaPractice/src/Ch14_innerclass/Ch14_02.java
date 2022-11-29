package Ch14_innerclass;

class OuterClass {
	int a = 3;
	static int b = 4;
	
	class Inner {	// 인스턴스 내부 클래스
		int c = 5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	
	static class StaticInner {		// static 내부 클래스
		int d = 6;					// static 내부 클래스는 인스턴스 필드를 가질 수 있음.
		static int stat = 10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}

public class Ch14_02 {
	public static void main(String[] args) {
		// 외부 클래스 사용
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass의 a값 = " + oc.a);  // 3
		// static 변수라서 클래스명으로 접근 가능
		System.out.println("OuterClass의 b값 = " + OuterClass.b);  //4
		
		
		// 접근은 가능한데 외부 클래스. 스태틱내부클래스. 스태틱메서드 일때 가능
//		System.out.println("OuterClass의 b값 = " + OuterClass.StaticInner.d);  //인스턴스 멤버라서 접근 불가
		System.out.println("OuterClass의 StaticInner의 stat값 = " + OuterClass.StaticInner.stat);
		OuterClass.StaticInner.staticMethod(); // <Static Inner> // 클래스명으로도 접근 가능
		
		System.out.println("\n============ inner 클래스 접근하기 ==============");
		OuterClass oc2 = new OuterClass(); // 외부 클래스의 객체 생성 후 사용
		OuterClass.Inner inner = oc2.new Inner(); // 인스턴스 내부 클래스의 객체 생성.
		
		System.out.println("Inner의 c값 = " + inner.c); // 5
		inner.innerMethod(); // <Inner Class>
		
		System.out.println("\n============ static inner 클래스 접근하기 ==============");
		// 외부클래스의 객체 생성 없이도 사용 가능!
		OuterClass.StaticInner si = new OuterClass.StaticInner();	// static 내부 클래스의 객체 생성.
		System.out.println("StaticInner의 d값 = " + si.d);  // 6
		si.staticMethod(); // <Static Inner> 클래스, 객체 모두를 사용해 접근 가능
	}
}
