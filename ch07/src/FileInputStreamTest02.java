import java.io.FileInputStream;


public class FileInputStreamTest02 {
  public static void main(String[] args) {
    // byte b[] = new byte[6];
    // FileInputStream fileInputStream = null;
    // try {
    //   fileInputStream = new FileInputStream("/Users/junghunmok/Desktop/test.out");
    //   int c;
    //   int n = 0;
    //   while((c = fileInputStream.read()) != -1){
    //     b[n] = (byte) c;
    //     n++;
    //   }
    //   for(int i = 0; i < b.length; i++){
    //     System.out.println(b[i]);
    //   }
    // } catch (Exception e) {
    //   e.printStackTrace();
    // }

        byte b[] = new byte[1000];
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8/ice-cream.png");
      int c;
      int n = 0;
      while((c = fileInputStream.read()) != -1){
        b[n] = (byte) c;
        n++;
      }
      for(int i = 0; i < b.length; i++){
        System.out.println(b[i]);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}
