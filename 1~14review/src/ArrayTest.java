public class ArrayTest {
  public static void main(String[] args) {
    char charList[] = {'a', 'b', 'c'};
    int intList[] = new int[3];
    intList[0] = 10;
    intList[1] = 20;
    intList[2] = 30;

    int copyIntList[] = intList;
    copyIntList[0] = 100;
    System.out.println(copyIntList[0] + "===" + intList[0]);



    int intList02[][] = new int[3][2];
    intList02[0][0] = 1;
    intList02[0][1] = 2;
    intList02[1][0] = 3;
    intList02[1][1] = 4;
    intList02[2][0] = 5;
    intList02[2][1] = 6;
    
    final int nums[] = {1, 2, 3};
    nums[0] = 100;
    
    var guessIntNum = 1;
    System.out.println(guessIntNum);
    
  }
  
}
