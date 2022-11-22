package Ch11_Class_Inheritance;

class Tv{
	boolean power;		// �������� (on/off)
	int channel;		// ä��
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
class CaptionTv extends Tv{
	boolean caption;			// ĸ�ǻ��� (on/off)
	void displayCaption (String text) {
		if (caption) {			// ĸ�� ���°� on(true)�� ���� text�� �����ش�.
			System.out.println(text);
		}
	}
}

public class Ch11_03_Tv {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;					// ���� Ŭ�����κ��� ��ӹ��� ���
		ctv.channelUp();					// ���� Ŭ�����κ��� ��ӹ��� ���
		System.out.println(ctv.channel);
		
		ctv.displayCaption("Hello, World");	// �� ������ �ȵɱ�? boolean ���� �ʱⰪ�� ������ false. 
											// displayCaption�� if�� ������ false���¶� ������ ���� ������.
		ctv.caption = true;					// ĸ�� ����� �Ҵ�.
		ctv.displayCaption("Hello, World");	// ĸ���� ȭ�鿡 �����ش�.
	}

}
