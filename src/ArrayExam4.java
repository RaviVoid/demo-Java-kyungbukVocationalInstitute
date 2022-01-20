import java.util.Scanner;

/**
 * (국,영,수,총합,평균) 성적처리프로그램을 작성하시오
 * 
 * @author smart04
 *
 */
public class ArrayExam4 {

	public static void main(String[] args) {
		/**
		 * 참조형 변수 배열 타입[] 변수명 ; 타입 변수명[]; int[] j = new int[2]; //2칸짜리 각4바이트의 공간이 만들어진다
		 **/
	
		ArrayExam4 ae = new ArrayExam4();

		System.out.println(ae); // 메모리상의 해쉬코드 값을 출력
		System.out.println("=============="); // 구분선

		System.out.println("=======실습시작======="); // 구분선

		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;

		kor = 50; // 국어점수 입력
		eng = 80; // 영어점수 입력
		math = 90; // 수학점수 입력

		total = kor + eng + math;
		avg = total / 3;
		System.out.printf("국어:%d, 영어:%d, 수학:%d\n", kor, eng, math);
		System.out.printf("총점:%d, 평균:%f\n", total, avg);
		System.out.println("=============="); // 구분선

		System.out.println("=======배열실습시작======="); // 구분선

		System.out.println("키보드 입력을 기다립니다.");
		Scanner scan = new Scanner(System.in); // 키보드 입력을 받는다.
		
		
		
		int[] grade = new int[5];
		double[] gradeAvg = new double[1];
		System.out.println("국어성적을 입력하세요?");
		grade[0] = scan.nextInt();
		System.out.println("영어성적을 입력하세요?");
		grade[1] = scan.nextInt();
		System.out.println("수학성적을 입력하세요?");
		grade[2] = scan.nextInt();
		grade[3] = grade[0] + grade[1] + grade[2];
		grade[4] = grade[3] / 3;
		gradeAvg[0] = grade[3] / 3;
		System.out.printf("국어:%d, 영어:%d, 수학:%d\n", grade[0], grade[1], grade[2]);
		System.out.printf("총점:%d, 평균:%d\n", grade[3], grade[4]);
		System.out.printf("평균:%f\n", gradeAvg[0]);
		System.out.println("=============="); // 구분선

		System.out.println("=======배열실습시작======="); // 구분선
		System.out.println("해당배열의 길이는 = " + grade.length); // 해당 배열의 길이를 알 수 있다

	}

}
