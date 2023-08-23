package quiz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {
  public static void main(String[] args) {
    // HashMap<String,String> phone = new HashMap<>();
    // Scanner scanner = new Scanner(System.in);
    // while(true){
    //   System.out.println("이름을 입력하세요.");
    //   String name = scanner.next();
    //   if(name.equals("그만")){
    //     break;
    //   }
    //   System.out.println("전화번호를 입력하세여.");
    //   String tel = scanner.next();
    //   phone.put(name, tel);
    // }
    // Set<String> keys = phone.keySet();
    // Iterator<String> it = keys.iterator();
    // // System.out.println(keys);
    // File phoneTxt = new File("/Users/junghunmok/Desktop/수업/phone.txt");
    // FileWriter fileWriter = null;
    // try {
    //   if(!phoneTxt.exists()){
    //     phoneTxt.createNewFile();
    //   }
    //   fileWriter = new FileWriter("/Users/junghunmok/Desktop/수업/phone.txt");
    //   while(it.hasNext()){
    //     System.out.println(phone.get(it.next()).length());
    //     System.out.println(phone.size());
    //     fileWriter.write(phone.get(it.next())+ "\r\n");//0, phone.get(it.next()).length()
        
    //   }
    //   fileWriter.close();

    // } catch (IOException e) {
    //   e.printStackTrace();
    // }
    //=======================내코드================

    File file = new File("/Users/junghunmok/Desktop/수업/phone.txt");
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter(file);
      Scanner scanner = new Scanner(System.in);
      System.out.println("전화번호 저장 프로그램입니다.");
      while(true){
        System.out.print("이름 전화번호 =====>");
        String line = scanner.nextLine();
        if(line.equals("그만")) break;
        fileWriter.write(line + "\r\n");
      }
      fileWriter.close();
      
    } catch (IOException e) {
      
      e.printStackTrace();
    }
}
// scanner를 통해 이름과 전화번호를 입력받는다. 
}