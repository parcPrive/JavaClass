package quiz;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Quiz02 {
  public static void main(String[] args) throws IOException {
    // File file = new File("/Users/junghunmok/Desktop/수업/test.txt")
    FileReader fileReader = null;
    try {
      fileReader = new FileReader("/Users/junghunmok/Desktop/수업/test.txt");
      BufferedOutputStream bOutputStream = new BufferedOutputStream(System.out, 3);
      int c;
      while((c = fileReader.read()) != -1){
        // System.out.println((char)c);
        if(c >97){
          bOutputStream.write(c -32);
        }else{
          bOutputStream.write(c);
        }
        
      }
      // bOutputStream.flush();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
  
}
