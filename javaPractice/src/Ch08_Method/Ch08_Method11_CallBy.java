package Ch08_Method;


public class Ch08_Method11_CallBy {
			
		public static void main(String[] args) {

			/*
			 * ================= ���� ����. �� ���� (deep copy) ===============
			 * ������ ��ü�� ����ȴ�.
			 * ����� �� ��ü�� ������ �������� �޸𸮸� �����Ѵ�.
			 */
			int a = 1;
			int b = a;
			b++;
			
			System.out.println("a : " +a+ ", b : " + b); // a:  1, b: 2;
			
			/*
			 * ================ ���� ����. ���� ���� (shallow copy) ================
			 * �� ��ü�� �����ϴ� ���� �ƴ϶� �ּҰ��� �����Ͽ� ���� �޸𸮸� ����Ű�� �����̴�.
			 */
			
			int[] nums_01 = new int[1];
			nums_01[0] = 1;
			
			int[] nums_02 = nums_01;
			nums_02[0] = 2;
			
			System.out.println("nums_01[0] : " + nums_01[0] + ", nums_02 : " + nums_02[0]);
			// nums_01[0]: 2, nums_02[0]: 2
		}
	}
