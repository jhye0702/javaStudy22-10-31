package Ch09_Class;

class MyMath {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	long add(long a, int b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
	long add(int a, long b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}
	int add(int[] a) {										// 배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}

public class Ch09_14MyMath {
	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		System.out.println("mm.add(3, 3) 결과: " + mm.add(3, 3));
		// int add(int a, int b) - mm.add(3, 3) 결과 : 6
		System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L, 3));
		// long add(long a, int b) - mm.add(3L, 3) 결과 : 6
		System.out.println("mm.add(3, 3L) 결과: " + mm.add(3, 3L));
		// long add(int a, long b) - mm.add(3, 3L) 결과 : 6
		System.out.println("mm.add(3, 3L) 결과: " + mm.add(3L, 3L));
		// long add(long a, long b) - mm.add(3L, 3L) 결과 : 6
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
		// int add(int[] a) - mm.add(a) 결과: 600
	}
	
}
