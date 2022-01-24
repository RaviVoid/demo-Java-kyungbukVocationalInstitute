/**
 * 문자열 String 클래스
 * 
 * @author smart04
 *
 */
public class StringExam4 {

	public static void main(String[] args) {
		// char[] c = {'A','B'} //문법 설명 : 캐릭터배열
		// char c = 'A'; //문법 설명 : 캐릭터배열
		// String 클래스는 문자열을 처리해준다
		// String s; //변수선언 : 문자열 s가 만들어진다
		// s = new String(); //자릿수는 값 넣는대로 칸이 늘어난다

		String str1 = new String("ABC");
		String str2 = new String("ABC");

		System.out.printf("%s\n", str1 == str2);
		System.out.printf("%s\n", str1.equals(str2));
		//equals의 결과 값이 다른 이유
		//and연산으로 첫번째 문자열부터 순서대로 비교한다
		//n번째 문자의 종류와 문자의 길이 비교
		
		System.out.printf("str1 = %s\n", str1);
		System.out.printf("str1 = %s\n", str1);
		System.out.printf("str2 = %s\n", str2);

	}

}
