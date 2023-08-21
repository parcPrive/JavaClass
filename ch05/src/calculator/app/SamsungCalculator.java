
package calculator.app;

import calculator.lib.Calculator;

public class SamsungCalculator extends Calculator{

  @Override
  public int add(int a, int b) {
    return a + b;
  }

  @Override
  public int subtrackt(int a, int b) {
    return a - b;
  }

  @Override
  public double average(int[] array) {
   int sum = 0;
   for(int i = 0; i < array.length; i++){
    sum += array[i];
   }
   return sum / array.length;
  }

  
}