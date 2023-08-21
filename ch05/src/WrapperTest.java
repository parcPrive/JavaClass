public class WrapperTest {
  public static void main(String[] args) {
    char ch = 'A';
    char ch02 = '9';
      System.out.println(Character.toLowerCase(ch));
      System.out.println(Character.isDigit(ch));
      System.out.println(Character.isDigit(ch02));

      System.out.println(Character.isAlphabetic(ch));
      System.out.println(Character.isAlphabetic(ch02));

      String str = "30";
      int num = 30;
      System.out.println(Integer.parseInt(str) + 1);
      System.out.println(Integer.toHexString(num)); // toHexString는 16진수로 표현해준다.
      System.out.println(Integer.toBinaryString(num)); // toBinaryStirng은 2진수로 표현해준다.
      System.out.println(Integer.toString(num));
      System.out.println(str.equals(Integer.toString(num)));
      
      double d = 3.14;
      String d2 = "3.14";
      System.out.println(Double.toString(d)); // "3.14"
      System.out.println(Double.parseDouble(d2));

      Integer ten = 10; // boxing
      int ten02 = ten; // unboxing

      // Integer hundred = 100; //Integer.valueOf(100);
      // int hundred02 = hundred;
      System.out.println(ten02 == ten); // Integer와 int의 차이가 뭘까... 객체 머시기라고는 하지만 결과값은 같고 할당도 할수있고...


      Integer num01 = 12345; //객체라며...
      Integer num02 = 12345;
      System.out.println(num01 == num02);
      System.out.println(num01.equals(num02));
      int num001 = num01;
      int num002 = num02;
      System.out.println(num001 == num002);
      

  }
  
}
