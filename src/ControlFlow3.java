/**
 * 제어문 성적처리프로그램을 작성하시오. 취득점수가 90점이상이면 A, 80점이상이면 B, 70점이상이면 C 70점 미만이면 F 를
 * 출력하시오. 예 : 나의점수가 59점이면 F가 출력됩니다. if, switch를 이용하여 각각 프로그램하시오.
 * 
 * @author smart04
 *
 */
public class ControlFlow3 {

	public static void main(String[] args) {
		{
			// 성적처리프로그램 if문
			System.out.printf("성적처리프로그램 if문=====\n");
			{
				int jumsu = 85;
				if (jumsu >= 90) {
					System.out.printf("점수는 %d점 입니다.\n학점은 A입니다.\n", jumsu);
				} else if (jumsu >= 80) {
					System.out.printf("점수는 %d점 입니다.\n학점은 B입니다.\n", jumsu);
				} else if (jumsu >= 70) {
					System.out.printf("점수는 %d점 입니다.\n학점은 C입니다.\n", jumsu);
				} else {
					System.out.printf("점수는 %d점 입니다.\n학점은 F입니다.\n", jumsu);
				}
			}
		}
		{
			{
				// 성적처리프로그램 switch문
				System.out.printf("성적처리프로그램 switch문=====\n");
				int jumsu = 78;
				switch (jumsu / 10) {
				case 10:
					System.out.printf("점수는 %d점 입니다.\n학점은 A입니다.\n", jumsu);
					break;
				case 9:
					System.out.printf("점수는 %d점 입니다.\n학점은 A입니다.\n", jumsu);
					break;
				case 8:
					System.out.printf("점수는 %d점 입니다.\n학점은 B입니다.\n", jumsu);
					break;
				case 7:
					System.out.printf("점수는 %d점 입니다.\n학점은 C입니다.\n", jumsu);
					break;

				default:
					System.out.printf("점수는 %d점 입니다.\n학점은 F입니다.\n", jumsu);
					break;
				}
			}
		}
	}
}