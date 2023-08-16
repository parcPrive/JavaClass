public class ArrayTest {
  public static void main(String[] args) {
    
    int intArray[] = new int[5];
    intArray[0] = 1;
    intArray[1] = 2;
    intArray[2] = 3;
    intArray[3] = 4;
    intArray[4] = 5;
    // System.out.println("hello, %s, %s%n","world", "Java");
    // System.out.println("hello, %d, %d%n",10, 20);
    // System.out.println("hello, %f, %f", 10.0, 20.0);
    for(int i = 0; i < intArray.length; i++){
        System.out.printf("intArray[%d]: %d %n", i, intArray[i]);
    }
    
  }
  
}
