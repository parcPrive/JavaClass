import java.util.Arrays;
import java.util.StringTokenizer;

public class StringBufferTest {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("this");
    sb.append("is not pipe");
    System.out.println(sb);

    sb.insert(1,"a");
    System.out.println(sb);
    sb.replace(12, 16, "apple");
    System.out.println(sb);
    sb.delete(0, 5);
    System.out.println(sb);
    // StringBuffer는 가변 객체이며,원본이 바뀐다.
    String title = "홍길동/심청전/콩쥐/팥쥐/개구리/왕눈이";
    StringTokenizer st = new StringTokenizer(title, "/"); //title을 /를 기준으로 쪼개서 st안에 넣는다. 근데 이때 배열로 들어가겠지?
    
    while(st.hasMoreTokens()){ // hasMoereTokens()을 사용하면 st안에 토큰으로된 내용이 남아있냐? 남아아있으면 출력하고 없다면 false여서 while문을 나옵니다.
        System.out.println(st.nextToken());
    }
    


  }
  
}
