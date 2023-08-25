import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordExplorer {
   public static void main(String[] args) {
    File file = new File("/Users/junghunmok/Desktop/수업/words.txt");
    List<String> wordsList = new ArrayList<>();
    try{
      FileReader fileReader = new FileReader(file);
      Scanner scanner = new Scanner(fileReader);
      while(scanner.hasNext()){
        String word = scanner.nextLine();
        wordsList.add(word);
      }
      scanner.close();
      System.out.println(wordsList.get(0));
      Scanner searchScanner = new Scanner(System.in);
      while(true){
        System.out.println("단어를 입력해 주세요");
        String searchWord = searchScanner.nextLine();
        if(searchWord.equals("그만")) break;
        for(int i = 0; i < wordsList.size(); i++){
          String word = wordsList.get(i);
          String findWord = word.substring((0), searchWord.length());
          if(findWord.contains(searchWord)){
            System.out.println(word);
          }
        }
      }
      System.out.println(wordsList.size());


      //   System.out.println("찾으실 영어 단어를 입력");
      //   String search = wordScanner.next();
      // while(scanner.hasNext()){
      //   String word = scanner.next();
      //   int count = 0;
      //   for(int i = 0; i < search.length(); i++){
      //     if(word.split("")[i] == search.split("")[i]){
      //       count++;
      //     }
      //     if(count == search.length()){
      //       words.add(word);
      //     }
      //   }
      // }
      // System.out.println(words.size());

    }catch(Exception e){
      e.printStackTrace();

    }

   }
  
}
