package Ch08_Method;

import java.util.Random;
import java.util.Scanner;

public class Ch08_Method13 {
		
	
			static Scanner stdIn = new Scanner(System.in); // �� �޼��忡�� ����ϱ� ���� Ŭ���� ������ ����
			// �ۿ� �� ������ main�Լ��� �޼��� �Լ��� scanner�� ����ϱ� ����!
			// �׷��� �߰�ȣ �ȿ� �� �Լ��� ���� ���� �� ���� �����ذ�.
			
			//���� ������ Ȯ��
			static boolean confirmRetry() { // �Ű������� ���޹��� �ʴ� �޼���
				int cont;
				do {
					System.out.print("�ٽ� �ѹ�? <Yes-1 / No-0> : ");
					cont = stdIn.nextInt();
				}while (cont != 0 && cont != 1);
				return cont == 1; // cont�� 1�̸� true, �ƴϸ� false
				// return if(cont == 1) { true; } if(cont == 0) { false; }
			}
	
			public static void main(String[] args) {
				Random rand = new Random();
				
				System.out.println("�ϻ� Ʈ���̴�!!!");
				do {
					// random.nextInt(n) : 0 ~(n-1) ������ ������ �������� ��ȯ
					int x = rand.nextInt(900) + 100;	// 3�ڸ����� ��
					int y = rand.nextInt(900) + 100;	// 3�ڸ����� ��
					int z = rand.nextInt(900) + 100;	// 3�ڸ����� ��
					
					while(true) {
						System.out.print(x + " + " + y + " + " + z + " = ");
						int k = stdIn.nextInt( );		// �Է��� ��
						if (k == x + y + z)				// ����
							break;
						System.out.println("Ʋ�Ƚ��ϴ�!!");
					}
				} while (confirmRetry());
		}
	}
