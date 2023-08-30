import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class ListTest extends JFrame{
  // private JTextField tf = new JTextField(20); // 한줄입력
  // private JTextArea ta = new JTextArea(10, 20);
  private String fruits[] = {"apple", "orange", "kiwi", "banana"};
  private Vector<String> vector = new Vector<>();


  ListTest(){
    this.setTitle("text test");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JList<String> strList = new JList<>(fruits);
    JList<String> vecList = new JList<>(vector);
    vector.add("bear");
    vector.add("tiger");
    vector.add("lion");
    vector.add("cat");
    
    contentPane.add(new JScrollPane(strList));
    contentPane.add(new JScrollPane(vecList));
    strList.setVisibleRowCount(3); // 3개씩 보여준다.
    vector.add("dog");
    // vecList.setLi
    
    
    strList.setFixedCellWidth(150);
    this.setSize(300, 300);
    this.setVisible(true
    );

  }
  
  public static void main(String[] args) {
    new ListTest();
  }
}
