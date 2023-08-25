import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// 이런 코드드링 쌓이면 library  
class Words {
    // field
    List<String> wordsList = new ArrayList<>();

    public Words(String sourceFile) {
        File file = new File(sourceFile);
        FileReader fileReader;
        try {
            fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                String word = scanner.nextLine();
                wordsList.add(word);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            e.printStackTrace();
        }
    }

    public String getRandomWord() {
        int ran = (int) (Math.random() * wordsList.size());
        return wordsList.get(ran);
    }

  }



public class HangMan {
  public String randomWord;
  public Scanner scanner;
  public StringBuffer hiddenWord;

  private void go(){
    System.out.println(hiddenWord);
    System.out.println(randomWord);
    while(true){
      String str = scanner.next();
          // if(str.equals("그만")) break;
          char ch2 = str.charAt(0);
          if(trueOrFalse(ch2)) {
            System.out.println("욤ㄴㅇㅁ나어ㅗ");
            break;
          }
          else System.out.println(hiddenWord);
    }
 
            
  }

private boolean trueOrFalse(char ch02){
    boolean result = false;
               for(int i = 0; i < randomWord.length(); i++){
              if(hiddenWord.charAt(i) == '-' && randomWord.charAt(i) == ch02){
                System.out.println("정답입니다.");
               result = true;
              }else{
                // System.out.println("땡");
                result = false;
              }
            }
            return result;
          }

  
  
  public void run(){
  Words words = new Words("/Users/junghunmok/Desktop/\u1109\u116E\u110B\u1165\u11B8/words.txt");
  System.out.println("행맨 게임을 시작합니다.");
  scanner = new Scanner(System.in);
  while (true) {
    randomWord = words.getRandomWord(); // wordList에서 정답 뽑아오기
    System.out.println("여기1");
    makeHiddenWord(); // 정답에서 글자하나만 -로 바꿔준다.
    go();
      System.out.println("한게임더 할래? y/n");
      String yesOrNo = scanner.next();
      if(yesOrNo.equals("n")) break;
    
  }
  
}

private void makeHiddenWord(){
        Random random = new Random();
        int idx = random.nextInt(randomWord.length());
        System.out.println(randomWord + "/" + idx + "/" + randomWord.charAt(idx));
        char ch = randomWord.charAt(idx);
        hiddenWord = new StringBuffer(randomWord);

        for (int i = 0; i < randomWord.length(); i++) {
            if (hiddenWord.charAt(i) == ch) {
                hiddenWord.setCharAt(i, '-');
            }
        }
        // hiddenWord = hiddenWord;
      }

    // words.txt 읽어와서
    // list에 넣기
    // 랜덤 단어 출력
    // horse
    // h-rse char하나 빼서 -로 대체하기...
    // 숨긴 char랑 내가 쓴 char가 맞으면 다음게임 진행
    // 그만
    public static void main(String[] args) {
      HangMan hangMan = new HangMan();
      hangMan.run();
        

        // 반복문 돌려서 맞는지 틀린지 판단...

        // System.out.println(hiddenWord.toString());
    
  }
}