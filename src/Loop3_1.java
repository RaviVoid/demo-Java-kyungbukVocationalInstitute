/**
 * 반복문 for문 for(초기값;조건문;증감식){수행문} while문 {초기값; while(조건문){수행문;증감식} do~while문
 * 초기값; do{수행문;증감식(생략가능);}while(조건문); do~while문은 끝에 ";"세미콜론이 붙는다 2022년부터 본인의
 * 생년까지 반복해서 출력해보세요
 * 
 * @author smart04
 *
 */
public class Loop3_1 {

	public static void main(String[] args) {

		int i = 2022;
		while (i >= 1981) {

			System.out.printf("지금은 %d년이다. 나이는 %d살이다.\n", i, (i - 1980));
			i--;
		}
		i = 2022;
		int myAge = 1996;
		while (i >= myAge) {

			System.out.printf("년도 %d, 나이 %d %n", i, i - (myAge - 1)); // syso 적고 Ctrl+Space 누르면 완성됨
			i--;
		}

	}
}
