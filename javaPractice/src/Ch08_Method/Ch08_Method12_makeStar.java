package Ch08_Method;

import java.util.Scanner;

public class Ch08_Method12_makeStar {

		/*return ���� ���� �޼ҵ�
		    * ���Ϻ��� ������ ���� �ﰢ���� ǥ��*/
		   static void putStars(int n) {
		      //���� *�� n�� ���� ǥ��
		      while(n-- >0)
		         System.out.print("*");
		   }
		   
		   public static void main(String[] args) {

		      Scanner scanner = new Scanner(System.in);
		      
		      System.out.println("���Ϻ��� ������ ���� �ﰢ���� ǥ���մϴ�.");
		      System.out.print("�� �� : ");
		      int n = scanner.nextInt();
		      
		      for(int i=1; i<=n; i++) {
		         putStars(i);
		         System.out.println( );
		      }
		   }
}
