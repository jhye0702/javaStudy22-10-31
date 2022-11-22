package Ch12_Inheritance_Practice;

public class Pet {
	private String name;		// 애완 동물의 이름
	private String masterName;	// 주인의 이름
	
	public Pet(String name, String masterName) {		// 생성자
		// super();				// 지워도, 놔둬도 실행됨
		this.name = name;							// 애완동물의 이름
		this.masterName = masterName;					// 주인의 이름
	}
	
	public String getName( ) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMasterName() {
		return masterName;
	}
	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}
	public void introduce( ) {
		System.out.print("■ 내 이름은 " + name + "입니다!");
		System.out.println(" ■ 주인님은 " + masterName + "입니다!");
	}
	
}
