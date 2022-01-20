/**
 * 반복문 for문 for(초기값;조건문;증감식){수행문} while문 {초기값; while(조건문){수행문;증감식} do~while문
 * 초기값; do{수행문;증감식(생략가능);}while(조건문); do~while문은 끝에 ";"세미콜론이 붙는다 1~10까지 계산과정을
 * 출력해라 1~10까지 총합을 출력해라
 * 
 * @author smart04
 *
 */
public class Loop2_1 {

	public static void main(String[] args) {
		{
			int sum = 0;
			int i = 1;
			while (i <= 10) {
				System.out.printf("지금은 %d번 이다.\n", i);
				sum = sum + i;
				i++;

				System.out.printf("지금까지 소계는?\n %d이다.\n", sum);
			}
			System.out.printf("지금까지 총 합은 %d 이다.", sum);
		}
	}
}
