import javax.swing.*;
public class Calculator {
  public static void main(String[]args) {
 
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton zero = new JButton("0");
    JButton decimal = new JButton(".");
    JButton sign = new JButton("+|-");
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton multiplication = new JButton("*");
    JButton division = new JButton("/");
    JButton equalSign = new JButton("=");
    JButton leftParentheses = new JButton ("(");
    JButton rightParentheses = new JButton (")");
    JButton erase = new JButton("clear");
    
    
    JPanel background = new JPanel();
    background.add(one);
    background.add(two);
    background.add(three);
    background.add(four);
    background.add(five);
    background.add(six);
    background.add(seven);
    background.add(eight);
    background.add(nine);
    background.add(zero);
    background.add(decimal);
    background.add(sign); 
    background.add(plus);
    background.add(minus);
    background.add(multiplication);
    background.add(division);
    background.add(equalSign);
    background.add(leftParentheses);
    background.add(rightParentheses);
    background.add(erase);
    
    JFrame mainScreen = new JFrame();
    mainScreen.setTitle("Calculator");
    mainScreen.add(background);
    mainScreen.setSize(300, 500);
    mainScreen.setLocation(150, 100);
    mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainScreen.setVisible(true);
  }
}
