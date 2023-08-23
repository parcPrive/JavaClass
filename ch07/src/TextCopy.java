import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopy {
  public static void main(String[] args) {
    File sourceFile = new File("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8/test.txt");
    File copyFile = new File("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8/copytxt.txt");

    try {
      if(!copyFile.exists()){
        copyFile.createNewFile();
      }
      FileReader fileReader = new FileReader(sourceFile);
      FileWriter fileWriter = new FileWriter(copyFile);
      int c;
      while((c = fileReader.read()) != -1){
        fileWriter.write((char) c);
      }
      fileWriter.close();
      fileReader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
}
