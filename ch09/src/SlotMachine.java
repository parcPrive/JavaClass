import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SlotMachine extends JFrame{
SlotMachine(){
  List<JLabel> labelList = new ArrayList<>();
  Random random = new Random();
  

  setTitle("슬롯머신");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = getContentPane();
    contentPane.setLayout(null);
    for(int i = 0; i < 3; i++){
      JLabel label = new JLabel();
      label.setOpaque(true);
      label.setBackground(Color.RED);
      label.setForeground(Color.YELLOW);
      label.setSize(80,80);
      label.setLocation(90 * i + 10, 100 );
      label.setText("0");
      label.setHorizontalAlignment(JLabel.CENTER);

      contentPane.add(label);
    }
    
    contentPane.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
          System.out.println("eeee");
          int ran01 = random.nextInt(5);
          labelList.get(0).setText(""+ran01);

          int ran02 = random.nextInt(5);
          labelList.get(1).setText(""+ran02);

          int ran03 = random.nextInt(5);
          labelList.get(2).setText(""+ran03);
          if(ran01 == ran02 && ran02 == ran03){
            System.out.println("당첨!!!!!!!!");
          }

        }
      }
    });
    
    setSize(300, 300);
    setVisible(true);
    contentPane.setFocusable(true);
    contentPane.requestFocus();

}

public static void main(String[] args) {
  new SlotMachine();
}

}


