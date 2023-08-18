public class Circle {
    
    int radius;
    String name;

    //생성자를 여러개 만들 수 있다.
    Circle(){
      radius = 1;
      name = "";
    }

    Circle (int radius){
      this.radius = radius; 
      name = "";
      // System.out.println("나는처음 생성될떄 한번만 생행합니다. 다시 호출 될일이 없어요.");
    }

    Circle(int radius, String name){
      this.name = name;
      this.radius = radius;
      

    }


    double getArea(){
      return radius * radius *3.14;
    }
  
  public static void main(String[] args) {

    Circle domino = new Circle();
    domino.radius = 10;
    domino.name = "도미노";
    double dominoArea = domino.getArea();
    System.out.println(dominoArea);

    Circle pizzaHut = new Circle();
    pizzaHut.radius = 20;
    pizzaHut.name = "피자헛";
    double pizzaHutArea = pizzaHut.getArea();
  System.out.println(pizzaHut.name + "의 면적은" + pizzaHutArea);
    
  // Circle obj01 = new Circle(radius:1);
  // Circle obj02 = new Circle(radius:2);
  // Circle obj03;
  // obj03 = obj02;
  // obj01 = obj02;
  // System.out.printf("obj01의 반지름은 === %d %n", obj01.radius);
  // System.out.printf("obj02의 반지름은 === %d", obj02.radius);
  
  // Circle c01 = new Circle(radius:1);
  // Circle c02 = new Circle(radius:2);
  // Circle c03 = new Circle(radius:3);
  // Circle c04 = new Circle(radius:4);
  // Circle c05 = new Circle(radius:5);

  //int intArray[] = new int[5]
  Circle circles[] = new Circle[5];
  for(int i = 0; i < circles.length; i++){
    circles[i] = new Circle((i + 1) *10);
  }
  System.out.println(circles[0].radius);
  System.out.println(circles[1].radius);





  }
}
