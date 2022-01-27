/**
 * 성적처리프로그램
 * @author smart04
 *
 */
class Person{
	//멤버변수, 필드
	//클래스 안에 클래스를 또 만들 수는 있지만 파일을 새로 만드는 것을 권장한다.
	String name;
	//int age;
	String age;
	String address;
	
}
public class StructureExam7 {
	
	public static void main(String[] args) {
		//변수 p1을 선언하면서 p1이라는 객체가 만들어짐
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = "30";
		p1.address = "서울시 용산구 한남동";
		System.out.printf("이름 : %s\n", p1.name);
		//문자열 age를 숫자로 형변환하는 방법.
		//Integer.parseInt()
		//레퍼함수
		System.out.printf("나이 : %s%n", Integer.parseInt(p1.age)+1);
		System.out.printf("주소 : %s\n", p1.address);
				
	}

}
