/**
 * 무한루프시키기
 * @author smart04
 *
 */
public class Method {

	public static void aaa() {//aaa함수
		System.out.println("aaa()함수가 호출되었습니다.");
		bbb();
		/* method(function)
	       * 함수정의
	       * 접근지정자 public 
	       * 메모리에 올라와있고 누구나 쓸 수가 있도록 해줌 static
	       * 반환값 void
	       * 메소드명 main
	       * 파라메터 (String[] args) {
	       * return; //반환값이 없으면 리턴
	       * return 반환값; //반환값이 있으면 반환값(void) 부분이 타입이 바뀐다
	       * ex) 정수를 반환하면 void를 int로 수정
	       * 
	       */
		
	}
	
	public static void bbb() {//bbb함수
		System.out.println("bbb()함수가 호출되었습니다.");
		ccc();
	}
	
	public static void ccc() {//ccc함수
		System.out.println("ccc()함수가 호출되었습니다.");
		aaa();
	}
	
	public static void main(String[] args) {// 메인메소드
		aaa();
	}
	
}
