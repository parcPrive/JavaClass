import java.util.Scanner;

public class ArrayTest02 {
  public static void main(String[] args) {
    // int intArray[] = new int[5];
    int intArray[] = {10, 30, 40, 20, 15, 90, 80};
    // 동물 이름 배열 길이 5개를 만들고 출력하기
    String arr[] = {"사자", "호랑이", "곰", "강아지", "고양이"};
    Scanner scanner = new Scanner(System.in);
    // for(int i = 0; i < arr.length; i++){
    //   System.out.printf("arr[%d] : %s %n", i,arr[i]);   
    // }
    //======
    int num[] = new int[5];
    int temp = 0;
    int min = 0;
    for(int i = 0; i < num.length; i++){
      num[i] = scanner.nextInt();
      if(i == 0){
        min = num[0];
      }
      else if(num[i] < min){
        min = num[i];
      }
      //     if(num[0] < num[i]){
      //   temp = num[i];
      //   num[i] = num[0];
      //   num[0] = temp;
      // }
      if(num[i] > temp){
        temp = num[i];
      }
    }
    // for(int i = 1; i < num.length; i++){
  
    // }
    System.out.printf("가장큰수는 %d, 가장작은수는 %d", temp, min);
  }
}
