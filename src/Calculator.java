import javax.swing.*;
public class Calculator {
  public static void main(String[]args) {
 
    
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    
    JPanel background = new JPanel();
    background.add(seven);
    background.add(eight);
    
    JFrame mainScreen = new JFrame();
    mainScreen.setTitle("Calculator");
    mainScreen.add(background);
    mainScreen.setSize(300, 500);
    mainScreen.setLocation(150, 100);
    mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainScreen.setVisible(true);
  }
}
