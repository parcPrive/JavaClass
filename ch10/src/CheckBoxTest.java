import java.awt.Checkbox;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxTest extends JFrame{
  CheckBoxTest(){
     this.setTitle("checkbox test");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    ImageIcon iconApple = new ImageIcon("images/apple.png");
    JCheckBox appleCheck = new JCheckBox("사과", iconApple);
    appleCheck.setBorderPainted(true);


    contentPane.add(appleCheck);
    // contentPane.add(iconApple);

    appleCheck.addItemListener(new ItemListener() {

      @Override
      public void itemStateChanged(ItemEvent e) {
       //System.out.println(e.getStateChange());
       if(e.getStateChange() == ItemEvent.SELECTED){
        System.out.println("선택되었다.");
       }else{
        System.out.println("선택취소");
       }
      }
      
    });
  
     this.setSize(300,300);
     this.setVisible(true);
    }
  public static void main(String[] args) {
    new CheckBoxTest();
  }
  
}
