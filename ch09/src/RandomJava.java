import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;



public class RandomJava extends JFrame{
  RandomJava(){
    setTitle("Null Layout");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    Container contentPane = this.getContentPane();
    contentPane.setLayout(null); // null을 넣으면 자유로운 배치가 가능하다.

    JLabel label = new JLabel("Hello JAVA");
      label.setLocation(300, 300);
      label.setSize(100, 40);
      contentPane.add(label);


      setSize(500,500);
      setVisible(true);
  }

  public static void main(String[] args) {
    new RandomJava();
  }
}
