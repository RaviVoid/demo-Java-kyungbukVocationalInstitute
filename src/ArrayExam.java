
public class ArrayExam {

	public static void main(String[] args) {
		/** 참조형 변수
		배열
		타입[] 변수명 ;
		타입 변수명[];
		int[] j = new int[2]; //2칸짜리 각4바이트의 공간이 만들어진다
		**/
		ArrayExam ae = new ArrayExam();
		
		System.out.println(ae); //메모리상의 해쉬코드 값을 출력
		System.out.println("=============="); //구분선
		
		System.out.println("=======실습시작======="); //구분선		
		int [] j = new int[3];
		double [] k = new double[3];
		char [] l = new char[3];
		
		System.out.println(j); //해쉬코드 값을 출력
		System.out.println(j[0]+j[1]+j[2]); //int의 기본값이 0인것을 확인
		System.out.println(k[0]+k[1]+k[2]); //double의 기본값이 0.0인것을 확인
		System.out.println(l[0]+l[1]+l[2]); //char의 기본값이 void인것을 확인
		System.out.println("=============="); //구분선
		
		j[0] = 10; //j[0]번째 칸에 10을 입력
		System.out.println(j[0]); //j[0]번째 칸의 값을 출력
		System.out.println("=============="); //구분선
		
		int [] m = {10,20,30};
		System.out.println(m[0]);
		System.out.println(m[1]);
		System.out.println(m[2]);
	}

}
