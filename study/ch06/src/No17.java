public class No17 {
  static void shuffle(int[] original){
    int temp = 0;
    for(int i = 0; i < original.length; i++){
      int random = (int)Math.floor(Math.random() * 9 +1);
      original[i] = original[random]
    }
  }
  
  public static void main(String[] args) {
    int original[] = {1,2,3,4,5,6,7,8,9};
    shuffle(original);
  }
}
