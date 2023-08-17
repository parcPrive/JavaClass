public class Book {
  // title, author
  String title;
  String author;

  Book(){
    
    this("","");

  }
  
  Book(String title){
    // this.title = title;
    // author = "작자 미상";
    this("","작자미상");

  }

  Book(String title, String author){
    this.title = title;
    this.author = author;
  }
  
  public static void main(String[] args) {
    Book javaJungSuk = new Book("자바의정석", "남궁 성");
    System.out.println(javaJungSuk.title + "/" +javaJungSuk.author);
  }
}
