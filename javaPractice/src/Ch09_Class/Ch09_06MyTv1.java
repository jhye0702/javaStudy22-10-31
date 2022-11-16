package Ch09_Class;

class MyTv {
	
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	//상수는 값을 변경 못하는게 가장 큰 특징! 변수만드는 것처럼 해서 앞에 final을 붙임.
	
	void turnOff() {
		// (1) isPowerON의 값을 true를 false로, false를 true로 변경
		isPowerOn = !isPowerOn;
	}
	void volumeUp() {
		// (2) volume의 값을 MAX_VOLUME보다 낮을 경우에는 1 증가.
		volume = (volume < MAX_VOLUME)? volume+1 : volume;
	}
	void volumeDown() {
		// (3) volume의 값을 MIN_VOLUME보다 높을 경우에는 1 감소.
		volume = (volume > MIN_VOLUME)? volume-1 : volume;
	}
	void channelUp() {
		// (4) channel의 값을 1 증가.
		// MAX_CHANNEL 보다 올라갈 수 없음.
		channel = (channel == MAX_CHANNEL)? MAX_CHANNEL : channel + 1;
	}
	void channelDown() {
		// (5) channel의 값을 1 감소.
		// MIN_CHANNEL 보다 내려갈 수 없음.
		channel = (channel == MIN_CHANNEL)? MIN_CHANNEL : channel - 1;
	}
}

public class Ch09_06MyTv1 {

	public static void main(String[] args) {

		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		// 출력 -> CH:100, VOL:0
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		// 출력 -> CH:99, VOL:0
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		// 출력 -> CH:100, VOL:100
		
		t.turnOff();
		System.out.println("Tv 동작 : " + t.isPowerOn);
		t.turnOff();
		System.out.println("Tv 다시동작 : " + t.isPowerOn);
		t.channelUp();
		System.out.println("CH:" + t.channel);
		t.channel = 0;
		t.channelDown();
		System.out.println("CH:" + t.channel);
		
	}

}
