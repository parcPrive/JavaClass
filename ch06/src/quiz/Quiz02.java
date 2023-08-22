package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz02 {
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // char hak[] = new char[6];
    // // System.out.println((int) ch);
    // int score[] = new int[5];
    // for(int i = 0; i < hak.length; i++){
    //   String s = scanner.next().toUpperCase();
    //   char ch = s.charAt(0);
    //    if((int) ch >=65 && (int) ch <= 70){
    //     if((int)ch == 70){
    //       score[score.length -1]++;
    //       hak[i] = ch;
    //     }else{
    //       hak[i] = ch;
    //       score[(int) ch - 65]++;
    //     }
    //   }else{
    //     i = i - 1;
    //   }
    // }
    // int sum = 0;
    // for(int i = 0; i < score.length; i++){
    //   sum += Math.abs(i - 4) * score[i];
    // }
    // System.out.println(sum/score.length);
    // ================내가한거==================
    Character ch[] = { 'A', 'B', 'C', 'D', 'F'};
    ArrayList<Character> scoreList = new ArrayList<>(
      Arrays.asList(ch)
    );
    Iterator<Character> it = scoreList.iterator();

    double score = 0.0;
    while(it.hasNext()){
      char ch01 = it.next();
      switch (ch01){
        case 'A': score += 4.0;
                  break;
        case 'B': score += 3.0;
                  break;
        case 'C': score += 2.0;
                  break;
        case 'D': score += 1.0;
                  break;
        case 'F': score += 0.0;
                  break;
      }
    }
    
    // scoreList.add('A');
    // scoreList.add('B');
    // scoreList.add('C');
    // scoreList.add('D');
    // scoreList.add('A');
    // scoreList.add('B');
    // double score = 0.0;
    // for(int i = 0; i < scoreList.size(); i++){
    //   System.out.println(scoreList.get(i));
    //   char ch = scoreList.get(i);
    //   switch (ch){
    //     case 'A': score += 4.0;
    //               break;
    //     case 'B': score += 3.0;
    //               break;
    //     case 'C': score += 2.0;
    //               break;
    //     case 'D': score += 1.0;
    //               break;
    //     case 'F': score += 0.0;
    //               break;
    //   }
    // }
    System.out.println(score/scoreList.size());
  }
}
