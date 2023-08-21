package Quiz;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Quiz05 {
  public static void main(String[] args) {
    String str = "hello";
    String strs[] = str.split("");
    
    String first = "";
    for(int i = 0; i < strs.length; i++){
      first = strs[i];
      for(int j = 0; j < strs.length - 1; j++){
          strs[j] = strs[j + 1];
      }
      strs[strs.length - 1] = first;
      System.out.println(String.join("",strs));
    }

    // System.out.println(Arrays.toString(strs));

    
  }
  
  
}
