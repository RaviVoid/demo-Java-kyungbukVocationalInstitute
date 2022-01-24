/**
 * 계산기 프로그램을 작성하시오. 
 * 임의의 두수를 입력받아 + - * / 를 수행하시오. 
 * 출력값은 : 4 + 2 =6 .
 * 4 - 2 = 2.
 * 
 * @author smart04
 *
 */
public class Method6 {

	// 함수 : 더하기
	public static void plus(int i, int j) {
		System.out.printf("%d + %d = %d\n", i, j, (i + j));
		System.out.println(i +" + "+ j +" = "+ (i + j));
	}

	// 함수 : 빼기
	public static void minus(int i, int j) {
		System.out.printf("%d - %d = %d\n", i, j, (i - j));
		System.out.println(i +" - "+ j +" = "+ (i - j));
	}

	// 함수 : 곱하기
	public static void multiply(int i, int j) {
		System.out.printf("%d x %d = %d\n", i, j, (i * j));
		System.out.println(i +" x "+ j +" = "+ (i * j));
	}

	// 함수 : 나누기
	public static void divide(int i, int j) {
		System.out.printf("%d ÷ %d = %d\n", i, j, (i / j));
		System.out.println(i +" ÷ "+ j +" = "+ (i / j));
	}

	// 함수 : 나머지값
	public static void remainder(int i, int j) {
		System.out.printf("%d %% %d = %d\n", i, j, (i % j));
		System.out.println(i +" % "+ j +" = "+ (i % j));
	}

	// 메인
	public static void main(String[] args) {
		int i = 4;// 변수선언 i
		int j = 2;// 변수선언 j
		plus(i, j);// 더하기 함수 호출
		minus(i, j);// 빼기 함수 호출
		multiply(i, j);// 곱하기 함수 호출
		divide(i, j);// 나누기 함수 호출
		remainder(i, j);// 나머지 함수 호출

	}

}