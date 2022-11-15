package Ch09_Class;

class Car {
	boolean powerOn; 	// 시동
	String color; 		// 차량의 색상
	int wheel; 			// 바퀴의 수
	int speed; 			// 속력
	boolean wiperOn; 	// 와이퍼
	
	void power() {
		powerOn = !powerOn; // 시동 메서드
	}
	void speedUp() {
		speed++; 			//엑셀 메서드
	}
	void speedDown() {
		speed--; 			// 브레이크 메서드
	}
	void wiper() {
		wiperOn = !wiperOn; // 와이퍼 메서드
	}
	
}
// =! 연산자는 반대 불 값을 변수에 할당하는데 사용된다.
// a=!b라는 표현은 실제로 a= !b 입니다.
// 먼저 b를 반전 시킨 다음 a에 할당합니다.
