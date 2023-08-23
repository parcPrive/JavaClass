package quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Quiz {
  public static void main(String[] args) throws IOException {
    FileReader fileReader = null;
    File file = new File("/Users/junghunmok/Desktop/수업/phone.txt");
    BufferedReader bufferedReader = null; //보조 스트림
    try{
      bufferedReader = new BufferedReader(new FileReader(file));
      long before = System.currentTimeMillis();
      while(true){
        String line = bufferedReader.readLine();
        if(line == null) break;
        System.out.println(line);
      }
      long after = System.currentTimeMillis();
      System.out.println(after - before);
    }catch(Exception e){
      e.printStackTrace();
    }
    // try {
    //   fileReader = new FileReader(file);
    //   byte buffer[] = new byte[10];
    //   int c;
    //   while( (c = fileReader.read()) != -1 ){
    //     System.out.print((char) c);
    //   }
    //   while(true){
    //     int end = fileReader.write(buffer);
        
    //   }
    // } catch (FileNotFoundException e) {
    //   // TODO Auto-generated catch block
    //   e.printStackTrace();
    // }
  }
  
}
