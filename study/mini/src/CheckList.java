public class CheckList {
  private String phoneNum;
  private String email;
  private String password;

  CheckList(){
    this.phoneNum = phoneNum;
    this.email = email;
    this.password = password;
  }

  public boolean phoneCheck(String phoneNum){
    if(phoneNum.length() == 11){
      return true;
    }else{
      System.out.println("핸드폰 번호를 다시 한번 확인해주세요.");
      return false;
    }
  }

      public boolean emailCheck(String email){
      if(!email.contains("@")){
        System.out.println("이메일을 다시한번 확인해주세요.");
        return false;
      }else{
        return true;
      }
    }

    public boolean passwordCheck(String pw){
      System.out.println(pw.length());
      if(pw.length() > 5 && pw.length() < 16){
        return true;
      }else{
        System.out.println("비밀번호를 다시입력해주세요.");
        return false;
      }
    }


}
