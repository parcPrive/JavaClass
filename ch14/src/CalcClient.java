import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class CalcClient {
  public static void main(String[] args) {
    Socket socket = null;
    Scanner scanner = new Scanner(System.in);
    BufferedReader bufferedReader = null;
    BufferedWriter bufferedWriter = null;
    try {
      socket = new Socket("localhost", 9999);
      bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));// socket에서 들어오는 데이터를 문자로 바꿔서 버퍼연결해서 사용한다?
      bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      while(true){
        System.out.print("보내기 >>>>");
        String outputMsg = scanner.nextLine();
        bufferedWriter.write(outputMsg + "\n");
        bufferedWriter.flush();
        String inputMsg = bufferedReader.readLine();
        System.out.println("서버 => " + inputMsg);
      }
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
  
}
