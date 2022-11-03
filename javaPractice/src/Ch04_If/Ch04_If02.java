package Ch04_If;

public class Ch04_If02 {

	public static void main(String[] args) {
		/*
		 * if else문
		 */
		
		int age = 15;
		
		if (age > 19) {
			System.out.println("성인입니다.");
			System.out.println("성인 요금이 적용됩니다.");
		}
		else { // 위의 조건 식이 거짓일 때만 실행
			System.out.println("청소년입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}
		System.out.println("결제를 진행해 주세요.");

		
		// ------------- 위의 if else문을 삼항 연산자로 변경을 시켜봅시다
//		System.out.println(age>19? "성인입니다.\n성인 요금이 적용됩니다.":"청소년입니다.\n청소년 요금이 적용됩니다.");
//		System.out.println("결제를 진행해 주세요.");
	}
}
