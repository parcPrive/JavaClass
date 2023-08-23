import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutoutStreamTest {
  public static void main(String[] args) {
    byte b[] = {7, 1, 2, 3, 6};
    FileOutputStream fileOutputStream = null;
    try{
      fileOutputStream = new FileOutputStream("/Users/junghunmok/Desktop/test.out");
      for(int i = 0; i < b.length; i++){
        fileOutputStream.write(b[i]);
      }
      fileOutputStream.close();
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
