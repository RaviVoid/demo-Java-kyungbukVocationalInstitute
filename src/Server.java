import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

	final static int SERVER_PORT = 1225;
	// 클라이언트와 서버의 포트는 반드시 일치해야함
	final static String MESSAGE_TO_SERVER = "왔냐,클라~반갑당!";

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		// 서버 소켓을 선언함. 만들어지지는 않음

		try {
			serverSocket = new ServerSocket(SERVER_PORT);
			// 상수에 마우스를 올리면 surround with try/catch작성가능
			// 소켓을 만들겠다, 소켓을 열었음
			// try = 예외처리, 통신이 안될 수도 있으므로 작성

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			while (true) {
				System.out.println("socket 연결 대기");
				Socket socket = serverSocket.accept();
				System.out.println("host : " + socket.getInetAddress() + " | 통신 연결 성공");

				//Read/Write하는 부분 시작===================================
				/** Server에서 보낸 값을 받기 위한 통로 */
				InputStream is = socket.getInputStream();
				// 객체를 만들때는 앞쪽에서 대문자를 따온다 IS

				/** Server에서 Client로 보내기 위한 통로 */
				OutputStream os = socket.getOutputStream();

				byte[] data = new byte[16];
				// 16자리 버퍼를 만들겠다. 16개씩 한번에 옮기겠다.

				int n = is.read(data);
				// 서버로 보내준 데이터를 읽는다.

				final String messageFromClient = new String(data, 0, n);
				//0부터 n(16)까지 읽겠다.

				System.out.println(messageFromClient);

				os.write(MESSAGE_TO_SERVER.getBytes());
				//바이트의 배열을 넣는 곳. 스트림을 바이트의 배열로 넣는다.
				
				os.flush();

				is.close();
				//스트림을 닫아준다
				os.close();
				//스트림을 닫아준다
				//Read/Write하는 부분 종료===================================
				
				socket.close();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

class SocketRun implements Runnable {

	private Socket socket = null;

	SocketRun(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {

	}
}