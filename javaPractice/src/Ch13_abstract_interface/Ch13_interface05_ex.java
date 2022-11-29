package Ch13_abstract_interface;

import java.util.Iterator;

/*
 * �־��� �ڵ带 �������� ���� �������� ���� MyWeapon�� ����ϴ�
 * GameUnit Ŭ������ �����ڿ� attack() �޼��带 �ϼ��϶�
 * 
 * Game Unit �ν��Ͻ��� �ΰ� �����Ѵ�. unitPower�� �� ���ֿ� ���޵Ǵ�
 * �⺻ power�� ���⸦ ����� �� �����ȴ�.
 * bossPower�� Ŭ���� ������ �����Ǵ� ��� GameUnit �ν��Ͻ��� �����Ѵ�.
 * �� ���ֿ����� �������� bossPower �� 0 ���ϰ� �Ǹ� ������ ������(System.exit(1)).
 * �����ڿ����� �Ķ���ͷ� �� ������ �̸��� �޾� �ʱ�ȭ�ϰ� 
 * ���� �ν��Ͻ��� ����� unitPower�� ���� �����Ѵ�.
 */


class GameUnit  {
	static int bossPower = 1000;	// 
	private int unitPower = 500;	// �� ���ֿ� ���޵Ǵ� �⺻ power
	private MyWeapon weapon;
	private String name;
	
	GameUnit(String name){
		this.name = name;
		this.weapon = new MyWeapon();
		this.weapon.charge(unitPower);
	}
	//attack() ����
	public void attack(int power) {
		GameUnit.bossPower -= power;
		System.out.println("���� bossPower : " + GameUnit.bossPower );
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
