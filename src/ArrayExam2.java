
public class ArrayExam2 {

	public static void main(String[] args) {
		/**
		 * 참조형 변수 배열 타입[] 변수명 ; 타입 변수명[]; int[] j = new int[2]; //2칸짜리 각4바이트의 공간이 만들어진다
		 **/
		ArrayExam2 ae = new ArrayExam2();

		System.out.println(ae); // 메모리상의 해쉬코드 값을 출력
		System.out.println("=============="); // 구분선

		System.out.println("=======실습시작======="); // 구분선

		int[] j = { 10, 20, 30 };
		for (int i = 0; i < 3; i++) {
			System.out.println(j[i]);
		}
		System.out.println("=============="); // 구분선

	}

}
