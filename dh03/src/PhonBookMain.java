public class PhonBookMain {
  public static void main(String[] args) {
    PhoneBook myPhoneBook = new PhoneBook();
    myPhoneBook.write();
    System.out.println(myPhoneBook.getPhoneList());


    String name = "정현목";
    myPhoneBook.run();;
    // System.out.println("이름은=>"+name+"이며 "+"번호는" + serchTel);
  }
  
}
