import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
  public static void main(String[] args) {
    File sourceImg = new File("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8/eun.jpeg");
    File copyImg = new File("/Users/junghunmok/Desktop/수업/copy-eun.jpeg");
    try {
      if(!copyImg.exists()){
        copyImg.createNewFile();
        FileInputStream fileInputStream = new FileInputStream(sourceImg);
        FileOutputStream fileOutputStream = new FileOutputStream(copyImg);
        byte buffer[] = new byte[1024 * 10];
        // 이거는 하나씩 읽을때 느림..
        // int c;
        long before = System.currentTimeMillis();
        // while((c = fileInputStream.read()) != -1){
        //   fileOutputStream.write((byte) c);
        // }
        while(true){
          int end = fileInputStream.read(buffer);
          fileOutputStream.write(buffer, 0, end);
          if(end < buffer.length) break;
        }
        long after = System.currentTimeMillis();
        fileInputStream.close();
        fileOutputStream.close();
        System.out.println(after - before);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
}
