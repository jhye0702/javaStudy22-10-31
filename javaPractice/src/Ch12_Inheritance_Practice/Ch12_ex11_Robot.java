package Ch12_Inheritance_Practice;

class Robot{ }

class DanceRobot extends Robot {
	void dance() {
		System.out.println("���� ��ϴ�.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�� �θ��ϴ�.");
	}	
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��� �׸��ϴ�.");
	}
}

public class Ch12_ex11_Robot {
/*
 * (1) instanceof�� ����ؼ� action�޼��带 �ۼ��Ͻÿ�.
 */
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			// �θ�Ÿ�Կ��� �ڽ�Ÿ������ ������ �� �� ��ȯ�� �����־����.
			dr.dance();
		}
		if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}
		if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}
}
