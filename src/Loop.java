/**
 * 반복문 for문 for(초기값;조건문;증감식){수행문} while문 {초기값; while(조건문){수행문;증감식} do~while문
 * 초기값; do{수행문;증감식(생략가능);}while(조건문); do~while문은 끝에 ";"세미콜론이 붙는다
 * 
 * @author smart04
 *
 */
public class Loop {

	public static void main(String[] args) {
		{
			for (int i = 0; i < 10; i++) { // 초기값은 일반적으로 0을 쓴다
				System.out.println(i + 1);
			}
			for (int i = 0; i < args.length; i++) {

			}
		}
		{
			for (int i = 1; i <= 10; i++) { // 초기값은 일반적으로 0을 쓴다
				System.out.println(i);
			}
		}
		{
			for (int i = 10; i >= 1; i--) { // 초기값은 일반적으로 0을 쓴다
				System.out.println(i);
			}
		}
	}
}
