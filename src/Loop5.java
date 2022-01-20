/**
 * 반복문 for문 for(초기값;조건문;증감식){수행문} while문 {초기값; while(조건문){수행문;증감식} do~while문
 * 초기값; do{수행문;증감식(생략가능);}while(조건문); do~while문은 끝에 ";"세미콜론이 붙는다. 2022년 1월달 일자를
 * 출력하시오(1~31) 반복해서 출력해보세요
 * 
 * @author smart04
 *
 */
public class Loop5 {

	public static void main(String[] args) {
		int year = 2022; // 년도 입력
		System.out.printf("올해는 %d년 입니다.\n", year);

		for (int month = 1; month <= 12; month++) { // 월 카운팅
			int lastDayOfMonth = 0;
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				lastDayOfMonth = 31;
				break;
			case 2:
				lastDayOfMonth = 28;
				break;
			default:
				lastDayOfMonth = 30;
				break;
			}
			System.out.printf("\n이달은 %d월 입니다.--------------------------\n", month);

			{
				System.out.printf("%d월은 아래와 같습니다\n", month);
				for (int date = 1; date <= lastDayOfMonth; date++) {
					System.out.printf(" %d", date);
				}
				System.out.printf("\n------------------------------------------\n");
			}
		}
	}
}
