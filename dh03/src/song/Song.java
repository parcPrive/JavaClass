package song;

public class Song {
  String title;
  String artist;
  int year;
  String contry;

  void show(){
    System.out.println(year+"에 출시된" + contry +"국적의 " + artist +"가 부른 " + title+ "입니다.");
  }

}
