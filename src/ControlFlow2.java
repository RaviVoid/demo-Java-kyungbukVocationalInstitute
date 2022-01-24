/**
 * 제어문
 * 
 * @author smart04
 *
 */
public class ControlFlow2 {

	public static void main(String[] args) {
		//Switch문
		//Ctrl+Space키를 사용하여 문법기본틀 출력
		int i = 2;
		
		switch (i) {
		case 1: System.out.printf("입력한 값은%d입니다. 답은1입니다",i); break;
		case 2: System.out.printf("입력한 값은%d입니다. 답은2입니다",i); break;
		case 3: System.out.printf("입력한 값은%d입니다. 답은3입니다",i); break;
		case 4: System.out.printf("입력한 값은%d입니다. 답은4입니다",i); break;
		case 5: System.out.printf("입력한 값은%d입니다. 답은5입니다",i); break;
		// break; 조건이 맞으면 출력하고 빠져나와라
		default:
			System.out.printf("1~5 사이의 값이 아닙니다.");
			break;
		}
	}
}
