package calc;

import java.util.Scanner;

public class Calcuator {
  //더하기
  public int add(int x, int y){
    return x + y;
  }
  //빼기
  public int subtract(int x, int y){
    return x - y;
  }
  //평균
  public double average(int[] array, int nums){
    array = new int[nums];
    int sum = 0;
    for(int i = 0; i < array.length; i++){
      sum += array[i];
    }

    return sum / array.length;

  }
}

class SamsungCalculaot extends Calcuator{
  Scanner scanner = new Scanner(System.in);

  @Override
  public int add(int x, int y) {
    System.out.println("숫자 두개를 입력하세요.");
    x = scanner.nextInt();
    y = scanner.nextInt();
    return super.add(x, y);
  }

  @Override
  public double average(int[] array, int nums) {
    nums = scanner.nextInt();
    array = new int[nums];
    return super.average(array, nums);
  }

  @Override
  public int subtract(int x, int y) {
    System.out.println("숫자 두개를 입력하세요.");
    x = scanner.nextInt();
    y = scanner.nextInt();
    return super.subtract(x, y);
  }
  
}
