import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MoneyChanger extends JFrame{
  MoneyChanger(){
    setTitle("Money Change");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());
    contentPane.setBackground(new Color(150, 120, 80));

    JLabel totalWon = new JLabel("금액");
    totalWon.setSize(50, 30);
    totalWon.setLocation(100, 50);
  
    JTextField totalWonText = new JTextField(30);
    totalWonText.setBounds(150, 50, 150, 30);
    JButton btn = new JButton("계산");
    btn.setBounds(350, 50, 60, 30);

    JLabel oManWon = new JLabel("오만원");
    JTextField oManWonText = new JTextField(20);
    JLabel manWon = new JLabel("만원");
    JTextField manWonText = new JTextField(20);
    JLabel chunWon = new JLabel("천원");
    JTextField chunWonText = new JTextField(20);
    JLabel oBackWon = new JLabel("오백원");
    JTextField oBackWonText = new JTextField(20);
    JLabel backWon = new JLabel("백원");
    JTextField backWonText = new JTextField(20);
    JLabel oSipWon = new JLabel("오십원");
    JTextField oSipWonText = new JTextField(20);
    JLabel sipWon = new JLabel("십원");
    JTextField sipWonText = new JTextField(20);
    JLabel ilWon = new JLabel("일원");
    JTextField ilWonText = new JTextField(20);


    contentPane.add(totalWon);
    contentPane.add(totalWonText);
    contentPane.add(btn);
    contentPane.add(oManWonText);
    contentPane.add(oManWon);
    contentPane.add(manWonText);
    contentPane.add(manWon);
    contentPane.add(chunWonText);
    contentPane.add(chunWon);
    contentPane.add(oBackWonText);
    contentPane.add(oBackWon);
    contentPane.add(backWonText);
    contentPane.add(backWon);
    contentPane.add(sipWonText);
    contentPane.add(sipWon);
    contentPane.add(ilWonText);
    contentPane.add(ilWon);

    btn.addActionListener(new ActionListener() {
      int resume = 0;
      @Override
      public void actionPerformed(ActionEvent e) {
        int jan = Integer.parseInt(totalWonText.getText()) % 50000;
        resume = Integer.parseInt(totalWonText.getText()) / 50000;
        oManWonText.setText(Integer.toString(resume));

        resume = jan / 10000;
        jan = jan % 10000;
        manWonText.setText(Integer.toString(resume));

        resume = jan / 1000;
        jan = jan % 1000;
        chunWonText.setText(Integer.toString(resume));

        resume = jan / 500;
        jan = jan % 500;
        oBackWonText.setText(Integer.toString(resume));

        resume = jan / 100;
        jan = jan % 100;
        backWonText.setText(Integer.toString(resume));

        resume = jan / 50;
        jan = jan % 50;
        oSipWonText.setText(Integer.toString(resume));

        resume = jan / 10;
        jan = jan % 10;
        sipWonText.setText(Integer.toString(resume));

        resume = jan / 1;
        jan = jan % 1;
        ilWonText.setText(Integer.toString(resume));
        

        System.out.println(jan);
        System.out.println(resume);

      }
      
    });
    
    
    this.setSize(400, 400);
    this.setVisible(true);
    
  }
  public static void main(String[] args) {
    new MoneyChanger();
    
  }
  
}
