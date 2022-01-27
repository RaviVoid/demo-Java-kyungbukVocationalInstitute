/**
 * 성적처리프로그램
 * @author smart04
 *
 */
public class StructureExam6 {
	//멤버변수, 필드
	String stdName;
	int coding;
	
	//구조체를 이용하여 코딩
	//print 함수 부분을 더욱 간단하게 표현
	//마트에 갔을 때 카트(구조체)를 사용한다고 생각할 것
	public static void main(String[] args) {
		StructureExam6 se0 = new StructureExam6();
		se0.stdName = "홍길동";
		se0.coding = 100;
		//마우스 오버하고 Create method, 컨트롤 print부분 클릭해서 이동
		print(se0);
		
		StructureExam6 se1 = new StructureExam6();
		se1.stdName = "안명진";
		se1.coding = 90;
		print(se1);
		
		StructureExam6 se2 = new StructureExam6();
		se2.stdName = "이순신";
		se2.coding = 95;
		print(se2);
	}

	private static void print(StructureExam6 printSe) {
		// 변수명의 일치에 주의하자
		// printSe변수명을 주고 프린트 함수를 만든다
		System.out.println(printSe.stdName + "의 코딩성적은 " + printSe.coding + "점입니다.");
		
	}

}
