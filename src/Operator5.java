/**
 * Operator 연산자
 * 
 * @author smart04
 *
 */
public class Operator5 {

	public static void main(String[] args) {
		// 대입연산자 (=, +=, -=, *=, /=, %= ...)
		int x = 1, y = 2, z = 0;
		{
			x += y; // x = x + y; //x값이 x+y값으로 바뀐다
			// x중복시 제거 가능
			// 대입연산자를 사용시에 컴퓨터의 연산속도가 빨라진다
		}
		{
			x -= y; // x = x - y;
		}
		System.out.println("====대입연산자====");
		System.out.println(x);
		{
			// 삼항연산자 (조건문)?참:거짓;
			// 시험성적이 60점 미만이면 재시험 아니면 패스
			int score = 100;
			String str = (score < 60) ? "재시험" : "패스";
			System.out.println("====삼항연산자=====");
			System.out.println(str);
		}
		{
			String i = "textuF";// C언어처럼텍스트는넣을수없나
			char j = 't';// char은 한글자만 출력가능
			//홑따옴표로 감싸는 것이 중요함
			int k = 10;
			System.out.println(i);
			System.out.println(j);
			System.out.printf("텍스트 %c를 출력합니다", j);
		}
	}
}

/*
 * printf()
 * 
 * %d * (decimal) 정수 형식으로 출력
 * %f * (floating-point) 실수 형식으로 출력
 * %c * (character) 문자 형식으로 출력
 * %s * (string) 문자열 형식으로 출력
 * %b * (boolean) 논리 형식으로 출력
 */
