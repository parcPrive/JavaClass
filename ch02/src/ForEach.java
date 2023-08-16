public class ForEach {
  public static void main(String[] args) {
    int intArray[] = {1, 2, 3, 4, 5};
    int count = 0;
    // for(int num : intArray){
    //   System.out.println(num);
    //   count++;
    // }
    enum Week {Mon, Tue, Wed, Thu, Fri, Sat, Sun}
    
    Week days[] = Week.values();
    System.out.println(days); 

    // for(Week day :Week.values()){
    //   System.out.println(day);

    // }
  }
}
