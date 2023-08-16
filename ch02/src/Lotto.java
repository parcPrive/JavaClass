import java.util.Arrays;

public class Lotto {
  public static void main(String[] args) {
    // 번호 6개 뽑기
    int num[] = new int[45];
    
    for(int i = 0; i < num.length; i++){
      num[i] = i + 1;
    }
    int temp = 0;
    for(int i = 0; i < 6; i++){
      for(int j = 0; j < 3; j++){
        int random = (int) (Math.floor(Math.random() * 45));
        temp = num[i];
        num[i] = num[random];
        num[random] = temp;
        // System.out.println(temp);
      }
      // System.out.println((Arrays.toString(num)));
    }
    
    int lotto[] = Arrays.copyOf(num,6);
    Arrays.sort(lotto);
    System.out.println(Arrays.toString(lotto));
    // for(int i = 0; i < 6; i++){
    //   System.out.println(lotto[i]);
      
    // }
    // System.out.println(random);
    
  }
}
