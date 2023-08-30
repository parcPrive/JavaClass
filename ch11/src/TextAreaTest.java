import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class TextAreaTest extends JFrame{
  private JTextField tf = new JTextField(20); // 한줄입력
  private JTextArea ta = new JTextArea(10, 20);
  TextAreaTest(){
    this.setTitle("text test");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.add(tf);
    contentPane.add(new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
    // contentPane.add(ta);
    tf.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
       JTextField t = (JTextField) e.getSource();
       System.out.println(t.getText());
       ta.append(t.getText() + "\n");
       t.setText("");
      }
      
    });




    this.setSize(300, 300);
    this.setVisible(true
    );

  }
  


  public static void main(String[] args) {
    new TextAreaTest();
  }
}