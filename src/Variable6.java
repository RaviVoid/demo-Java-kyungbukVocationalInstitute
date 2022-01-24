
public class Variable6/* 클래스 */ {

	public static void main/* 메소드 */(String[] args) {
		/* 전역변수 */{
			int i;/*지역변수*/
			i = 1;
			System.out.println(i);
		} //괄호로 묶어주면 같은 변수 사용가능, 독립된 방에서 따로 사용됨
		{
			int i;
			i = 1;
			System.out.println(i);
		}
	
	}
}

// 8진수는 012 앞자리에 "0"
// 16진수는 0x16 앞자리에 "0x"
// 타입변환
// byte < char = short < int < long < float < double
// 작은타입에서 큰타입으로 변환시 자동변환
// 반대로는 "캐스팅"을 해줘야한다
// 문법 작은타입 작은타입변수명 = (작은타입)큰타입변수명;