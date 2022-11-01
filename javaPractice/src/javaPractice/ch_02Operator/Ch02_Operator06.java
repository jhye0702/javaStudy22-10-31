package javaPractice.ch_02Operator;

public class Ch02_Operator06 {

	public static void main(String[] args) {
		// 논리곱(and)
		System.out.println(true && true); // true 1 * 1 = 1
		System.out.println(true && false); // false 1 * 0 = 0
		System.out.println(false && true); // false 0 * 1 = 0
		System.out.println(false && false); // false 0 * 0 = 0		
		
		// 논리합(or)
		System.out.println(true || true); // true 1 + 1 = 2
		System.out.println(true || false); // true 1 + 0 =1
		System.out.println(false || true); // true 0 + 1 = 1
		System.out.println(false || false); // false 0 + 0 = 0
		
		
		// 노란줄로 Dead code가 뜨는데, 앞의 값만 확인했을 때 결과값이 정해지는 경우!
		// 뒤에 값을 확인하지 않아도 되기 때문에 Dead code가 됩니다
		
		
		// 사실 상 && 도 or 도 3개를 비교하는 것과 같음. +나 x는 앞 뒤의 순서가 바뀌어도 상관 없기 때문에
		// false와 true의 앞 뒤 위치가 바뀌어도 상관이 없는 것.
	}

}
