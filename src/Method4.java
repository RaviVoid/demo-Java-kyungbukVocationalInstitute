/**
 * 무한루프시키기
 * 
 * @author smart04
 *
 */
public class Method4 {

	public static void aaa(int i, char j) {// aaa함수
		System.out.println("aaa()함수가 호출되었습니다." + (++i) + j);

		/*
		 * method(function) 함수정의 접근지정자 public 메모리에 올라와있고 누구나 쓸 수가 있도록 해줌 static 반환값 void
		 * 메소드명 main 파라메터 (String[] args) { return; //반환값이 없으면 리턴 return 반환값; //반환값이 있으면
		 * 반환값(void) 부분이 타입이 바뀐다 ex) 정수를 반환하면 void를 int로 수정
		 * 
		 * 
		 * //함수 //함수정의 //public [static] void 함수명 (파라메터,,,){ // 수행문들 // return; return
		 * 반환값; //} //함수호출 //함수명(인자,,,);
		 */
	}

	public static void main(String[] args) {// bbb함수
		int i = 24; // i가 중복 변수로, 복사라고 한다
		aaa(i, 'A');
		System.out.println(i);
	}
}
