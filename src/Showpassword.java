import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Showpassword extends JFrame {
    JLabel labelusername;
    JLabel labelpassword;
    JTextField user;
    JPasswordField pass;
    JButton Btn;
    JCheckBox showpassword;


    public Showpassword(){
        setTitle("Login Page");
        setSize(500,350);
        setLocation(400,200);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //for loginpage
        labelusername = new JLabel("User Name");
        labelusername.setForeground(Color.RED);
        labelusername.setFont(new Font("Arial", Font.BOLD,20));
        labelusername.setBounds(50,50,200,20);
        add(labelusername);

        labelpassword = new JLabel("Password");
        labelpassword.setForeground(Color.ORANGE);
        labelpassword.setFont(new Font("Arial", Font.BOLD,20));
        labelpassword.setBounds(50,100,200,20);
        add(labelpassword);

        user = new JTextField();
        user.setBounds(210,50,120,20);
        add(user);
        pass = new JPasswordField();
        pass.setBounds(210,100,120,20);
        add(pass);

        showpassword =new JCheckBox("Show Password");
        showpassword.setBounds(210,140,160,20);
        showpassword.setForeground(Color.GREEN);
        showpassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (showpassword.isSelected())
                {
                    pass.setEchoChar((char)0);
                }else {
                    pass.setEchoChar('*');
                }
            }
        });
        add(showpassword);

        Btn = new JButton("LOGIN" );
        Btn.setBounds(150,200,130,30);
        Btn.setForeground(Color.magenta);
        Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(Btn))
                {
                    String username = user.getText();
                    JOptionPane.showConfirmDialog(null,"Logged in as"+username);
                    dispose();
                    new HelloWorld().setVisible(true);


                }

            }
        });
        add(Btn);





    }

    public static void main(String[] args) {

        new Showpassword().setVisible(true);


    }
}
