package Ch19_disign_patton_school;

import java.util.Scanner;

public class SchoolManageView {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생 관리 프로그램을 시작합니다.");
		
		while(true) {
			System.out.println("메뉴를 선택하세요. ");
			System.out.println("1. 학생추가 및 수정 / 2. 학생삭제 / 3. 수강신청/ 4. 성적입력 / 5. 정보조회 / 6. 프로그램 종료 >>>");
			int menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.println("학생 추가 및 수정 메뉴입니다.");
				StudentManage.addStudent();
				break;
			case 2:
				System.out.println("학생 삭제 메뉴입니다.");
				StudentManage.removeStudent();
				// 객체 생성을 하지 않고, 클래스에서 바로 메서드로 접근을 했기 때문에
				// 메서드는 static으로 선언되어야 바로 사용이 가능하다.
				break;
			case 3:
				System.out.println("수강 신청 메뉴입니다.");
				StudentManage.addClass();
				break;
			case 4:
				System.out.println("성적 입력 메뉴입니다.");
				StudentManage.setScore();
				break;
			case 5:
				System.out.println("정보 조회 메뉴입니다.");
				StudentManage.informStudent();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
			default:
				System.out.println("없는 메뉴를 선택하였습니다.");
			}
		}
	}
}
