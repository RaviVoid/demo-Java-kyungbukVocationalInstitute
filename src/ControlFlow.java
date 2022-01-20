/**
 * 제어문
 * 
 * @author smart04
 *
 */
public class ControlFlow {

	public static void main(String[] args) {
		// if문(println사용)
		System.out.println("if문println=======");
		{
			int i = 4;
			if (i > 5) {
				System.out.println(i + "은(는) 5보다 큽니다");
			}
			if (i == 5) {
				System.out.println(i + "은(는) 5랑 같습니다");
			}
			if (i < 5) {
				System.out.println(i + "은(는) 5보다 작습니다");
			}
		}
		// if문(printf사용)
		System.out.println("if문printf=======");
		{
			int i = 4;
			if (i > 5) {
				System.out.printf("%d은(는) 5보다 큽니다\n", i);
			}
			if (i == 5) {
				System.out.printf("%d은(는) 5랑 같습니다\n", i);
			}
			if (i < 5) {
				System.out.printf("%d은(는) 5보다 작습니다\n", i);
			}
		}
		// if/else문
		System.out.println("if/else문=======");
		{
			int i = 4;
			if (i > 5) {
				System.out.printf("%d은(는) 5보다 큽니다\n", i);
			} else {

				if (i == 5) {
					System.out.printf("%d은(는) 5랑 같습니다\n", i);
				}
				if (i < 5) {
					System.out.printf("%d은(는) 5보다 작습니다\n", i);
				}
			}
		}
		// if/else if문
		System.out.println("if/else if문=======");
		{
			int i = 4;
			if (i > 5) {
				System.out.printf("%d은(는) 5보다 큽니다\n", i);
			} else if (i == 5) {
				System.out.printf("%d은(는) 5랑 같습니다\n", i);
			} else {
				System.out.printf("%d은(는) 5보다 작습니다\n", i);

			}
		}
	}

}
