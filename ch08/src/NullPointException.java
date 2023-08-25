import java.util.Optional;

public class NullPointException {
  public static void main(String[] args) {
    
    String msg = null;

    Optional<String> cat = Optional.of("cat");
    Optional<String> cat02 = Optional.ofNullable(null);
    System.out.println(cat.get());
    System.out.println(cat02.orElse("얍"));
  
    try {
      
      System.out.println(msg.length());
    } catch (NullPointerException e) {
      // TODO: handle exception
      System.out.println("null의 길이는 없습니다.");
      e.printStackTrace();
    }
    
  }
  
}
