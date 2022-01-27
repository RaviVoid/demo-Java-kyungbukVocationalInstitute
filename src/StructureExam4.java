/**
 * 성적처리프로그램
 * @author smart04
 *
 */
public class StructureExam4 {
	//멤버변수, 필드
	String stdName;
	int coding;
	
	//구조체를 이용하여 코딩
	public static void main(String[] args) {
		//int [] coding = new int[3];
		//배열 3개를 만든다
		StructureExam4 [] arraySe = new StructureExam4 [3];
		
		//구조체를 만든다
		StructureExam4 se0 = new StructureExam4();
		se0.stdName = "홍길동";
		se0.coding = 100;
		arraySe[0] = se0;
		
		StructureExam4 se1 = new StructureExam4();
		se1.stdName = "안명진";
		se1.coding = 90;
		arraySe[1] = se1;
		
		StructureExam4 se2 = new StructureExam4();
		se2.stdName = "이순신";
		se2.coding = 95;
		arraySe[2] = se2;
		
		//반복문을 사용하여 0~2번칸의 값을 출력
		for(int i = 0;i < 3;i++) {
		System.out.println(arraySe[i].stdName + "의 코딩성적은 " + arraySe[i].coding + "점입니다");
		}
	}
}
