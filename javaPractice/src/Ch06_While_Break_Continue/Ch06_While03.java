package Ch06_While_Break_Continue;

import java.util.Scanner;

public class Ch06_While03 {

	public static void main(String[] args) {

		/*
		 * continue문은 현재의 반복을 뛰어넘고 반복을 진행.
		 * 반복이 진행되다가 continue문을 만나면 반복문의 제일 끝으로 가서 다음 반복을 계속 수행
		 */
		
		int money = 10000;
		System.out.println("현재 가진 돈은 " + money + "원입니다.");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)	{
			System.out.println("얼마를 사용하시겠습니까? >>> ");
			int spendMoney = scanner.nextInt(); // 정수를 입력받음
			
			if (!(spendMoney > 0 && spendMoney <= money)) {
				//현재 가진 돈보다 크거나, 음수를 입력하면 다시 입력 요구
		//  if (i < 0 || i > money ) {
				System.out.println("다시 입력해주세요 (사용범위가 틀렸습니다.) ");
				continue; // 현재의 반복을 벗어나서 다시 반복을 시작
			}
			money -= spendMoney;
			System.out.println("이제 " + money + "원이 남았습니다.");
		// 남은 돈의 양 출력
			if(money == 0) { //돈이 0이 되면 종료
				break;
			}
		}
		System.out.println("모든 돈을 사용합니다. 종료");
		scanner.close();
		
		
	}
}
