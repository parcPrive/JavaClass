import java.io.FileReader;

public class FileReaderTest {
  public static void main(String[] args) {
    FileReader fileReader = null;
    try{
      fileReader = new FileReader("C: \\window\\system.ini");
      int c;
      while ((c  = fileReader.read()) != -1){
        System.out.println((char) c= c);
      }
    }chatch(Exception e){
      e.printStackTrace();
    }

  }  
}
