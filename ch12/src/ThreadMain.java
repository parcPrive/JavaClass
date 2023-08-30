public class ThreadMain {
  public static void main(String[] args) {
    // main 자체가 thread이다.
    // Thread.currentThread().setPriority(10); // 1~10사이의 값을 가질수있고 숫자가 클수록 우선순위이다.
    System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getPriority());
    System.out.println(Thread.currentThread().getState());
    System.out.println(Thread.currentThread().getId());


    Thread thread01 = new Thread(new Runnable() {

      @Override
      public void run() {
            int num = 0;
    while(true){
      num++;
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
      }
      
    });
        Thread thread02 = new Thread(new Runnable() {

      @Override
      public void run() {
            int num = 0;
    while(true){
      num++;
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
      }
      
    });
    thread01.start();
    thread02.start();
  }


}
