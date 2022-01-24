import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * for문 50번까지 반복 삼육구를 출력하세요 3의 배수일때는 짝이라고 출력하세요 System.out.println("짝");
 * 
 * @author smart04
 *
 */
public class Loop15 {

	public static void main(String[] args) {
		// 전체변수선언=========================
		int sum = 0;// sum(총합)
		int odd = 0;// odd(홀수)
		int even = 0;// even(짝수)
		int start = 0; // start(시작값)
		int end = 0; // end(종료값)
		int i = 0, j = 0, k = 0; // 자주쓰는것들 통합변수선언
		char text = 0;
		// 전체변수선언 끝======================

		// 제목줄 출력
		System.out.println("===반복문 : 1부터 50까지 출력해라===");
		// 제목줄 출력 종료

		for (i = 1; i <= 50; i++) {

			// 조건문 : 3의 배수일경우에 짝을 출력하고 지나가라
			if (i % 3 == 0) {
				System.out.printf("짝(3의배수)=%d\n", i);
				continue;
			}
			// 조건문 : 3의 배수일경우에 짝을 출력하고 지나가라 종료

			// 조건문 : 3의 배수 앞일경우에 경고문을 출력하고 지나가라
			if (i % 3 == 2) {
				System.out.printf("%d=다음은 짝입니다 긴장하세요\n", i);
				continue;
			}
			// 조건문 : 3의 배수 앞일경우에 경고문을 출력하고 지나가라 종료

			// 3의 배수를 빼고 나머지를 출력해라
			System.out.println(i);
			// 3의 배수를 빼고 나머지를 출력해라 종료

		}
		// 반복문 : 1부터 50까지 출력해라 종료

		// 구분선 출력
		System.out.println("===============");
		// 구분선 출력 종료

	}
}