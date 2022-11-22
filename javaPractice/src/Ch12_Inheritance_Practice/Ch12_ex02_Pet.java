package Ch12_Inheritance_Practice;

public class Ch12_ex02_Pet {
	
	// p가 참조하는 인스턴스에 자기소개를 시킨다.
	static void intro(Pet p) {
		p.introduce();
	}
	
	public static void main(String[] args) {
		// 애완동물 클래스의 이용
		// 예(메소드의 인수로 다형성을 검증)
		
		Pet[] a = {
				new Pet("Kurt", "아이"),			// Pet a = new Pet
				new RobotPet("R2D2", "루크"),	// Pet a = new RobotPet
				new Pet("마이클", "영진")			// Pet a = new Pet
		};
		
		for (Pet p : a) {
			intro(p);				// p가 참조하는 인스턴스에 자기소개를 시킨다
			System.out.println( );
		}
		
	}
}
