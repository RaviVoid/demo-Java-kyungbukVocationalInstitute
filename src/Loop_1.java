import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * for문 1부터 10까지 출력하세요
 * 
 * @author smart04
 *
 */
public class Loop_1 {

	public static void main(String[] args) {
		// 전체변수선언=========================
		int sum = 0;// sum(총합)
		int odd = 0;// odd(홀수)
		int even = 0;// even(짝수)
		int start = 0; // start(시작값)
		int end = 0; // end(종료값)
		int i = 0, j = 0, k = 0; // 자주쓰는것들 통합변수선언

		System.out.printf("=======선생님꺼=======\n");// 제목줄
		// 조건문 시작-----------
		i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}

	}
}
