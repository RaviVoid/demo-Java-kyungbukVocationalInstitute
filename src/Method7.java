/**
 * 계산기 프로그램을 작성하시오. 
 * 임의의 두수를 입력받아 + - * / 를 수행하시오. 
 * 출력값은 : 4 + 2 =6 .
 * 4 - 2 = 2.
 * 
 * @author smart04
 *
 */
public class Method7 {

	// 함수 : 더하기
	public static int plus(int i, int j) {
		return i + j;

	}

	// 함수 : 빼기
	public static int minus(int i, int j) {
		return i - j;

	}

	// 함수 : 곱하기
	public static int multiply(int i, int j) {
		return i * j;

	}

	// 함수 : 나누기
	public static double divide(int i, int j) {
		return (double)i / j;

	}

	// 함수 : 나머지값
	public static int remainder(int i, int j) {
		return i % j;
	}

	// 메인
	public static void main(String[] args) {
		int i = 7;// 변수선언 i
		int j = 3;// 변수선언 j
		int res1 = 0;// 수행된 결과값을 리턴해라
		int res2 = 0;// 수행된 결과값을 리턴해라
		int res3 = 0;// 수행된 결과값을 리턴해라
		double res4 = 0;// 수행된 결과값을 리턴해라
		int res5 = 0;// 수행된 결과값을 리턴해라
		res1 = plus(i, j);// 더하기 함수 호출
		res2 = minus(i, j);// 빼기 함수 호출
		res3 = multiply(i, j);// 곱하기 함수 호출
		res4 = divide(i, j);// 나누기 함수 호출
		res5 = remainder(i, j);// 나머지값 함수 호출
		
		System.out.println(i + " + " + j + " = " + res1);
		System.out.printf("%d + %d = %d\n", i, j, res1);
		System.out.println(i + " - " + j + " = " + res2);
		System.out.printf("%d - %d = %d\n", i, j, res2);
		System.out.println(i + " x " + j + " = " + res3);
		System.out.printf("%d x %d = %d\n", i, j, res3);
		System.out.println(i + " ÷ " + j + " = " + res4);
		System.out.printf("%d ÷ %d = %f\n", i, j, res4);
		System.out.println(i + " % " + j + " = " + res5);
		System.out.printf("%d %% %d = %d\n", i, j, res5);

	}

}