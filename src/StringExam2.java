/**
 * 문자열 String 클래스
 * 
 * @author smart04
 *
 */
public class StringExam2 {

	public static void main(String[] args) {
		// char[] c = {'A','B'} //문법 설명 : 캐릭터배열
		// char c = 'A'; //문법 설명 : 캐릭터배열
		// String 클래스는 문자열을 처리해준다
		// String s; //변수선언 : 문자열 s가 만들어진다
		// s = new String(); //자릿수는 값 넣는대로 칸이 늘어난다

		String str1 = new String("ABC");
		String str2 = new String("ABC");

		System.out.printf("str1 = %s\n", str1);
		System.out.printf("str2 = %s\n", str2);

		String str3 = "ABC";// str3에 문자열 ABC의 주소를 매칭한다
		String str4 = "ABC";// str4도 원래 있던 문자열 ABC의 주소를 매칭한다

		System.out.printf("str1 = %s\n", str1);
		System.out.printf("str2 = %s\n", str2);
		System.out.printf("%s\n", str3 == str4);
		System.out.printf("%s\n", str3.equals(str4));
		// equals의 결과 값이 같은 이유
		// 레퍼런스로 문자열 값을 입력하지 않았기 때문에 주소값만 비교한다
		// and연산으로 첫번째 문자열부터 순서대로 비교한다
		// n번째 문자의 종류와 문자의 길이 비교

		String str5 = "ABC";// str3에 문자열 ABC의 주소를 매칭한다
		String str6 = "abc";// str4도 원래 있던 문자열 ABC의 주소를 매칭한다

		System.out.printf("str5 = %s\n", str5);
		System.out.printf("str6 = %s\n", str6);
		System.out.printf("%s\n", str5 == str6);
		System.out.printf("%s\n", str5.equals(str6));
		// equals의 결과 값이 다른 이유
		// 레퍼런스로 문자열 값을 입력하지 않았기 때문에 주소값만 비교한다
		// 대.소문자를 구분한다
		// and연산으로 첫번째 문자열부터 순서대로 비교한다
		// n번째 문자의 종류와 문자의 길이 비교

	}

}
