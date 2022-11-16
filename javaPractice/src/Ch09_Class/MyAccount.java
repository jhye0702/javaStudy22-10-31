package Ch09_Class;

public class MyAccount {
		String name;		// 계좌명의
		String no;		// 계좌번호
		long balance;	// 예금잔고
		
		public void printAccount() {
			System.out.println("■ " + name + "의 계좌");
			System.out.println("  계좌명의 : " + name);
			System.out.println("  계좌번호 : " + no);
			System.out.println("  예금잔고 : " + balance);
		}
		
	}
