import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class lunch extends JFrame{
  private int num = 2;

  lunch(){
    HashMap<Integer, String> lunchImgList = new HashMap<>();
    for(int i = 0; i < 16; i++){
      lunchImgList.put(i,"aa"+ i+".jpeg");
    }
    System.out.println(lunchImgList.get(2
    ));
    // String lunchImgList[] = {
    //   "aa1.jpeg",
    //   "aa2.jpeg",
    //   "aa3.jpeg",
    //   "aa4.jpeg",
    //   "aa5.jpeg",
    //   "aa6.jpeg",
    //   "aa7.jpeg",
    //   "aa8.jpeg",
    //   "aa9.jpeg",
    //   "aa10.jpeg",
    //   "aa11.jpeg",
    //   "aa12.jpeg",
    //   "aa13.jpeg",
    //   "aa14.jpeg",
    //   "aa15.jpeg",
    //   "aa16.jpeg",
    // };

    String lunchTitleList[] ={
      "떡볶이",
      "족발",
      "치킨",
      "피자",
      "짜장면",
      "돼지국밥",
      "햄버거",
      "솥밥",
      "순두부찌개",
      "파스타",
      "김밥",
      "돈가스",
      "초밥",
      "잔치국수",
      "콩국수",
      "샌드위치"
    };

    this.setTitle("점메추");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = this.getContentPane();
    JLabel titleLabel = new JLabel("너가 뽑은 점심");
    titleLabel.setHorizontalAlignment((JLabel.CENTER));
    contentPane.setLayout(new BorderLayout());
    titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 24));
    contentPane.add(titleLabel, BorderLayout.NORTH);

    JPanel leftPanel = new JPanel(new BorderLayout());
    JPanel mainPanel = new JPanel();
    JLabel leftImgLabel = new JLabel(new ImageIcon("images/lunch/aa1.jpeg"));
    JLabel leftTextLabel=new JLabel("떡볶이");

    leftPanel.add(leftImgLabel, BorderLayout.NORTH);
    leftPanel.add(leftTextLabel, BorderLayout.SOUTH);

    JPanel rightPanel = new JPanel(new BorderLayout());
    JLabel rightImgLabel = new JLabel(new ImageIcon("images/lunch/aa2.jpeg"));
    JLabel rightTextLabel=new JLabel("족발");

    rightPanel.add(rightImgLabel, BorderLayout.NORTH);
    rightPanel.add(rightTextLabel, BorderLayout.SOUTH);

    leftPanel.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        rightImgLabel.setIcon(new ImageIcon("images/lunch/"+ lunchImgList.get(num)));
        rightTextLabel.setText(lunchTitleList[num]);
        num++;
        if(num >= 16){
          rightImgLabel.setVisible(false);
          titleLabel.setText("나의 점심은 " + leftTextLabel.getText());
          leftImgLabel.removeMouseListener(this);
        }
      }
    });

    rightPanel.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        leftImgLabel.setIcon(new ImageIcon("images/lunch/"+ lunchImgList.get(num)));
        leftTextLabel.setText(lunchTitleList[num]);
        num++;
        if(num >= 16){
          leftImgLabel.setVisible(false);
          titleLabel.setText("나의 점심은 " + rightTextLabel.getText());
          rightImgLabel.removeMouseListener(this);
        }
      }
    });

    mainPanel.add(leftPanel);
    mainPanel.add(rightPanel);
    contentPane.add(mainPanel, BorderLayout.CENTER);

    this.setSize(1200, 600);
    this.setVisible(true);




  }
  public static void main(String[] args) {
    
    new lunch();
  }

  
}
