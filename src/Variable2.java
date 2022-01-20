
public class Variable2 {

	public static void main(String[] args) {
		byte b = 127;
		short s = 1;
		int i = 10;
		long l = 10L;
		// long은 뒤에 L리터럴을 넣는다
		double d = 10.0;
		double d2 = 0.0;
		// double은 뒤에 D를 넣지만 생략이 가능하다
		double d3 = 0; // 점을 찍지않아도 실행이되는데 왜지?
		// 실수는 "."이 반드시 있어야한다.
		// ex. 0., .0, 0.0 가능
		float f = .0F;
		// float는 반드시 뒤에 F or f가 들어가야한다.
		char c = 'A';
		boolean sw = true;
		boolean sw2 = false;

		System.out.println(sw);
		System.out.println(d3 + 1);
		System.out.println("탭\t만큼띄워");
		System.out.println("세\n로\n로줄바꿔쓴다");
		System.out.println("쌍\"따옴표출력");
		System.out.println("홑\'따옴표출력");
		System.out.println("역\\슬러쉬출력");
		System.out.println("무슨기능1\b따");
		System.out.println("무슨기능2\f따");
		System.out.println("무슨기능3\r따");
	}
}

// 참조형 (배열, 객체)
// int[] iA = new int[3];
// iA[0]=1; //첫번째방에 1
// iA[1]=2; //두번째방에 2
// iA[2]=3; //세번째방에 3
// int는 4바이트이므로 4바이트 3칸이 만들어진다
// iA에는 주소값이 저장된다(참조)
