
public class ArrayExam5 {

	public static void main(String[] args) {
		int[][] arr = { 
						{2,7,6}, 
						{9,5,1}, 
						{4,3,8} 
					  };
		//1
		int rowCntChk = 0;
		for (int i = 0; i < arr.length; i++) {
			//2
			for(int j = 0; j < arr[i].length; j++ ) {
				//3
				rowCntChk += arr[i][j];
				
			}
			
		}
		if(rowCntChk != (15*3)) {
			System.out.println("오답");
			return;
		}
		int colCntChk = 0;
		//�꽭濡쒓컪 15泥댄겕
		for (int i = 0; i < arr.length; i++) {
			//2
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++ ) {
				//3
				sum += arr[j][i];
				
			}
			
		}
		if(colCntChk!=(15*3)) {
			System.out.println("오답");
			return;
		}
		int leftTop = 0;
		for (int i = 0; i < arr.length; i++) {
			//2
			for(int j = 0; j < arr[i].length; j++ ) {
				if(i == j) {
					leftTop += arr[j][i];
				}				
			}
		}
		if(leftTop != 15) {
			System.out.println("오답");
			return;
		}
		int rightTop = 0;
		for (int i = 0; i < arr.length; i++) {
			//2
			for(int j = 0; j < arr[i].length; j++ ) {
				if(i + j == 2) {
					rightTop += arr[j][i];
				}				
			}
		}
		if(rightTop != 15) {
			System.out.println("오답");
			return;
		}
		System.out.println("정답입니다.추카추카");
	}

}



