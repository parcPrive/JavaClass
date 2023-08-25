public class ParcsIntException {
  public static void main(String[] args) {
    String strNumber[] = {"10", "20", "3.14", "99"};
    // int i = 0;
    for(int i = 0; i < strNumber.length; i++){
    try {
        int result = Integer.parseInt(strNumber[i]);
        System.out.println(result);

    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("asdasdasdasd");
      double errorNum = Double.parseDouble(strNumber[i]);
      System.out.println(errorNum);
      continue;
    }
  }
  }
  
}
