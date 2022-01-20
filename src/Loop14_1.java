import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * for문 1부터 10까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하세요.
 * 
 * @author smart04
 *
 */
public class Loop14_1 {

	public static void main(String[] args) {
		// 전체변수선언=========================
		int sum = 0;// sum(총합)
		int odd = 0;// odd(홀수)
		int even = 0;// even(짝수)
		int start = 0; // start(시작값)
		int end = 0; // end(종료값)
		int quotient = 0; // quotient(나눗셈의 몫)
		int i = 0, j = 0, k = 0; // 자주쓰는것들 통합변수선언
		char text = 0;
		// 전체변수선언 끝======================

		// 제목줄 출력
		System.out.println("===반복문1 : 3의 배수의 총합을 출력해라===");
		// 제목줄 출력 종료

		// 반복문 : 1부터 10까지의 정수를 출력
		start = 1;
		end = 10;
		for (i = start; i <= end; i++) {

			// 조건문 : 3의 배수를 검출
			if (i % 3 == 0) {
				sum += i; // sum = sum + i // 3의 배수라면 sum에 저장

				System.out.printf("%d", i); // sum에 사용된 값을 순차적 출력

				// 최대값에서 3을 나눠서 몫을 구함
				quotient = (end / 3);

				// 몫에서 3을 곱해주면 원래 3의 배수 최대값이 나옴
				if (i != (quotient * 3)) {
					System.out.printf(" + "); // sum값 사이사이에 +를 넣어라
				}
			}

		}
		// 반복문 종료
		System.out.printf("\n= %d\n", sum); // sum 최종값을 출력
		// 구분선 출력
		System.out.println("===============");
		// 구분선 출력 종료
		
		// 제목줄 출력
		System.out.println("===반복문2 : 3의 배수의 총합을 출력해라===");
		// 제목줄 출력 종료

		// 반복문 : 1부터 10까지의 정수를 출력
		start = 1;
		end = 10;
		sum = 0;
		for (i = start; i <= end; i++) {

			// 조건문 : 3의 배수를 검출
			if (i % 3 == 0) {
				sum += i; // sum = sum + i // 3의 배수라면 sum에 저장

				System.out.printf("%d", i); // sum에 사용된 값을 순차적 출력

				// 몫에서 3을 곱해주면 원래 3의 배수 최대값이 나옴
				if (i != end-(end%3)) {
					System.out.printf(" + "); // sum값 사이사이에 +를 넣어라
				}
			}

		}
		// 반복문 종료
		System.out.printf("\n= %d\n", sum); // sum 최종값을 출력
		// 구분선 출력
		System.out.println("===============");
		// 구분선 출력 종료
	}
}

