package calc;

import java.util.Scanner;

// Add, Multiply, Subtract, divide

class Add extends Calc{

  // Add(int a, int b){
  //   this.a = a;
  //   this.b = b;
  // }
  @Override
  int calculate() {
    return a + b;
  }
  
}

class Subtract extends Calc{

  //  Subtract(int a, int b){
  //   this.a = a;
  //   this.b = b;
  // }

  @Override
  int calculate() {
   return a - b;
  }

}
class Multiply extends Calc{

  //  Multiply(int a, int b){
  //   this.a = a;
  //   this.b = b;
  // }

  @Override
  int calculate() {
    return a * b;
  }

}
class Divide extends Calc{

  //  Divide(int a, int b){
  //   this.a = a;
  //   this.b = b;
  // }

  @Override
  int calculate() {
   return a / b;
  }

}


public class MyCalculator {
  public static void main(String[] args) {
    // Add add = new Add(10,20);
    // System.out.println(add.calculate());

    // Subtract subtract = new Subtract(30, 20);
    // System.out.println(subtract.calculate());

    // Multiply multiply = new Multiply(20, 10);
    // System.out.println(multiply.calculate());

    // Divide divide = new Divide(30, 3);
    // System.out.println(divide.calculate());
    Scanner scanner = new Scanner(System.in);
    System.out.println("첫번째 숫자를 입력하세여.");
    int a = scanner.nextInt();
    System.out.println("+, -, *, / 중 하나를 입력해주세요,");
    String operation = scanner.next(); 
    System.out.println("두번쨰 숫자를 입력해주세요");
    int b = scanner.nextInt();
    
    Calc exp = null;
    int result = 0;
    switch(operation){
      case "+":
        exp = new Add();
        break;
      
      case "-":
        exp = new Subtract();
        break;
      
      case "*": 
        exp = new Multiply();
        break;

      case "/":
        exp = new Divide();
        break;
    }
    exp.setValue(a,b);
    result = exp.calculate();
    System.out.println(result);
  }
  
}
