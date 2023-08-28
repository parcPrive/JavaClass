import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class DreamCar extends JFrame{
  private int num = 2;

  DreamCar(){
    String carImgList[] = {
      "car01.png",
      "car02.png",
      "car03.png",
      "car04.png",
      "car05.png",
      "car06.png",
      "car07.png",
      "car08.png",
      "car09.png",
      "car10.png",
      "car11.png",
      "car12.png",
      "car13.png",
      "car14.png",
      "car15.png",
      "car16.png",
};

    String carTitleList[] = {
      "벤츠",
      "람보르기니",
      "마세라티",
      "페라리",
      "포르쉐",
      "벤틀리",
      "테슬라",
      "아우디",
      "BMW",
      "제네시스",
      "랜드로버",
      "렉서스",
      "볼보",
      "기아",
      "현대",
      "쉐보레",
    };



    this.setTitle("dream car");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    JLabel titleLabel = new JLabel("당신이 꿈꾸는 드림카");
    titleLabel.setHorizontalAlignment((JLabel.CENTER));
    contentPane.setLayout(new BorderLayout());
    titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 24));
    contentPane.add(titleLabel, BorderLayout.NORTH);

    JPanel leftPanel = new JPanel(new BorderLayout());
    JPanel mainPanel = new JPanel();
    JLabel leftImgLabel = new JLabel(new ImageIcon("images/car/car01.png"));
    JLabel leftTextLabel=new JLabel("람보르기니");

    leftPanel.add(leftImgLabel, BorderLayout.NORTH);
    leftPanel.add(leftTextLabel, BorderLayout.SOUTH);
    



    JPanel rightPanel = new JPanel(new BorderLayout());
    JLabel rightImgLabel = new JLabel(new ImageIcon("images/car/car02.png"));
    JLabel rightTextLabel=new JLabel("페라리");

    rightPanel.add(rightImgLabel, BorderLayout.NORTH);
    rightPanel.add(rightTextLabel, BorderLayout.SOUTH);
    
    leftPanel.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        rightImgLabel.setIcon(new ImageIcon("images/car/"+ carImgList[num]));
        rightTextLabel.setText(carTitleList[num]);
        num++;
        if(num >= 16){
          rightImgLabel.setVisible(false);
          titleLabel.setText("당신의 드림카는 " + leftTextLabel.getText());
          leftImgLabel.removeMouseListener(this);
        }
      }
      
      
    });

      rightPanel.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        leftImgLabel.setIcon(new ImageIcon("images/car/"+ carImgList[num]));
        leftTextLabel.setText(carTitleList[num]);
        num++;
        if(num >= 16){
          leftImgLabel.setVisible(false);
          titleLabel.setText("당신의 드림카는 " + rightTextLabel.getText());
          rightImgLabel.removeMouseListener(this);
        }
      }
      
      
    });

    mainPanel.add(leftPanel);
    mainPanel.add(rightPanel);
    contentPane.add(mainPanel, BorderLayout.CENTER);

    this.setSize(800,600);
    this.setVisible(true);
    
  }
  public static void main(String[] args) {
    new DreamCar();
  }
  
}
