import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MyFrame extends JFrame{
  public MyFrame(){
    setTitle("300 x 300으로 만든 프레임");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container contentPane = this.getContentPane();

    contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,30));

    contentPane.add(new JButton("OK"));
    contentPane.add(new JButton("Cancel"));
    
    setSize(300,300);
    setVisible(true);
    
  }

  public static void main(String[] args) {
    MyFrame myFrame = new MyFrame();
    
  }

}