import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
  public static void main(String[] args) {
    // test04.txt파일을 만들어서 hello java 글써 놓기
    File file = new File("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8/fileTest.txt"); //파일을 생성할 경로와 파일이름
    File folder = new File("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8/sample"); //파일을 생성할 경로와 파일이름
    File tempFolder = new File("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8"); //파일을 생성할 경로와 파일이름
    File fileList[] = tempFolder.listFiles();
    System.out.println(fileList.length); //폴더안에 파일의 갯수를 알수있다.
    File txt04 = new File("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8/test04.txt");
    if(!txt04.exists()){
      try {
        txt04.createNewFile();
        FileWriter fw = new FileWriter(txt04);
        fw.write("hello \r\n java");;
        fw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }


    // System.out.println(file.exists());
  // if(!folder.exists()){
  //   folder.mkdir();
  // }
  //   System.out.println(folder.isDirectory());
  //   if(file.exists()){
  //     file.delete();
  //   }
  //   if(!file.exists()){ //file.exists()는 true false로 return 한다. 왜? 내가 설정한 경로에 내가 만들 파일이 없다면 false있다면 true를 return한다.
  //     try {
  //       file.createNewFile(); // file.exists()가 false일떄 파일을 생성한다.
  //     } catch (IOException e) {
  //       e.printStackTrace();
  //     }
// }
System.out.println(file.getPath() + ", " + file.getParent() + ", " + file.getName());

    
  }
}
