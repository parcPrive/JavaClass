import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class FileInputStreamTest {
  public static void main(String[] args) {
    // 바이트 스트림 모든 문서 다 읽을수있다.
    InputStreamReader in = null;
    FileInputStream fin = null;
    Charset charset = StandardCharsets.UTF_8;
    try{
    fin = new FileInputStream("Users\\junghunmok\\Desktop\\test.rtf");
    in = new InputStreamReader(fin, charset);
    // in = new InputStreamReader(fin, "UTF-8");
    System.out.println(in.getEncoding());
    int c;

    while((c = in.read()) !=1){
    System.out.println((char) c);
    }
  } catch (Exception e){
    e.printStackTrace();

    }
  
  }
  
}
