package Ch09_Class;

public class Ch09_04Student_A {

	public static void main(String[] args) {
		
		// 역설계 해보기
		
		Student_A s = new Student_A();
		s.name	= "홍길동";
		s.ban	= 1;
		s.no	= 1;
		s.kor	= 100;
		s.eng	= 60;
		s.math	= 76;
		
		System.out.println("이름 : " + s.name);
		System.out.println("총점 : " + s.getTotal());
		System.out.println("평균 : " + s.getAverage());
	}

}

	class Student_A {
		String name;
		int ban, no, kor, eng, math;
		
		int getTotal() {
			return kor + eng + math;
		}
		float getAverage() {
			return (float)this.getTotal() / 3;	
			// 이렇게 쓰는게 좋은 이유 : 
			// 1. 순수하게 총점 계산, 2. 평균을 내기 위해 총점 계산 두번이 필요.
			// 위에서 총점 계산한 것을 가져다 쓰면 총점 계산이 1번만 이루어지면 됨.
		}
		
	}
		
		// static을 쓰고 안쓰고 차이는 뭔가요?
		