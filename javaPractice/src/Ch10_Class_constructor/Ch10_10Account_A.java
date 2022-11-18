package Ch10_Class_constructor;

/*
 * ���� ���� ��ü�� Account ��ü�� �ܰ� (balance) �ʵ带 ������ �ִ�.
 * balance �ʵ�� �������� �� �� ����, �ִ� �鸸������ ������ �� �ִ�.
 * �ܺο��� balance �ʵ带 ������� �������� ���ϵ��� �ϰ�,
 * 0~1,000,000 ������ ���� ���� �� �ֵ��� Account Ŭ������ �ۼ��϶�
 * 
 * 1) Setter �� Getter�� �̿��Ѵ�.
 * 2) 0�� 1,000,000��  MIN_BALANCE �� MAX_BALANCE ����� �����ؼ� �̿��Ѵ�.
 * 3) Setter �� �Ű����� �����̰ų� �鸸���� �ʰ��ϸ� ���� balance ���� �����Ѵ�.
 */

class Account_A {
	private int balance;
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;

	public void setBalance(int balance) {
		this.balance = 
			(balance < MIN_BALANCE) || (balance > MAX_BALANCE)?
			this.balance : balance;
	}
	public int getBalance() {
		return balance;
	}
}
		
//	public void setBalance(int money) {
//		if(money > MAX_BALANCE || money < MIN_BALANCE) {
//			System.out.println("������ �ݾ��� �ʰ��Ͽ� �Ա� �Ұ�!");
//		}
//		else {
//			balance += money;
//			System.out.println(money + "���� ���¿� �ԱݵǾ����ϴ�.");
//		}
//	}		
//	public int getBalance() {
//		return balance;
//	}
//}

public class Ch10_10Account_A {

	public static void main(String[] args) {
		Account_A account = new Account_A();
		
		account.setBalance(10000);
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("���� �ܰ�: " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("���� �ܰ�: " + account.getBalance());
	}

}
