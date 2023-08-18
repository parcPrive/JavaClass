package tv;

public class TV {
  private int size;

  public TV(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }

  public static void main(String[] args) {
    TV myTV = new TV(30);
    System.out.println(myTV.getSize());
  }


}

