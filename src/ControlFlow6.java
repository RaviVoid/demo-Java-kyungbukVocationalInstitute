/**
 * 가위[1], 바위[2], 보[3] 게임프로그램을 작성하시오.
 * 
 * @author smart04
 *
 */
public class ControlFlow6 {

	public static void main(String[] args) {
		{
			int user1 = (int) ((Math.random() * 3) + 1);// 본인
			int user2 = (int) ((Math.random() * 3) + 1);// 상대방

			System.out.println("[DEG]=" + user1);
			System.out.println("[DEG]=" + user2);

			int a1 = '가';
			int a2 = '위';
			int b1 = '바';
			int b2 = '위';
			int c1 = '보';

			// 나의 결과 값을 출력
			if (user1 == 1) {
				System.out.printf("나(user1)는 %c%c를 내었습니다\n", a1, a2);
			} else if (user1 == 2) {
				System.out.printf("나(user1)는 %c%c를 내었습니다\n", b1, b2);
			} else {
				System.out.printf("나(user1)는 %c를 내었습니다\n", c1);
			}

			// 상대방의 결과 값을 출력
			if (user2 == 1) {
				System.out.printf("상대방(user2)는 가위를 내었습니다\n");
			} else if (user2 == 2) {
				System.out.printf("상대방(user2)는 바위를 내었습니다\n");
			} else {
				System.out.printf("상대방(user2)는 보를 내었습니다\n");
			}

			// 가위바위보의 결과 값을 출력
			if (user1 == 1 && user2 == 1) {
				System.out.println("비겼습니다.");
			} else if (user1 == 1 && user2 == 2) {
				System.out.println("졌습니다.");
			} else if (user1 == 1 && user2 == 3) {
				System.out.println("이겼습니다.");
			} else if (user1 == 2 && user2 == 1) {
				System.out.println("이겼습니다.");
			} else if (user1 == 2 && user2 == 2) {
				System.out.println("비겼습니다.");
			} else if (user1 == 2 && user2 == 3) {
				System.out.println("졌습니다.");
			} else if (user1 == 3 && user2 == 1) {
				System.out.println("졌습니다.");
			} else if (user1 == 3 && user2 == 2) {
				System.out.println("이겼습니다.");
			} else if (user1 == 3 && user2 == 3) {
				System.out.println("비겼습니다.");
			}
		}
	}
}
