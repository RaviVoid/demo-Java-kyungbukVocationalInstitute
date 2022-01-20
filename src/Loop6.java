/**
 * 반복문 for문 for(초기값;조건문;증감식){수행문} while문 {초기값; while(조건문){수행문;증감식} do~while문
 * 초기값; do{수행문;증감식(생략가능);}while(조건문); do~while문은 끝에 ";"세미콜론이 붙는다. 현재시간을 출력해보세요
 * 
 * @author smart04
 *
 */
public class Loop6 {

	public static void main(String[] args) {
		int hour = 0, min = 0, sec = 0; // 시hour,분min,초sec 변수지정
		hour = 14; // 시간 입력
		min = 20; // 분 입력
		sec = 3; // 초 입력
		int sumSec = (hour * 60 * 60) + (min * 60) + (sec);

		sumSec++;

		System.out.println(sumSec); // 오후2시 20분에 해당하는 전체초
		System.out.println(sumSec / (60 * 60)); // 현재 시간 14
		System.out.println((sumSec / (60)) % 60); // 현재 분 1203
		System.out.println(sumSec % (60)); // 현재 초

		for (;;) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
