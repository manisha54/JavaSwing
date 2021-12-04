import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame{
    JLabel labelHello;
    JLabel labelManisha;
    public HelloWorld(){
        setTitle("Welcome");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,  150, 500,400);
        setResizable(false);
        setLayout(null);

        labelHello = new JLabel("Hello World");
        labelHello.setForeground(Color.CYAN);
        labelHello.setBackground(Color.BLACK);
        labelHello.setFont(new Font("Arial", Font.BOLD, 20));
        labelHello.setBounds(30,50,200,25);
        add(labelHello);

        labelManisha = new JLabel("Manisha");
        labelManisha.setForeground(Color.BLACK);
        labelManisha.setBounds(50,30,200,10);
        labelManisha.setBackground(Color.DARK_GRAY);
        add(labelManisha);

    }

    public static void main(String[] args) {

        new HelloWorld().setVisible(true);
    }
}
