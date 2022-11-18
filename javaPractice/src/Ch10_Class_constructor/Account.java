package Ch10_Class_constructor;



public class Account {
	
	// ���� ������ �����ϱ� ���� Ŭ����
	// �ʵ�, ������, getter / setter�θ� ����
	
	private String ano; 	// ���� ��ȣ
	private String owner; 	// ������
	private int balance; 	// �ܾ�
	
	public Account(String ano, String owner,int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	// ���⼭���� get set ������
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
