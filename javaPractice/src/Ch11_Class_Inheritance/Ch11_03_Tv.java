package Ch11_Class_Inheritance;

class Tv{
	boolean power;		// 전원상태 (on/off)
	int channel;		// 채널
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
class CaptionTv extends Tv{
	boolean caption;			// 캡션상태 (on/off)
	void displayCaption (String text) {
		if (caption) {			// 캡션 상태가 on(true)일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

public class Ch11_03_Tv {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;					// 조상 클래스로부터 상속받은 멤버
		ctv.channelUp();					// 조상 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World");	// 왜 실행이 안될까? boolean 값은 초기값이 무조건 false. 
											// displayCaption의 if문 조건이 false상태라 실행이 되지 않은것.
		ctv.caption = true;					// 캡션 기능을 켠다.
		ctv.displayCaption("Hello, World");	// 캡션을 화면에 보여준다.
	}

}
