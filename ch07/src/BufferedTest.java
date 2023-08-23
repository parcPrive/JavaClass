
import java.io.BufferedOutputStream;
import java.io.FileReader;

public class BufferedTest {
  public static void main(String[] args) {
    FileReader fileReader = null;
    try {
      fileReader = new FileReader("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8/test.txt");
      // 저 파일안에 1234567890이 들어있으면 12345만 출력된다. 123456만 있어도 12345가 출력된다. 처음에 5개씩 잘라서 5개가 충족된다면 출력하는줄 알았는데 아니였다. 1234567891이 들어와야 1234567890을 출력된다.
      BufferedOutputStream bOutputStream = new BufferedOutputStream(System.out, 5);

      int c;
      while((c = fileReader.read()) != -1){
        bOutputStream.write(c);
      }
      bOutputStream.flush();//나머지 친구들도 출력 
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
