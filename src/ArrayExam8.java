/**
 * n*n 마방진
 * @author smart00
 *
 */
public class ArrayExam8 {

	public static void main(String[] args) {
		//마방진 수
		int cube = 5;
		int sum = 0;
		int chkNum = 0;
		
		//전체합을 구하자
		for(int i = 1; i <= (cube*cube); i++) {
			sum += i;
			System.out.printf("i = %d\n", i); //i반복횟수 출력
			System.out.printf("cube = %d\n", cube); //입력된 cube값 확인
		}
		//
		
		
		chkNum = (sum/(cube*cube))*cube;
			System.out.printf("chkNum = %d\n",chkNum); //전체평균값*열갯수 값을 확인
		
		
		int[][] arr = { 
						{11,18,25,2,9}, 
						{10,12,19,21,3}, 
						{4,6,13,20,22}, 
						{23,5,7,14,16}, 
						{17,24,1,8,15} 
					  };
		
		//1
		int rowCntChk = 0; //행값의 변수 설정 rowCntChk
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				rowCntChk += arr[i][j];
				System.out.printf("rowCntChk = %d\n", rowCntChk);
			}
		}
		if(rowCntChk != (chkNum*cube)) {
			System.out.println("오답");
			return;
		}
		int colCntChk = 0; //열값의 변수 설정 colCntChk
		for (int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++ ) {
				colCntChk += arr[j][i];
			}
		}
		if(colCntChk!=(chkNum*cube)) {
			System.out.println("오답");
			return;
		}
		int leftTop = 0; //좌측상단부터 우측하단까지 대각선 변수 설정 leftTop 
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				if(i == j) {
					leftTop += arr[j][i];
				}				
			}
		}
		if(leftTop != chkNum) {
			System.out.println("오답");
			return;
		}
		int rightTop = 0; //우측상단부터 좌측하단까지 대각선 변수 설정 rightTop
		for (int i = 0; i < arr.length; i++) {
			//2
			for(int j = 0; j < arr[i].length; j++ ) {
				if(i + j == (cube-1)) { //좌표값을 더했을 때 배열좌표값은 그보다 1이 작은 값이 된다
					rightTop += arr[j][i];
				}				
			}
		}
		if(rightTop != chkNum) {
			System.out.println("오답");
			return;
		}
		System.out.println("정답입니다.축하축하");
	}

}



