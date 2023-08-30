import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * PICart
 */
public class PICart extends JFrame{
  private String itemList[] = {"apple", "banana", "plum", "peach"};
  private JTextField tfList[] = new JTextField[4];
  private Color colorList[] = {Color.RED,Color.BLUE,Color.GREEN,Color.YELLOW};
  private int dataList[] = {150,80,100,100};
  private ChartPanel chartPanel = new ChartPanel();

  class TfActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
      // System.out.println("엔터 쳤음");
      JTextField textField = (JTextField) e.getSource();
      // System.out.println(textField.getText());
      int sum = 0; 
      for(int i = 0; i < 4; i++){
        dataList[i] = Integer.parseInt(textField.getText());
        sum += dataList[i];
      }
    }
    

  }

    class InputPanel extends JPanel{
      InputPanel(){
        this.setBackground(Color.LIGHT_GRAY);
        for(int i = 0; i < 4; i++){
          
         tfList[i] = new JTextField("0",10);
         tfList[i].addActionListener(new TfActionListener());
          this.add(new JLabel(itemList[i]));
          this.add(tfList[i]);
        }
      }
    }

    class ChartPanel extends JPanel{

      @Override
      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int startAngle = 0;
        int total = 0;
        for(int i = 0; i < 4; i++){
          total += dataList[i];
        }
        for(int i = 0; i < 4; i++){
          int angle =(int) Math.round(360 * ( (double)dataList[i] /  (double)total));
          g.setColor(colorList[i]);
          g.fillArc(200, 100, 200, 200, startAngle, angle);
          startAngle += angle;
          System.out.println(angle);
          System.out.println(startAngle);
        }
        // g.setColor(Color.RED);
        // g.fillArc(150, 200, 200, 200, 0, 90);
        // g.setColor(Color.BLUE);
        // g.fillArc(150, 200, 200, 200, 90, 90);
        // g.setColor(Color.GREEN);
        // g.fillArc(150, 200, 200, 200, 180, 90);
        // g.setColor(Color.YELLOW);
        // g.fillArc(150, 200, 200, 200,270, 90);
      }

    }

  PICart(){
    this.setTitle("그래픽");
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new BorderLayout());
    
    contentPane.add(new InputPanel(), BorderLayout.NORTH);
    
    contentPane.add(new ChartPanel(), BorderLayout.CENTER);

    this.setSize(600,500);
    this.setVisible(true);
  }

  


  public static void main(String[] args) {
    new PICart();
  }
}