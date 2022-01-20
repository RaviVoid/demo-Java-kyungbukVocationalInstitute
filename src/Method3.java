import java.util.Scanner;

public class Method3 {

	public static void aaa(int longevity) {
		// 개월수를 호출하면서 값을 던져주겠다 int longevityYear

		// 개월 수 입력시에 근무연수 산출 시작====================
		// int longevity = 36; //개월수를 호출하면서 값을 던져주겠다
		int longevityYear = longevity / 12;

		if (longevity % 12 > 0) {
			longevityYear++;
		}
		// 개월 수 입력시에 근무연수 산출 종료====================

		// 근무연수에 따른 연차갯수 산출 시작=====================
		switch (longevityYear) {
		case 1:
			System.out.println("연차갯수가 " + (longevity - 1) + "개 입니다.");
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

	public static void main(String[] args) {// 메인메소드
		System.out.println("aaa함수를 불러왔습니다.");
		for (int i = 0; i < 22; i++) {
			aaa((i + 1) * 12);
		}
	}

}
