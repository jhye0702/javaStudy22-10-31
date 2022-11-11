package Ch08_Method;

import java.util.Scanner;

public class Ch08_Method12_makeStar {

		/*return 값은 없는 메소드
		    * 최하변이 직각인 직각 삼각형을 표시*/
		   static void putStars(int n) {
		      //문자 *을 n개 연속 표시
		      while(n-- >0)
		         System.out.print("*");
		   }
		   
		   public static void main(String[] args) {

		      Scanner scanner = new Scanner(System.in);
		      
		      System.out.println("최하변이 직각인 직각 삼각형을 표시합니다.");
		      System.out.print("몇 단 : ");
		      int n = scanner.nextInt();
		      
		      for(int i=1; i<=n; i++) {
		         putStars(i);
		         System.out.println( );
		      }
		   }
}
