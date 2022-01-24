
public class Variable7/* 클래스 */ {

	public static void main/* 메소드 */(String[] args) {
		{
			System.out.println((byte) 10 + (byte) 200);
			System.out.println((byte) 10 + (short) 200);
			System.out.println((byte) 10 + (double) 200.0);
			// int 타입 아래에서 다른 것끼리 연산하면 출력은int가 된다
		}
		{
			long b = 10 + 10L;
			System.out.println(b);
		}
	}
}
