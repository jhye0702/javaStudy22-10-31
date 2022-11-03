package Ch04_If;

import java.util.Scanner;

public class Ch04_If09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("성적을 입력하세요 : ");
		int grade = scanner.nextInt();
		grade = (grade/10)*10; // switch문에서는 성적을 정수화 시키는게 핵심입니다!!
		
		switch (grade) {
		case 100: case 90: 
			System.out.println("A입니다");
			break;
		case 80:
			System.out.println("B입니다");
			break;
		case 70:
			System.out.println("C입니다");
			break;
		case 60:
			System.out.println("D입니다");
			break;
		default:
			System.out.println("F입니다");
		}
		scanner.close();
	}

}
