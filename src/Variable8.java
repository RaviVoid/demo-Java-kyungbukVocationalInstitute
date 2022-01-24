
public class Variable8/* 클래스 */ {

	public static void main/* 메소드 */(String[] args) {
		int i = 10;
		int j = 20;
		// start

		int k = j; // k=20
		j = i; // j=10
		i = k; // i=20

		// end
		/*
		 * i값은20, j값은10
		 */
		System.out.println("i값은 " + i);
		System.out.println("j값은 " + j);
	}
}
