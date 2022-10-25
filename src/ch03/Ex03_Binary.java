package ch03;

/**
 * 이항 연산자
 */
public class Ex03_Binary {

	public static void main(String[] args) {
		int a = 2000000000;
		int b = a * 2;	// int 표시 범위를 벗어남
		System.out.println(b);
		System.out.printf("%d, %d%n", Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println(safeAdd(a, a));
		System.out.println(safeAdd(-a, -a));
		System.out.println(safeAdd(a, 100000000));
		
		int c = 3, d = 4;
		int res1 = c / d;		// 0.75, 결과값이 정수로 받게 되므로 0이 됨
		System.out.println(res1);
		double res2 = c / d;	// 연산 결과가 0, 이후에 실수 변환
		System.out.println(res2);
		double res3 = c / (double)d;	// 연산할 때 실수 변환, 올바른 결과
		System.out.println(res3);
		System.out.println(4 / 3.);
		
		System.out.println(Double.NaN); 	// 0.0 / 0.0, 부정
		System.out.println(Double.POSITIVE_INFINITY); 	// 3.0 / 0.0, 불능
		System.out.println(3. / 0.);		// Infinity
		
		// 비교 연산자
		System.out.println(3 == 3);
		System.out.println(3.0 == 3.0); 	// 실수연산에서 같으냐를 비교하는 것은 위험함
		System.out.println(Math.abs(3.0 - 1.2+3.3-1.5) < 1e-15); 	// 차이의 절대값이 1E-15 보다 작냐로 비교
	}
	
	private static int safeAdd(int x, int y) {		// method, 다른 언어에서는 함수
		if (x > 0 && y > 0 && y > Integer.MAX_VALUE - x)
			return 0;
		if (x < 0 && y < 0 && y < Integer.MIN_VALUE - x)
			return 0;
		return x + y;
	}
}
