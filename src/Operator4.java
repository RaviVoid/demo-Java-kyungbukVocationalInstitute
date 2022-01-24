/**
 * Operator 연산자
 * 
 * @author smart04
 *
 */
public class Operator4 {

	public static void main(String[] args) {
		// 증감연산자 ++, --
		{
			int i = 0;
			i = i + 1;
			i = i + 1;
			System.out.println("증감연산자");
			System.out.println("i + 1 = " + (i));
		}
		{
			int i = 0;
			i++;
			i++;// 후위연산자
			System.out.println("i++ = " + (i));
		}
		{
			int i = 0;
			i++;// 후위연산자
			++i;// 전위연산자
			System.out.println("++i = " + (i));
		}
		{
			int i = 0;
			System.out.println("i++ = " + (i++));
		}
		{
			int i = 0;
			System.out.println("++i = " + (++i));
			System.out.println("==============");

		}
		{
			// 부정연산자 !(느낌표)
			boolean b = false;
			System.out.println("부정연산자");
			System.out.println(b);
			System.out.println(!b);
			System.out.println("==============");

		}
		{
			// 비교연산자 >, >=, <, <=, ==, != 결과는 boolean
			int m = 10, n = 5;
			System.out.println("비교연산자");
			System.out.println(m > n);
			System.out.println(m >= n);
			System.out.println(m < n);
			System.out.println(m <= n);
			System.out.println(m == n);
			System.out.println(m = n);// 대입부분연산이 그대로?
			System.out.println(m != n);// 왜 트루가 안나오나?
			System.out.println("==============");
		}
		/*
		 * & : 앰퍼센드(ampersand) | : 버티컬 바(Vertical bar)
		 */
		{
			// 논리연산자 ( and[&&] , or[||], not[!])
			System.out.println("논리연산자");
			System.out.println(false && false);
			System.out.println(false && true);
			System.out.println(true && false);
			System.out.println(true && true);
			System.out.println("-----------");
			System.out.println(false || false);
			System.out.println(false || true);
			System.out.println(true || false);
			System.out.println(true || true);
			System.out.println("-----------");
			System.out.println(!false);
			System.out.println(!true);
			System.out.println("=========");

		}
		{
			// 비트연산자 & | ^(xor) ~(not) << >> >>> 0과1로만되어있다
			byte bitNum1 = 15;
			byte bitNum2 = -10;
			System.out.println("비트연산자");
			System.out.println(bitNum1 + bitNum2);
			System.out.println(bitNum1 & bitNum2);
			System.out.println(bitNum1 | bitNum2);
			System.out.println(bitNum1 ^ bitNum2);
			System.out.println(~bitNum2);
			System.out.println(bitNum2 << 1);
			System.out.println(bitNum2 >> 1);
			System.out.println(bitNum2 >>> 1);
			//비부호화비트 비트시프트 unsigned
			System.out.println("===========");

		}
		{
			byte bitNum1 = 0;
			byte bitNum2 = 1;
			byte bitNum3 = 2;
			System.out.println("비트음수연산");
			System.out.println(bitNum1);
			System.out.println(bitNum2);
			System.out.println(bitNum3);
			System.out.println(~bitNum1);
			System.out.println(~bitNum2);
			System.out.println(~bitNum3);

		}
	}

}
