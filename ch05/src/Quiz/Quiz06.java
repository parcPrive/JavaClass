package Quiz;

import java.util.Arrays;

public class Quiz06 {
  public static void main(String[] args) {
    String str = "fdngdsogjnsedasfijqwfr";
    String al[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    System.out.println(al.length);
    String strs[] = str.toLowerCase().split("");
    System.out.println(Arrays.toString(strs));
    
    int count = 0;
    String total = new String("");
    for(int i = 0; i < al.length; i++){
      count = 0;
      for(int j = 0; j < strs.length; j++){
        if(al[i].equals(strs[j])){
          count++;
        }
      }
      // total = total.concat(al[i] +"는 => "+ count+"개 입니다.");
      // System.out.println(al[i] +"는 => "+ count+"개 입니다.");
    }
    // System.out.println(total);
   
    
    // 97~122
    int all[] = new int[26];
    String str1 = "suighdisugsACLAbkjbviusd   ehfasfmssasf";
    for(int i = 0; i < str1.length(); i++){
      char ch = str1.charAt(i);
      if((int) ch >= 97 && (int)ch <= 122){ // if(ch >= 'a' && ch <= 'z')
        all[(int)ch -97]++;
      }
      // all[ch -'a']++;
      
    }
    for(int i = 0; i < all.length; i++){
      System.out.printf("%c => %d%n", (char) (i + 97), all[i]);
    }
    // System.out.println(Arrays.toString(all));
  }
}
