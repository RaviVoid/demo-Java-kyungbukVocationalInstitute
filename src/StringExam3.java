/**
 * 문자열 String 클래스
 * 
 * @author smart04
 *
 */
public class StringExam3 {

	public static void main(String[] args) {
		// char[] c = {'A','B'} //문법 설명 : 캐릭터배열
		// char c = 'A'; //문법 설명 : 캐릭터배열
		// String 클래스는 문자열을 처리해준다
		// String s; //변수선언 : 문자열 s가 만들어진다
		// s = new String(); //자릿수는 값 넣는대로 칸이 늘어난다

		String s1 = new String("문자열");
		String s2 = new String("문자열");

		s1 = "123"; // s1에 문자열 123 대입
		s2 = "ABC"; // s2에 문자열 ABC 대입
		s2 = "ABC" + 123; // s2에 새로운 문자열 ABC123을 대입, 상단의 ABC는 garbage값이 된다.

		System.out.printf("s1 = %s\ns2 = %s\n", s1, s2);

		StringBuffer sb = null;// 메모리공간안에 sb라는 공간을 만든다
		sb = new StringBuffer("AB"); // sb에 AB라는 문자열을 대입한다
		sb.append("123");// sb에 대입된 AB의 값에 123이 추가된다.
		// 메모리를 효율적으로 쓰기 위해서 Buffer를 사용한다.
		// 값을 추가하는 것이 아니고 교체하기 때문이다.
		System.out.printf("sb = %s\n", sb);
	}

}
