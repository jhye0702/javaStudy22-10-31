package Ch13_abstract_interface;



interface Weapon {
	public void fire(int power); 	// 파라미터 파워로 무기 발사
	public int getRestPower();		// 현재 남아있는 파워 리턴
	public void charge(int power); 	// 파라미터만큼 무기 파워 충전
}

/* 게임 프로그램이서 주어진 무기 인터페이스를 이용하여
 * 자신만의 무기 클래스 (MyWeapon)를 디자인하라.
 * 단, 무기 클래스에는 int curPower 필드가 있고,
 * fire()는 curpower에서 power만큼 차감하고
 * charge()는 power만큼 curPower를 증가 시킨다.
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
