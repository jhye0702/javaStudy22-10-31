package Ch16_package.object;
/*
 * 아래 3가지 공통점 : 가능하면 사용하지 말기, 아래 두가지 메서드를 강제로 쓰게 된다면 프로그램이 늦어집니다.
 * 
 void finalize() 메서드는 객체가 사라질 때 호출되며 뒷 정리를 수행.
 메모리 관련 정리를 할 필요가 없지만, 통신연결, DB 오픈 등의 정리를 했다면 객체가 사라지기 전에 정리해야 될 때 사용
 하지만 ★★★★★!! 가비지 컬렉터가 언제 수거할 지 모르기 때문에 !!★★★★★ 
 될 수 있으면 finalize 보다는 예외 처리 방식으로 하는 것이 더 좋음.
 
 System.gc() 메서드
 
 메모리가 지극히 부족하거나 프로그램이 한가할 때 가비지 컬렉터를 기동하여 쓰레기를 수집.
 가비지 컬렉터는 시스템이 한가한 시간에 알아서 시행하도록 되어 있어 특수한 상황이 아닌 한 이 메서드를 호출을 하지 말아야함.
 자동으로 수집되도록 되어있는데 강제로 명령을 내리면 오히려 성능이 떨어짐.
 가비지 컬렉터가 동작하면 당장 수행해야 할 다른 작업이 늦어져 사용자의 요구에 즉시 반응하지 못함.
 
 System.runFinaliztion() 메서드

 가비지 컬렉터에 의해 객체를 제거할 때 finalize 메서드를 호출하는데
 메모리 회수보다는 정리 작업만 하고 싶을 때 호출.
 메서드를 호출하면 예정된 finalize메서드를 즉시 실행함.
 */

class Network2{
	void connect() {
		System.out.println("연결되었습니다.");
	}
	void disconnect() {
		System.out.println("연결이 끊어졌습니다.");
	}
	@Override
	protected void finalize() throws Throwable {
		/*
		 시스템이 적당한 때에 알아서 호출하기 때문에 public이 아니라 protected 액세스에 지정.
		 자신의 자원을 정리하기 전에 부모의 finalize를 호출하여 부모의 자원부터 정리하는 것이 원칙.
		 */
		super.finalize();
		disconnect();
	}
	
}


public class Ch16_08_finalize2 {
	static void communication() {
		Network2 network = new Network2();
		network.connect();
	}
	public static void main(String[] args) {
		communication();
		System.gc(); 	// 강제로 가비지 컬렉터 실행을 지시. 연결이 끊어졌습니다.
		
		// 가비지 컬렉터를 지시해도 finalize()기 바로 호출된다는 보장은 없음
		// 여러가지 내부 사정으로 연기될 수 있어 자원을 정리하려면 runFinalization() 메서드도 같이 호출해야 함.
		System.runFinalization();
	}	
}
