/**
 * 홀짝 확인프로그램을 작성하시오. 임의의 수를 지정하고 수를 2로 나눈 나머지값이 0이면 짝수, 아니면 홀수
 * 
 * @author smart04
 *
 */
public class ControlFlow5 {

	public static void main(String[] args) {
		{
			int i;// 변수 선언
			i = 59;// 변수값 초기화

			// System.out.println("[DEG]=" + (i % 2 == 0));
			if (i % 2 == 0) {
				System.out.println("짝수입니다.");
			} else if (i % 2 == 1) {
				System.out.println("홀수입니다.");
			}
		}
		{
			int i;// 변수 선언
			i = 59;// 변수값 초기화

			// System.out.println("[DEG]=" + (i % 2 == 0));
			if (i % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		}
	}
}
