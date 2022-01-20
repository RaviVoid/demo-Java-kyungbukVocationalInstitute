/**
 * 주어진 배열의 항목에서 최소값을 구해보세요.(for문을 이용하세요) {-1, 5, 3, 8, 2} 결과값은 8
 * 
 * @author smart04
 *
 */
public class ArrayExam11 {

	public static void main(String[] args) {

		// 배열 변수값 arr을 입력한다
		int[] arr = { -1, 5, 3, 8, 2 };
		// int[] arr = { 8, 5, 3, 1, 2 }; //테스트용
		// int[] arr = { 1, 5, 3, 2, 8 }; //테스트용

		// 임시 보관용 temp변수를 선언한다
		// 반복 횟수용 i변수를 선언한다
		int temp = 0;
		int i = 0;

		// arr.length로 배열 변수값의 숫자를 구한다
		for (i = 0; i < arr.length; i++) {
			// 임시 보관용 temp 시작값 0과 arr[i]번째 값과 비교를 시작한다
			if (arr[i] < temp) {
				// arr[i]번째 값이 temp보다 작으면 temp에 값을 저장한다
				// 반대라면 추가조건이 없으므로 temp값은 유지된다
				temp = arr[i];
			}
			// i 회차별 temp 중간값을 출력한다.
			System.out.printf("순차별 큰 값은 = %d 입니다.\n", temp);
		}
		// temp 최종 결과값을 출력한다.
		System.out.printf("배열에서 가장 큰 값은 = %d 입니다.\n", temp);
	}
}