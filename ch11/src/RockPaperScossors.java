import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class RockPaperScossors extends JFrame{
  private JPanel itemPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
  private JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
  private ImageIcon iconList[] = {
    new ImageIcon(),
    new ImageIcon(),
    new ImageIcon(),
  };
  private JLabel itemList[] = new JLabel[3];
  private JLabel meLabel = new JLabel("Me");
  private JLabel computerLabel = new JLabel("Computer");
  private JLabel resultLabel = new JLabel("");

  RockPaperScossors(){
    this.setTitle("text test");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    contentPane.setLayout(new BorderLayout());
    contentPane.add(itemPanel, BorderLayout.NORTH);
    contentPane.add(resultPanel, BorderLayout.SOUTH);
    resultPanel.add(meLabel);
    resultPanel.add(computerLabel);


    for(int i = 0; i < 3; i++){
      Image originalImg = iconList[i].getImage();
      Image resizeImg = originalImg.getScaledInstance(10, 10, Image.SCALE_SMOOTH);

      itemList[i] = new JLabel(iconList[i]);
      itemList[i].setIcon(new ImageIcon(resizeImg));
      itemPanel.add(itemList[i]);
      int meSelect = i;
      itemList[i].addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
          Random random = new Random();
          int computerSelect = random.nextInt(3);
          Image originalImg = iconList[computerSelect].getImage();
          Image resizeImg = originalImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
          computerLabel.setIcon(new ImageIcon(resizeImg));
          Image meOriginalImg = iconList[computerSelect].getImage();
          Image meResizeImg = originalImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
          meLabel.setIcon(new ImageIcon(resizeImg));
          System.out.println(computerSelect);
          if(computerSelect == meSelect){
            resultLabel.setText("draw");
          }else if((meSelect == 0 && computerSelect == 1) || (meSelect == 1 && computerSelect == 2) || (meSelect == 2 && computerSelect == 0)){
            resultLabel.setText("lose");
          }else{
            resultLabel.setText("win");
          }
         }
        
      });
    }



  
    this.setSize(300, 300);
    this.setVisible(true);

  }

  public static void main(String[] args) {
    new RockPaperScossors();
  }
  
}
