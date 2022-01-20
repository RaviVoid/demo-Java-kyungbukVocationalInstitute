
public class Variable3/* 클래스 */ {

	public static void main/* 메소드 */(String[] args) {
		{
			int i;/* 변수선언 *///중복선언이 불가능하다(에러발생)
			i = 1;/* 변수값초기화 */
		}
		//System.out.println(i);//i변수가 {}방안에 있어서 못찾는다
		
	}
}

//변수는 선언된 블록 내에서만 사용이 가능하다