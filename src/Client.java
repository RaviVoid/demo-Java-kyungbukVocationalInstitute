import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
 
public class Client {
     
    final static String SERVER_IP = "203.228.62.11";
    //final은 상수를 만들 때 사용(값이 한 번 들어가면 값을 변경할 수 없다)
    //상수의 변수명은 모두 대문자로 사용, 단어+단어 = 단어_단어
    final static int SERVER_PORT = 1225;
    //사용하지 않는 포트를 써야한다. 아닐경우 충돌 발생
    //실행:"cmd"에서 "netstat -nao"입력해서 사용중인 포트&아이디 확인
    final static String MESSAGE_TO_SERVER = "안녕,니가 서버냐?";
     
    public static void main(String[] args) {
         
        Socket socket = null;
        //클라이언트 소켓을 선언함. 만들어지지는 않음
         
        try {
            /** 소켓통신 시작 */
            socket = new Socket(SERVER_IP,SERVER_PORT);
            //상수에 마우스를 올리면 surround with try/catch작성가능
            //소켓을 만들겠다, 소켓을 열었음
            //try = 예외처리, 통신이 안될 수도 있으므로 작성
            System.out.println("socket 연결");
         
            /** Client에서 Server로 보내기 위한 통로 */
            OutputStream os = socket.getOutputStream();
            /** Server에서 보낸 값을 받기 위한 통로 */
            InputStream is = socket.getInputStream();
             
            os.write( MESSAGE_TO_SERVER.getBytes() );
            os.flush();
             
            byte[] data = new byte[16];
            int n = is.read(data);
            final String resultFromServer = new String(data,0,n);
            System.out.println(resultFromServer);
            
            is.close();
            os.close();
            
            socket.close();
            //소켓을 열었으면 항상 닫아줘야함
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
}