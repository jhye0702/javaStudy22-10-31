package Ch10_Class_constructor;
/*
 * setter : 클래스 외부에서 값을 받아서 멤버 변수에 저장
 * return type은 void
 * 매개 변수는 수정할 멤버변수와 같은 type이어야함.
 * 이름 앞에 set을 붙이고 뒤에는 수정할 멤버 변수의 이름
 * 
 * getter : 클래스 외부에 멤버변수의 값을 전달(전환)
 * return type은 참조할 멤버변수의 자료형과 일치
 * 매개변수는 필요없음.
 * 이름 앞에 get을 붙이고 뒤에는 리턴할 멤버변수의 이름.
 */

public class Ch10_11GetSet {

	private String name;
	private int age;
	private short grade;
	private double avg;
	private int[] numArr;
	
	public void setName(String name) {
		name = this.name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		age = this.age;
	}
	public int getAge() {
		return age;
	}
	public void setGrade(short grade) {
		grade = this.grade;
	}
	public short getGrade() {
		return grade;
	}
	public void setAvg(double avg) {
		avg = this.avg;
	}
	public double getAvg() {
		return avg;
	}
	public void setNumArr(int[] numArr) {
		numArr = this.numArr;
	}
	public int[] getNumArr() {
		return numArr;
	}
	
}
