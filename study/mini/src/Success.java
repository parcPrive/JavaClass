import java.text.SimpleDateFormat;
import java.util.Date;

public class Success {
  Success(){

  }


  public void template(String phoneNum, String name){
    Date date = new Date();
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println("안녕하세요"+ name + "님 회원가입을 축하드립니다." + df.format(date)); // format은 String 객체 반환, 

  }
}
