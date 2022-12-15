package Ch23_school_conn_DB;

import java.util.Scanner;

public class SchoolView {
	public static void main(String[] args) {
		
		SchoolManage studentManage = new SchoolManage();
		Scanner input = new Scanner(System.in);
		System.out.println("teacher학생 관리 프로그램을 시작합니다.");
		
		while(true) {
			System.out.println("메뉴를 선택하세요. >>> ");
			System.out.println("1. 학생추가 및 수정 / 2. 학생삭제 / 3. 수강신청/ 4. 성적입력"
							+ "/ 5. 정보조회 / 6. 수강과목 관리 / 7.프로그램 종료");
			int menu = input.nextInt();
			switch(menu) {
			case 1:
				System.out.println("학생 추가 및 수정 메뉴입니다.");
				studentManage.addStudent();
				break;
			case 2:
				System.out.println("학생 삭제 메뉴입니다.");
				studentManage.removeStudent();
				// 객체 생성을 하지 않고, 클래스에서 바로 메서드로 접근을 했기 때문에
				// 메서드는 static으로 선언되어야 바로 사용이 가능하다.
				break;
			case 3:
				System.out.println("수강 신청 메뉴입니다.");
				studentManage.addClass();
				break;
			case 4:
				System.out.println("성적 입력 메뉴입니다.");
				studentManage.setScore();
				break;
			case 5:
				System.out.println("정보 조회 메뉴입니다.");
				studentManage.informStudent();
				break;
			case 6:
				System.out.println("수강과목 관리 메뉴입니다.");
				System.out.println("관리 메뉴를 선택하세요. >>> ");
				while(true) {
					System.out.println("1.수강과목 등록 / 2.수강과목 삭제 / 3. 등록과목 조회 / 4. 메인메뉴로");
					int manageMenu;
					manageMenu = input.nextInt();
					
					switch (manageMenu) {
						case 1 : 
							System.out.println("===== 수강과목 등록 메뉴 =====");
							studentManage.insertSubject();
							continue;
						case 2 : 
							System.out.println("===== 수강과목 삭제 메뉴 =====");
							studentManage.removeSubject();
							continue;
						case 3 :
							System.out.println("===== 등록과목 조회 =====");
							studentManage.printSubjectAll();
							continue;
						case 4 : 
							 break;
						default :
							System.out.println("없는 메뉴를 선택하였습니다.");
							continue;
					}
					break;
				}
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("없는 메뉴를 선택하였습니다.");
			}
		}
	}
}