/**
 * Operator 연산자
 * 
 * @author smart04
 *
 */
public class Operator3 {

	public static void main(String[] args) {
		// +연산자 문자열을 연결해주는 연산자
		// 우선순위
		System.out.println("1" + 1 + 2 + 3);
		System.out.println("1" + (1 + 2 + 3));
		// 변수선언
		int i, j, k;
		// 대입우선순위, 최우측에서 좌측으로 대입 진행
		i = j = k = 5;
		System.out.println(i + j + k);

	}

}
