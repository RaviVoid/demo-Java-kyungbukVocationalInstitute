/**
 * 
 * @author smart04
 *
 */
public class ArrayExam9 {

	public static void main(String[] args) {

		int [] i = new int[2]; //배열 변수선언 i, 배열은 2칸이다
		int [] j = null; //참조형의 기본값은 null(없다)
		j = i; //i의 값을  j에 대입해라
		i[0] = 1; //i 첫번째 배열에 1을 대입해라
		i[0] = 2; //i 첫번째 배열에 2을 대입해라, 덮어쓰기 됨
		i = null; 
		//i의 주소값이 사라져서 참조가 끊어진다. garbage(쓰레기)가 된다. 방의 값은 살아있다
		System.gc(); //garbage값을 알아서 정리해준다. 메모리에서 삭제시켜준다.
		
		//System.out.println(i[0]); // i 0번칸의 값을 출력해라.주소값이 사라져서 에러발생
		System.out.println(j[0]); // j 0번칸의 값을 출력해라, i와 j의 주소는 같다
		//변수 i를 문법상 다시 쓸 수는 없으므로 다른 변수 선언을 해야한다.
	}
}