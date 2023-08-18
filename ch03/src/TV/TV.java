package TV;
public class TV {
  String brand;
  int year;
  int size;

  
  TV(){}

  void show(){ 
    System.out.println(brand + "에서 만든 "+year+"년형 "+ size+ "인치 tv입니다.");
  }
  
}



// 생성자함수는 3개의 매개변수를 가지게 만든가 show() 메서드를 만들어서 브랜드에서 만든 몇년형 몇인치 tv
