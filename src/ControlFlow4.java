/**
 * 근무연수에 따른 연차 갯수를 산출하시오 년차-일수 01-15 02-15 03-16 04-16 05-17 06-17 07-18 08-18
 * 09-19 10-19 ~ 21-25 22-25 나머지는 25개
 * 
 * @author smart04
 *
 */
public class ControlFlow4 {

	public static void main(String[] args) {
		// 연차산출프로그램 if문
		System.out.printf("연차산출프로그램 if문=====\n\n");
		int i = 20 * 12 + 2;//변수 선언, 총 근무개월수 산출
		System.out.printf("총 근무개월수는 %d개월 입니다.\n", i);
		int year = i / 12;//변수 선언, 근무연수 산출
		System.out.printf("근속연수는 %d년 %d개월 입니다.\n\n", year, i % year);
		// 60*60*24 초단위 기입방법
		{

			{

				if (year < 1) {//1년차에는 1개월 만근할 경우에 다음달에 연차 1개를 쓸 수 있다
					System.out.printf("연차는 %d개입니다.\n", (i - 1));
				} else if (year >= 1) {//1년차가 아닐경우에 다음을 따른다
					if (year <= 2) {//2년차, 3년차 결과출력
						System.out.printf("연차는 15개입니다.\n");
					} else if (year <= 4) {
						System.out.printf("연차는 16개입니다.\n");
					} else if (year <= 6) {
						System.out.printf("연차는 17개입니다.\n");
					} else if (year <= 8) {
						System.out.printf("연차는 18개입니다.\n");
					} else if (year <= 10) {
						System.out.printf("연차는 19개입니다.\n");
					} else if (year <= 12) {
						System.out.printf("연차는 20개입니다.\n");
					} else if (year <= 14) {
						System.out.printf("연차는 21개입니다.\n");
					} else if (year <= 16) {
						System.out.printf("연차는 22개입니다.\n");
					} else if (year <= 18) {
						System.out.printf("연차는 23개입니다.\n");
					} else if (year <= 20) {
						System.out.printf("연차는 24개입니다.\n");
					} else {//21년차 부터는 연차 수량이 25로 고정된다
						System.out.printf("연차는 25개입니다.\n");
					}
				}
			}
			System.out.printf("======================\n");
		}

	}
}
