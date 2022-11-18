package Ch10_Class_constructor;
/*
 * setter : Ŭ���� �ܺο��� ���� �޾Ƽ� ��� ������ ����
 * return type�� void
 * �Ű� ������ ������ ��������� ���� type�̾����.
 * �̸� �տ� set�� ���̰� �ڿ��� ������ ��� ������ �̸�
 * 
 * getter : Ŭ���� �ܺο� ��������� ���� ����(��ȯ)
 * return type�� ������ ��������� �ڷ����� ��ġ
 * �Ű������� �ʿ����.
 * �̸� �տ� get�� ���̰� �ڿ��� ������ ��������� �̸�.
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
