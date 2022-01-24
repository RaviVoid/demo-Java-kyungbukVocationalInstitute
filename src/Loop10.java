import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for문, if~else문 for문 ★ ★★ ★★★ ★★★★ ★★★★★ 을 출력해보세요
 * 
 * @author smart04
 *
 */
public class Loop10 {

	public static void main(String[] args) {
		// 전체변수선언=========================
		int sum = 0;// sum(총합)
		int odd = 0;// odd(홀수)
		int even = 0;// even(짝수)
		int start = 0; // start(시작값)
		int end = 0; // end(종료값)
		int i = 0, j = 0, k = 0; // 자주쓰는것들 통합변수선언
		char text = 0;

		System.out.printf("=======피보나치수열=======\n");// 제목줄

		// A(n+2)=A(n+0)+A(n+1) 피보나치수열
		// 1,1,2,3,5,8,13
		int m = 0;
		int n = 1;
		int o = m + n;
		for (int r = 1; r <= 7; r++) {
			m = n;
			n = o;
			o = m + n;
			System.out.printf(" %d", m);

		}
		System.out.printf("\n\n=======대문자A~Z출력=========\n");// 제목줄
		for (i = 0; i <= 25; i++) {
			text = (char) (i + 'A');
			System.out.printf(" %c", text);
		}
		System.out.printf("\n\n=======소문자a~z출력=========\n");// 제목줄
		for (i = 0; i <= 25; i++) {
			text = (char) (i + 'a');
			System.out.printf(" %c", text);
		}
		System.out.printf("\n\n=======소문자a~z출력=========\n");// 제목줄
		for (i = 'a'; i <= 'z'; i++) {
			text = (char) i;
			System.out.printf(" %c", text);
		}
	}
}