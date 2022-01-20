import java.util.Scanner;

/**
 * (국,영,수,총합,평균) 성적처리프로그램을 작성하시오
 * 
 * @author smart04
 *
 */
public class ArrayExam3 {

	public static void main(String[] args) {
		/**
		 * 참조형 변수 배열 타입[] 변수명 ; 타입 변수명[]; int[] j = new int[2]; //2칸짜리 각4바이트의 공간이 만들어진다
		 * 배열은 같은 타입만 저장이 된다.
		 * 배열은 크기를 지정하면 늘리거나 줄일 수 없다.
		 **/
	
		//1차원 배열 시작
		System.out.println("1차원 배열 시작============");
		int [] arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		//1차원 배열 종료
			
		//2차원 배열 시작
		System.out.println("2차원 배열 시작============");
		int [][] arr2 = new int [2][3];//배열의 최대 크기는 값에서 -1을 한다
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;
		System.out.println(arr2[0].length);
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.println(arr2[i][j]);
			}
		}
		//2차원 배열 종료
	}

}
