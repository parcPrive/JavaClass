import java.util.Scanner;

public class SignUp {
  private String name;
  private int age;
  private String email;
  private String password;
  private String phoneNum;

  SignUp(){
    this.name = name;
    this.age = age;
    this.email = email;
    this.password = password;
    this.phoneNum = phoneNum;
  }
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  CheckList checkList = new CheckList();
  Success success = new Success();
  SignUp signUp = new SignUp();
  System.out.print("이름을 입력하세요. =>");
  signUp.name = scanner.next();
  System.out.print("나이을 입력하세요. =>");
  signUp.age = scanner.nextInt();
  System.out.print("email을 입력하세요. =>");
  signUp.email = scanner.next();
  System.out.print("비밀번호을 입력하세요. =>");
  signUp.password = scanner.next();
  System.out.print("핸드폰번호을 입력하세요. =>");
  signUp.phoneNum = scanner.next();
  
  if(!checkList.phoneCheck(signUp.phoneNum)) return;
  if(!checkList.passwordCheck(signUp.password)) return;
  if(!checkList.emailCheck(signUp.email)) return;
  success.template(signUp.phoneNum, signUp.name);
  

}
  
}
