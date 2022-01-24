import java.time.LocalDateTime;

/**
 * 반복문 for문 for(초기값;조건문;증감식){수행문} while문 {초기값; while(조건문){수행문;증감식} do~while문
 * 초기값; do{수행문;증감식(생략가능);}while(조건문); do~while문은 끝에 ";"세미콜론이 붙는다. 현재시간을 출력해보세요
 * 
 * @author smart04
 *
 */
public class Loop7 {

	public static void main(String[] args) {

		for (;;) {

			LocalDateTime ldt = LocalDateTime.now(); // 내컴퓨터의 시간을 가져옴
			System.out.print(ldt.getHour() + ":");
			System.out.print(ldt.getMinute() + ":");
			System.out.printf("%d%n", ldt.getSecond());
			// System.out.print("\n");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}
}
