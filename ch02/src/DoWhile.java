public class DoWhile {
  public static void main(String[] args) {
    // a ~ z
    char i = 'a';
    do{
      System.out.println(i);
      i = (char) (i + 1);
    } while(i <= 'z');
  }
  
}
