package Ch13_abstract_interface;



interface Weapon {
	public void fire(int power); 	// �Ķ���� �Ŀ��� ���� �߻�
	public int getRestPower();		// ���� �����ִ� �Ŀ� ����
	public void charge(int power); 	// �Ķ���͸�ŭ ���� �Ŀ� ����
}

/* ���� ���α׷��̼� �־��� ���� �������̽��� �̿��Ͽ�
 * �ڽŸ��� ���� Ŭ���� (MyWeapon)�� �������϶�.
 * ��, ���� Ŭ�������� int curPower �ʵ尡 �ְ�,
 * fire()�� curpower���� power��ŭ �����ϰ�
 * charge()�� power��ŭ curPower�� ���� ��Ų��.
 */

class MyWeapon implements Weapon{
	private int curPower = 0;
	
	@Override
	public void fire(int power) {
		this.curPower -= power;
	}
	@Override
	public int getRestPower() {
		return curPower;
	}
	@Override
	public void charge(int power) {
		this.curPower += power;
	}
	
	
	
	public int getCurPower() {
		return curPower;
	}
	public void setCurPower(int curPower) {
		this.curPower = curPower;
	}
	
}

public class Ch13_interface04_ex {
	public static void main(String[] args) {
		MyWeapon myWeapon = new MyWeapon();
		myWeapon.setCurPower(100);
		
		myWeapon.fire(40);
		System.out.println(myWeapon.getCurPower());
		
	}
}
