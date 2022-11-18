package Ch10_Class_constructor;



public class Account {
	
	// 계좌 정보를 저장하기 위한 클래스
	// 필드, 생성자, getter / setter로만 구성
	
	private String ano; 	// 계좌 번호
	private String owner; 	// 계좌주
	private int balance; 	// 잔액
	
	public Account(String ano, String owner,int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// 여기서부터 get set 만들어보기
	public void setAno(String ano) {
		ano = this.ano;
	}
	public String getAno() {
		return ano;
	}
	public void setOwner(String owner) {
		owner = this.owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(int balance) {
		balance = this.balance;
	}
	public int getBalance() {
		return balance;
	}
	public void addBalance(int money) {
		balance += money;
	}
	public void subBalance(int money) {
		balance -= money;
	}
}
