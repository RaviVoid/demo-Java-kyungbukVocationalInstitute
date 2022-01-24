import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for문, if~else문 for문 ★ ★★ ★★★ ★★★★ ★★★★★ 을 출력해보세요
 * 
 * @author smart04
 *
 */
public class Loop9_1 {

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
		i = 0;
		while (i < 5) {
			for (j = 0; j <= i; j++) {
				System.out.print("★");
			}
			i++;
			System.out.println();
		}
		// 별출력 조건문 종료-----------
		System.out.printf("=================\n");// 구분선
		// 별출력 조건문 시작-----------
		i = 1;
		while (i <= 5) {
			for (j = 1; j <= i; j++) {
				System.out.printf("★");
			}
			i++;
			System.out.printf("\n");
		}
		// 별출력 조건문 종료-----------
		System.out.printf("=================\n");// 구분선
		// 별출력 조건문 시작-----------
		i = 5;
		while (i >= 1) {
			j = 1;
			while (j <= i) {
				System.out.printf("★");
				j++;
			}
			i--;
			System.out.printf("\n");
		}
		// 별출력 조건문 종료-----------
		System.out.printf("=================\n");// 구분선
		// 별출력 조건문 시작-----------
		i = 1;
		while (i <= 5) {// 반복문 : 5줄까지
			// 조건문 : 1~3까지일 경우
			if (i <= 3) {
				j = 1;
				while (j <= i) {
					System.out.printf("★");
					j++;
				}
				System.out.printf("\n");
			} else { // 조건문 : 나머지일 경우 4~5
				j = 2;
				while (j >= 1) {
					System.out.printf("★");
					j--;
				}
				System.out.printf("\n");
			}
			i++;
		}
		// 별출력 조건문 종료-----------

	}
}
