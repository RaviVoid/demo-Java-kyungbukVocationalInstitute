/**
 * 수행시간 측정을 통한 최적화 여부 검토
 * @author smart9
 *
 */
public class DurationTimeTest {

	public static void main(String[] args) {
		int Cnt1 = 100000;
		long start1 = System.nanoTime();
		String str = "";
		for (int i = 1; i <= Cnt1 ; i++) {
			str += "string" + i;
		}
		long end1 = System.nanoTime();
		long duration1 = end1 - start1;
		System.out.println(       duration1        /1000000000.0);
		
		System.out.println("==================");
		
		int Cnt2 = 100000;
		long start2 = System.nanoTime();
		StringBuilder       builder       =        new StringBuilder();
		for (int i = 1; i <= Cnt2 ; i++) {
			builder.append("string").append(i);
		}
		long end2 = System.nanoTime();
		long duration2 = end2 - start2;
		System.out.println(       duration2        /1000000000.0);
		
	}

}
