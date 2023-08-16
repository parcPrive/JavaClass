import java.util.Arrays;

public class ArrayArray {
  public static void main(String[] args) {
    // int intArray[][] = new int[2][3];
    double score[][] = {{2.5, 3.1}, {3.5, 3.7}, {3.5, 4.1}, {4.25, 4.1}};
    
    // Arrays.toString(score[0]);
    
    for(int i = 0; i < score.length; i++){
      for(int j = 0; j < score[0].length; j++){
        System.out.printf("%d학년의 성적은 %.2f입니다. %n", i+1, score[i][j]);
      }
    }
  }
}
