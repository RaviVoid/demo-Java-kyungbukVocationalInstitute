import java.util.Scanner;

/**
 * 근무연수에 따른 연차 갯수를 산출하시오 년차-일수 01-15 02-15 03-16 04-16 05-17 06-17 07-18 08-18
 * 09-19 10-19 ~ 21-25 22-25 나머지는 25개 연차계산프로그램(년별)
 * 
 * @author smart04
 *
 */
public class Test_369Game {

	public static void main(String[] args) {
		// 사용자로부터 입력을 받기위한 scan객체 생성
		Scanner scan = new Scanner(System.in); // 값을 입력받는 함수 Scan
		System.out.println("아래에 커서를 두고 369를 입력하세요.");
		int user = 0; // 변수 선언 user(게이머)

		// 반복문 양수값 검출 시작=============================
		do {
			System.out.println("usage:양수값을 입력하셔야합니다.");
			user = scan.nextInt();
		} while (user < 1); // do~while문은 끝에 ;세미콜론이 들어가야한다.
		// 반복문 양수값 검출 종료=============================

		// 개월 수 입력시에 근무연수 산출 시작====================
		int longevityYear = user / 12;
		if (user % 12 > 0) {
			longevityYear++;
		}
		// 개월 수 입력시에 근무연수 산출 종료====================

		// 근무연수에 따른 연차갯수 산출 시작=====================
		switch (longevityYear) {
		case 1:
			System.out.println("연차갯수가 "+(user-1)+"개 입니다.");
			break;
		case 2:
			System.out.println("연차갯수가 15개 입니다.");
			break;
		case 3:
		case 4:
			System.out.println("연차갯수가 16개 입니다.");
			break;
		case 5:
		case 6:
			System.out.println("연차갯수가 17개 입니다.");
			break;
		case 7:
		case 8:
			System.out.println("연차갯수가 18개 입니다.");
			break;
		case 9:
		case 10:
			System.out.println("연차갯수가 19개 입니다.");
			break;
		case 11:
		case 12:
			System.out.println("연차갯수가 20개 입니다.");
			break;
		case 13:
		case 14:
			System.out.println("연차갯수가 21개 입니다.");
			break;
		case 15:
		case 16:
			System.out.println("연차갯수가 22개 입니다.");
			break;
		case 17:
		case 18:
			System.out.println("연차갯수가 23개 입니다.");
			break;
		case 19:
		case 20:
			System.out.println("연차갯수가 24개 입니다.");
			break;

		default:
			System.out.println("연차갯수가 25개 입니다.");
			break;
		// 근무연수에 따른 연차갯수 산출 종료=====================
		}

	}
}
