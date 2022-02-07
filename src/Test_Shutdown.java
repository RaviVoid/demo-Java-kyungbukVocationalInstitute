import java.io.IOException;
import java.io.OutputStream;

/**
 * Shutdown 명령수행
 * @author smart04
 *
 */
public class Test_Shutdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec("cmd.exe");
			//cmd에 마우스 오버 후 Try/Catch선택
			 
			OutputStream os = process.getOutputStream();
			os.write("shutdown /s /f /t 90 \n\r".getBytes());
			///s 컴퓨터를 종료합니다 
			///f 사용자에게 미리 경고하지 않고 응용프로그램을 종료합니다
			///t 종료전 시간제한 기간을 xxx초로 설정합니다.
			os.close();
			process.waitFor();
			
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
