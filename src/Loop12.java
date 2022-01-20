import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Scanner, for문, if~else문 for문 ★ ★★ ★★★ ★★★★ ★★★★★ 을 출력해보세요
 * 
 * @author smart04
 *
 */
public class Loop12 {

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
		
		for(i = 0; i < 10; i++) {
			
			//i값이 5이면 멈춰라
			if(i == 5) {
			break;
			}
			System.out.println(i);
		}
		
		
	}
}