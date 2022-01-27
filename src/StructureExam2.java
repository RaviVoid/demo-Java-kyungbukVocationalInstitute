/**
 * 성적처리프로그램
 * @author smart04
 *
 */
public class StructureExam2 {

	public static void main(String[] args) {
		//studentName0 학생이름0번
		//배열로 입력하기
		String [] stdName = {"홍길동", "안명진", "이순신"};
		int [] coding = {100, 90, 95};
		//홍길동=100, 안명진=90  이런식으로 다른 데이터 타입을 묶으려면 Structure가 필요.
		
		System.out.println(stdName[0] + "의 코딩성적은 " + coding[0] + "점입니다.");
		System.out.println(stdName[1] + "의 코딩성적은 " + coding[1] + "점입니다.");
		System.out.println(stdName[2] + "의 코딩성적은 " + coding[2] + "점입니다.");

	}

}
