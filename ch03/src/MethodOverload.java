public class MethodOverload {
  // 메서드, 오버로드(매개변수의 갯수가 다르거나 타입이 다르거나 리턴 타입은 관여하지 않는다.
  int getSum(int i, int j){
    return i + j;
  }
    int getSum(int i, int j, int k){
    return i + j + k;
  }
  // int getSum(int i, double j){
  //   return i + j;
  // }
  
  // double getSum(int i, double j){
  //   return i + j;
  // }
  public static void main(String[] args) {
    MethodOverload m01 =  new MethodOverload();
    int m01Sum = m01.getSum(20, 40);
    System.out.printf("m01Sum의 값은 = %d",m01Sum);
  }
}