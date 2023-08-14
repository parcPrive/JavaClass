public class TypeConversion {
  public static void main(String[] args) {
    byte b = 127; // byte는 -128 ~ 127까지 사용이 가능하다.
    int i = 100;
    System.out.println(b + i);
    System.out.println(10 / 4); // int형으로 나와서 2.5가아닌 2가나온다.
    System.out.println(10.0 / 4); // 10에 .0을 추가해서 2.5를 나오게 만들었다.
    System.out.println(((int)2.9) + 1.8); // int를 사용하면 뒤에 소수가 어떤수던간에 다 버리고 계산을한다.
    System.out.println((int)2.9 + 1.8 );  // 위에 거랑 같은 결과값이 나온다.
    System.out.println((int)(2.9 + 1.8) ); // 2.9 + 1.8 => 4.7이지만 int가 있어 소수점을 버린 4가 된다.
    System.out.println((int)(2.9) + (int)(1.8) ); // 2.9와 1.8 앞에 int가 있는데 이러면 둘다 2 와 1이 나와서 3의 값을 가지게 된다.

  }
}

