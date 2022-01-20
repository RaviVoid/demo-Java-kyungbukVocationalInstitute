/**
 * 5*5마방진
 * @author smart00
 *
 */
public class ArrayExam7 {

	public static void main(String[] args) {
		int[][] arr = { 
						{11,18,25,2,9}, 
						{10,12,19,21,3}, 
						{4,6,13,20,22}, 
						{23,5,7,14,16}, 
						{17,24,1,8,15} 
					  };
		//1
		int rowCntChk = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				rowCntChk += arr[i][j];
			}
		}
		if(rowCntChk != (65*5)) {
			System.out.println("오답");
			return;
		}
		int colCntChk = 0;
		//세로값 15체크
		for (int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++ ) {
				colCntChk += arr[j][i];
			}
		}
		if(colCntChk!=(65*5)) {
			System.out.println("오답");
			return;
		}
		int leftTop = 0;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++ ) {
				if(i == j) {
					leftTop += arr[j][i];
				}				
			}
		}
		if(leftTop != 65) {
			System.out.println("오답");
			return;
		}
		int rightTop = 0;
		for (int i = 0; i < arr.length; i++) {
			//2
			for(int j = 0; j < arr[i].length; j++ ) {
				if(i + j == 4) {
					rightTop += arr[j][i];
				}				
			}
		}
		if(rightTop != 65) {
			System.out.println("오답");
			return;
		}
		System.out.println("정답입니다.축하축하");
	}

}



