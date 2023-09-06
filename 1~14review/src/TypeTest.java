public class TypeTest {
  public static void main(String[] args) {
    // type은 많다.
    // 기본적으로 8개가 있다.
    boolean isTrue = true;
    System.out.println(isTrue);
    int intNum = 10; // int의 범위는 2의 32제곱까지 가능하다 + - 거진 21억까지이다.
    long longNum =  1241242222212L;//long은 2의 64제곱까지 가능하다.

    System.out.println(Float.MAX_VALUE);
    System.out.println(-Float.MAX_VALUE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Double.MAX_VALUE);

    int num01 = 10;
    int num02 = 5;
    double double01 = 5.0 / 2; // 두수중 하나라도 .0을 붙여야 2.5가 나온다. 안붙이면 2.0이나온다 왜? 소수점이 없으면 int라고 알아먹는다.
    System.out.println(double01);

    char ch01 = 'a';
    char ch02 = 97;
    System.out.println((int) ch01);
    System.out.println(ch02);
    
  }
}
