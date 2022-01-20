/**
 * Operator 연산자
 * 
 * @author smart04
 *
 */
public class Operator2 {

	public static void main(String[] args) {
		//산술연산자 +, -, *, /, % (더하기,빼기,곱하기,나누기,나머지값)
		{
		double i = 10;
		int j = 3;
		
		System.out.println("i + j = " + (i + j));
		//우선순위로 괄호를 주어서 실행하도록 한다
		System.out.println("i + j = " + i + j);
		System.out.println("i - j = " + (i - j));
		System.out.println("i * j = " + (i * j));
		System.out.println("i / j = " + (i / j));
		System.out.println("i % j = " + (i % j));
		}
		double i = 10;
		int j = 3;
		
		System.out.printf/* 메소드 */("%f + %d = %2.2f", i, j, i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.printf("%.12f",i+j);
		System.out.println(i%j);
	}

}
