import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


// ActionListener는 interface이므로 추상메서드를 구현해야한다.
class MyActionListener implements ActionListener{

  @Override
  public void actionPerformed(ActionEvent e) {
    // 여기에 내맘대로 코드 구현.....
    JButton btn = (JButton)e.getSource();
    btn.setText("I AM BUTTON");
  }

}

public class IndependentClassListener extends JFrame{
  IndependentClassListener(){
    setTitle("Event Listener Test");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane =  getContentPane();
    contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
    JButton btn = new JButton("나는 버튼");
    contentPane.add(btn);
    btn.addActionListener((new MyActionListener()));

    setSize(300, 300);
    setVisible(true);
    }

    public static void main(String[] args) {
      new IndependentClassListener();
    }
  
}
