package Ch19_design_patton;
/* 
 * 어댑터를 번역하면
 * : 변환기 converter 라고 할 수 있음.
 * 변환기의 역할은 서로 다른 두 인터페이스 사이에 통신이 가능하게 하는 것.
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
		
		// 동일한 메서드 명을 사용할 수 있음.
		// 좋은점 ? 새로운 비행기 관련이 들어온다 할 경우, 
		// 메서드명이 같기 때문에 안에 수정할게 최소화 된다..
		asa1.runService();
		asb1.runService();
		
	}

}
