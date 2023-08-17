// 이름: 전화번호

import java.util.Scanner;

class Phone {
  private String name;
  private String tel;
  public Phone(String name, String tel) {
    // this.name = tel;
    this.name = name;
    this.tel = tel;
    
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
}


public class PhoneBook {
  //has-a (다른 클래스를 품고 있을때...)
  
    private Phone phoneList[];
    private Scanner scanner;

    public PhoneBook(){
      scanner = new Scanner(System.in);
    }


    
    Phone aaa = new Phone("정현목", "010101010");

    public void write() {
      System.out.println("몇명을 입력하시겠습니까?");
      int total = scanner.nextInt();
      phoneList = new Phone[total];
      for(int i = 0; i < total; i++){
        System.out.println("이름을 입력해주세여.");
        String name = scanner.next();
        System.out.println(name+"님의 전화번호를 입력하세여.");
        String tel = scanner.next();
        phoneList[i] = new Phone(name,tel);
      }
      System.out.println(total+"명의 전화번호가 입력되었습니다.");
      System.out.println("이름 => " + phoneList[1].getTel());
      // System.out.println("이름 => " + phoneList[1].getName().equals("1번"));
    }


    //전화번호 찾기 search(이름) 전화번호

    public String search(String name){
      // 이름의 맞는 전화번호 꺼내기
      System.out.println();
      for(int i = 0; i < phoneList.length; i++){
        if(phoneList[i].getName().equals(name)){
          System.out.println(phoneList[i].getTel());
          return phoneList[i].getTel();
        }
      }
      return null;
    }


    public void run(){
      while(true){
        System.out.println("이름을 쓰세요.");
        String name = scanner.next();
        if(name.equals("그만")) return;
        
        String tel = search(name);
        if(tel == null){
          System.out.println("없는 사람입니다. 다시 한번 이름을 확인해주세요.");
        }else{
          System.out.println(name+"님의 전화번호는 " + tel + "입니다.");
        }


        }
        
      }
    

    public Phone[] getPhoneList() {
      return phoneList;
    }

    public void setPhoneList(Phone[] phoneList) {
      this.phoneList = phoneList;
    }

    public Scanner getScanner() {
      return scanner;
    }

    public void setScanner(Scanner scanner) {
      this.scanner = scanner;
    }

    public Phone getAaa() {
      return aaa;
    }

    public void setAaa(Phone aaa) {
      this.aaa = aaa;
    }
    
    
  
}
