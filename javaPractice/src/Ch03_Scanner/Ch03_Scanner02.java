package Ch03_Scanner;

import java.util.Scanner;

public class Ch03_Scanner02 {

	public static void main(String[] args) {
		/*
		 * Scanner.nextLine(): ���ڿ� �Է�
		 */
		String name;
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = sc.nextLine(); // ���ڿ��Է�
		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = sc.nextInt();
		
		System.out.println(name + "�� �ȳ��ϼ���! " + age + "���̽ó׿�.");
	}

}