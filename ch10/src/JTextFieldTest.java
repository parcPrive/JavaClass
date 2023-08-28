import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldTest extends JFrame{
  JTextFieldTest(){
    
    setTitle("checkobox test");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new FlowLayout());

    JLabel label01 = new JLabel("ID");
    JLabel label02 = new JLabel("PW");
    JTextField txt01 = new JTextField(20);
    JPasswordField txt02 = new JPasswordField(20);

    JButton btn = new JButton("로그인");

    contentPane.add(label01);
    contentPane.add(txt01);
    contentPane.add(label02);
    contentPane.add(txt02);
    contentPane.add(btn);

    btn.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        String pw = new String(txt02.getPassword());
        String pw1 = String.valueOf(txt02.getPassword());
        String pw2 = String.copyValueOf(txt02.getPassword());
        // System.out.println(txt01.getText().equals("mok119"));
        // System.out.println(pw1.equals("1234"));
        // System.out.println(pw2.equals("1234"));
        if(txt01.getText().equals("mok119") && pw.equals("1234")){
          // System.out.println("로그인성공!!!!");
          JOptionPane.showMessageDialog(null,"로그인되었습니다.");
        }else{
          JOptionPane.showMessageDialog(null,"로그인실패");
        }
      }
      
    });
    
    this.setSize(300, 300);
    this.setVisible(true);
  }



  public static void main(String[] args) {
    new JTextFieldTest();
  }
  
}
