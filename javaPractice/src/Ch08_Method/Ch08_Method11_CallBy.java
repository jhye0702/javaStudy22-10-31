package Ch08_Method;


public class Ch08_Method11_CallBy {
			
		public static void main(String[] args) {

			/*
			 * ================= 깊은 복사. 값 복사 (deep copy) ===============
			 * 데이터 자체가 복사된다.
			 * 복사된 두 객체는 완전히 독립적인 메모리를 차지한다.
			 */
			int a = 1;
			int b = a;
			b++;
			
			System.out.println("a : " +a+ ", b : " + b); // a:  1, b: 2;
			
			/*
			 * ================ 얕은 복사. 참조 복사 (shallow copy) ================
			 * 값 자체를 복사하는 것이 아니라 주소값을 복사하여 같은 메모리를 가리키기 때문이다.
			 */
			
			int[] nums_01 = new int[1];
			nums_01[0] = 1;
			
			int[] nums_02 = nums_01;
			nums_02[0] = 2;
			
			System.out.println("nums_01[0] : " + nums_01[0] + ", nums_02 : " + nums_02[0]);
			// nums_01[0]: 2, nums_02[0]: 2
		}
	}
