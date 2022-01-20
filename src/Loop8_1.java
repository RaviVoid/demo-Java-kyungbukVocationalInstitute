import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for문, if~else문 1부터 10까지의 홀수합, 짝수합, 총합을 출력해보세요
 * 
 * @author smart04
 *
 */
public class Loop8_1 {

	public static void main(String[] args) {
		// 전체변수선언=========================
		int sum = 0;// sum(총합)
		int odd = 0;// odd(홀수)
		int even = 0;// even(짝수)
		int start = 0; // start(시작값)
		int end = 0; // end(종료값)

		// ==================================시작값 입력
		Scanner scan = new Scanner(System.in); // 값을 입력받는 함수 Scan
		System.out.println("아래에 커서를 두고 시작값을 입력하세요.");
		start = scan.nextInt();

		// ==================================종료값 입력
		System.out.println("아래에 커서를 두고 종료값을 입력하세요.");
		end = scan.nextInt();

		// ==================================짝홀수합
		// 홀짝검출 조건문 시작-----------
		int i = start;
		while (i <= end) {
			if (i % 2 == 0) {// 짝수인가?
				even += i; // even = even + i;// 짝수만더해라
			} else {// 홀수인가?
				odd += i; // odd = odd + i;// 홀수만더해라
			}
			i++;
		}
		// 홀짝검출 조건문 종료-----------

		sum = odd + even;// sum=홀수+짝수

		// ==================================출력문
		System.out.println("총합:" + sum);
		System.out.println("홀수합:" + odd);
		System.out.println("짝수합:" + even);
	}
}
