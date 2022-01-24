import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for문, if~else문 for문 ★ ★★ ★★★ ★★★★ ★★★★★ 을 출력해보세요
 * 
 * @author smart04
 *
 */
public class Loop9 {

	public static void main(String[] args) {
		// 전체변수선언=========================
		int sum = 0;// sum(총합)
		int odd = 0;// odd(홀수)
		int even = 0;// even(짝수)
		int start = 0; // start(시작값)
		int end = 0; // end(종료값)
		int i = 0, j = 0, k = 0; // 자주쓰는것들 통합변수선언

		System.out.printf("=======선생님꺼=======\n");// 제목줄
		// 별출력 조건문 시작-----------
		for (i = 0; i < 5; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		// 별출력 조건문 종료-----------
		System.out.printf("=================\n");// 구분선
		// 별출력 조건문 시작-----------
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.printf("★");
			}
			System.out.printf("\n");
		}
		// 별출력 조건문 종료-----------
		System.out.printf("=================\n");// 구분선
		// 별출력 조건문 시작-----------
		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.printf("★");
			}
			System.out.printf("\n");
		}
		// 별출력 조건문 종료-----------
		System.out.printf("=================\n");// 구분선
		// 별출력 조건문 시작-----------
		for (i = 1; i <= 5; i++) {// 반복문 : 5줄까지
			// 조건문 : 1~3까지일 경우
			if (i <= 3) {
				for (j = 1; j <= i; j++) {
					System.out.printf("★");
				}
				System.out.printf("\n");
			} else { // 조건문 : 나머지일 경우 4~5
				for (j = 2; j >= 1; j--) {
					System.out.printf("★");
				}
				System.out.printf("\n");
			}
		}
		// 별출력 조건문 종료-----------

	}
}
