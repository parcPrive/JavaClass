import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullLayout extends JFrame {
  NullLayout(){
    setTitle("Null Layout");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(null); // null을 넣으면 자유로운 배치가 가능하다.

    JLabel label = new JLabel("Hello JAVA");
    label.setLocation(100, 100);
    label.setSize(100, 40);
    contentPane.add(label);

    //JButton 9개를만들어서 3x3으로 배치하기......
    JButton btn01= new JButton("btn01");
    btn01.setLocation(200, 200);
    btn01.setSize(100,30);
    

    setSize(500,500);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new NullLayout();
  }
}
