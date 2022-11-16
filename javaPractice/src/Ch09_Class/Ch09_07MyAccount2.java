package Ch09_Class;


public class Ch09_07MyAccount2 {

	public static void main(String[] args) {
		
		// MyAccount chulsoo = new MyAccount(); // 철수의 계좌
		MyAccount chulsoo;
		chulsoo = new MyAccount();
		
		MyAccount younghee = new MyAccount(); 	// 영희의 계좌
		
		chulsoo.name 	= "철수";		// 철수의 계좌명의
		chulsoo.no 		= "777777"; 	// 철수의 계좌번호
		chulsoo.balance = 1000;			// 철수의 예금잔고
		
		younghee.name	 = "영희";		// 영희의 계좌명의
		younghee.no		 = "222222";	// 영희의 계좌번호
		younghee.balance = 200;			// 영희의 예금잔고
		
		chulsoo.balance  -= 200;		// 철수가 200원 인출
		younghee.balance += 100;		// 영희가 100원 예금
		
		chulsoo.printAccount();
		younghee.printAccount();

	}

}
