import java.awt.*;
import javax.swing.*;
public class Calculator {
  public static void main(String[]args) {
    //make buttons
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
    
    //make main panel with layout
    JPanel background = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    //make panel for viewing screen
    JPanel screen = new JPanel();
    
    //make panel for buttons
    JPanel buttons = new JPanel();
    
    //add buttons
    background.add(screen);
    background.add(buttons);
    buttons.add(one);
    buttons.add(two);
    buttons.add(three);
    buttons.add(four);
    buttons.add(five);
    buttons.add(six);
    buttons.add(seven);
    buttons.add(eight);
    buttons.add(nine);
    buttons.add(zero);
    buttons.add(decimal);
    buttons.add(sign); 
    buttons.add(plus);
    buttons.add(minus);
    buttons.add(multiplication);
    buttons.add(division);
    buttons.add(equalSign);
    buttons.add(leftParentheses);
    buttons.add(rightParentheses);
    buttons.add(erase);
    
    //make JFrame for display
    JFrame mainScreen = new JFrame();
    mainScreen.setTitle("Calculator");
    mainScreen.add(background);
    mainScreen.setSize(300, 500);
    mainScreen.setLocation(150, 100);
    mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainScreen.setVisible(true);
  }
}
