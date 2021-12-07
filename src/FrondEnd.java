import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrondEnd extends JFrame implements ActionListener{

    JButton btn1;
    JButton btn2;
    JButton btn3;

    public FrondEnd(){
        setTitle("Sample");
        setLayout(null);
        setSize(400,300);
        setResizable(false);
        setLocation(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Button for login page
        btn1 = new JButton("login");
        btn1.setForeground(Color.RED);
        btn1.setBounds(100,40,150,30);
        btn1.setBackground(Color.ORANGE);
        btn1.setFont(new Font("Arial", Font.BOLD,30));
        add(btn1);
        btn1.addActionListener(this);


        //Button for Sign_up  page
        btn2 = new JButton("REGISTER");
        btn2.setForeground(Color.GREEN);
        btn2.setBounds(100,90,190,30);
        btn2.setBackground(Color.CYAN);
        btn2.setFont(new Font("Arial", Font.BOLD,30));
        add(btn2);
        btn2.addActionListener(this);

        //Button for simple interest
        btn3 = new JButton("SIMPLE INTEREST");
        btn3.setForeground(Color.PINK);
        btn3.setBounds(20,130,310,30);
        btn3.setBackground(Color.red);
        btn3.setFont(new Font("Arial", Font.BOLD,30));
        add(btn3);
        btn3.addActionListener(this);



    }

    public static void main(String[] args) {

        new FrondEnd().setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn1)) {
            JOptionPane.showConfirmDialog(null, "Are you want to login??");
            dispose();
            new Login_Page().setVisible(true);
        }
        if (e.getSource().equals(btn2)) {
            JOptionPane.showConfirmDialog(null, "Do you want to register??");
            dispose();
            new Sign_Up().setVisible(true);
        }
        if (e.getSource().equals(btn3)) {
            JOptionPane.showConfirmDialog(null, "Simple interest");
            dispose();
            new SimpleInterest().setVisible(true);
        }
    }
}
