package Ch13_abstract_interface;

import java.util.Iterator;

/*
 * 주어진 코드를 바탕으로 이전 문제에서 만든 MyWeapon을 사용하는
 * GameUnit 클래스의 생성자와 attack() 메서드를 완성하라
 * 
 * Game Unit 인스턴스는 두개 생성한다. unitPower는 각 유닛에 공급되는
 * 기본 power로 무기를 사용할 때 차감된다.
 * bossPower는 클래스 변수로 생성되는 모든 GameUnit 인스턴스에 공유한다.
 * 두 유닛에서의 공격으로 bossPower 가 0 이하가 되면 게임이 끝난다(System.exit(1)).
 * 생성자에서는 파라미터로 각 유닛의 이름을 받아 초기화하고 
 * 무기 인스턴스를 만들어 unitPower로 무기 충전한다.
 */


class GameUnit  {
	static int bossPower = 1000;	// 
	private int unitPower = 500;	// 각 유닛에 공급되는 기본 power
	private MyWeapon weapon;
	private String name;
	
	GameUnit(String name){
		this.name = name;
		this.weapon = new MyWeapon();
		this.weapon.charge(unitPower);
	}
	//attack() 구현
	public void attack(int power) {
		GameUnit.bossPower -= power;
		System.out.println("현재 bossPower : " + GameUnit.bossPower );
		if(GameUnit.bossPower < 0) {
			System.exit(1);
			
		}
	}
}


public class Ch13_interface05_ex {

	public static void main(String[] args) {
		GameUnit unit1 = new GameUnit("unit1");
		GameUnit unit2 = new GameUnit("unit2");
		
		
		while(true) {
			unit1.attack(500);
			unit2.attack(50);
		}
	}

}
