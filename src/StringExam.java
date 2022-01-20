/**
 * 문자열 String 클래스
 * 
 * @author smart04
 *
 */
public class StringExam {

	public static void main(String[] args) {
		// char[] c = {'A','B'} //문법 설명 : 캐릭터배열
		// char c = 'A'; //문법 설명 : 캐릭터배열
		// String 클래스는 문자열을 처리해준다
		// String s; //변수선언 : 문자열 s가 만들어진다
		// s = new String(); //자릿수는 값 넣는대로 칸이 늘어난다

		String s1, s2;
		
		
		s1 = new String("ABC"); //s1의 문자열 변수에 ABC값을 대입한다.
		s2 = "123"; //문법상 new String을 생략할 수도 있다.
				System.out.printf("s1 = %s(new String 사용)\ns2 = %s(new String 생략)", s1, s2);
				
	}
	
}
