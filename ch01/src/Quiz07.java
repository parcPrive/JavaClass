import java.util.Scanner;

public class Quiz07 {
  public static void main(String[] args) {
    
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("가위바위보를 입력하세요.");
    // System.out.print("영희: ");
    // String young = scanner.next();
    // System.out.print("철수 :");
    // String chul = scanner.next();
    // if(young.equals(chul)){
    //   System.out.println("비겼습니다.");
    // }else if(!young.equals(chul)){
    //   if((young.equals("가위") && chul.equals("보")) || (young.equals("바위") && chul.equals("가위")) || (young.equals("보") && chul.equals("주먹"))){
    //     System.out.println("영희가 이겼습니다.");
    //   }else if((chul.equals("가위") && young.equals("보")) || (chul.equals("바위") && young.equals("가위")) || (chul.equals("보") && young.equals("주먹"))){
    //       System.out.println("철수가 이겼습니다.");
    //   }
    // }
    Scanner scanner = new Scanner(System.in);
    System.out.println("가위 바위 보 중 하나를 입력하세요.");
    System.out.print("철수 ===>");
    String chul = scanner.next();
    System.out.print("영희 ===>");
    String young = scanner.next();
    if(chul.equals("가위")){
      if(young.equals("가위")){
        System.out.println("비겼습니다.");
      }else if(young.equals("바위")){
        System.out.println("철수가졌습니다.");
      }else{
        System.out.println("철수가이겼습니다.");
      }
    }else if(chul.equals("바위")){
      if(young.equals("바위")){
        System.out.println("비겼습니다.");
      }else if(young.equals("보")){
        System.out.println("철수가졌습니다.");
      }else{
        System.out.println("철수가이겼습니다.");
      }
    }else if(chul.equals("보")){
      if(young.equals("보")){
        System.out.println("비겼습니다.");
      }else if(young.equals("가위")){
        System.out.println("철수가졌습니다.");
      }else{
        System.out.println("철수가이겼습니다.");
      }
    }
    else{
      if(young.equals("가위")){
      if(chul.equals("가위")){
        System.out.println("비겼습니다.");
      }else if(chul.equals("바위")){
        System.out.println("영희가졌습니다.");
      }else{
        System.out.println("영희가이겼습니다.");
      }
    }else if(young.equals("바위")){
      if(chul.equals("바위")){
        System.out.println("비겼습니다.");
      }else if(chul.equals("보")){
        System.out.println("영희가졌습니다.");
      }else{
        System.out.println("영희가이겼습니다.");
      }
    }else if(young.equals("보")){
      if(chul.equals("보")){
        System.out.println("비겼습니다.");
      }else if(chul.equals("가위")){
        System.out.println("영희가졌습니다.");
      }else{
        System.out.println("영희가이겼습니다.");
      }
    }
  }

}
}