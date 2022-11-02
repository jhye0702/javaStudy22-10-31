package Ch03_Scanner;

import java.util.Scanner;

public class Ch03_Scanner02 {

	public static void main(String[] args) {
		/*
		 * Scanner.nextLine(): 문자열 입력
		 */
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		name = sc.nextLine(); // 문자열입력
		System.out.print("나이를 입력하시오: ");
		age = sc.nextInt();
		
		System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
	}

}
