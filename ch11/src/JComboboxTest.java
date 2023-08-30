import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboboxTest extends JFrame{
   
  private String fruits[] = {"apple", "orange", "kiwi", "banana"};
  private javax.swing.ImageIcon imageList[] = {
    new javax.swing.ImageIcon("images/apple.png"),
    new javax.swing.ImageIcon("images/apple.png"),
    new javax.swing.ImageIcon("images/apple.png"),
  };
  private JLabel imgLabel = new JLabel(imageList[0]);
  


  JComboboxTest(){
    this.setTitle("text test");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    JComboBox<String> strComboBox = new JComboBox<>(fruits);
    contentPane.add(strComboBox);
    contentPane.add(imgLabel);
    strComboBox.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("바꼈다.");
        System.out.println(strComboBox.getSelectedIndex()); // 내가 선택한 것의 인덱스 번호 알수있다.
        System.out.println(strComboBox.getSelectedItem()); // 내가 선택한 것이 무엇인지 알수있다.
        imgLabel.setIcon(imageList[strComboBox.getSelectedIndex()]);
      }
    });
    this.setSize(300, 300);
    this.setVisible(true
    );
  }
  
  public static void main(String[] args) {
    new JComboboxTest();
  }
  
}
