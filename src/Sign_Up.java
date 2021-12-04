import javax.swing.*;
import java.awt.*;

public class Sign_Up extends JFrame{
    JLabel labelFirstName;
    JLabel labelLastName;
    JLabel labelpassword;
    JLabel labelemail;
    JButton Btn;
    JTextField FirstName;
    JTextField LastName;
    JPasswordField password;
    JTextField email;
    public Sign_Up(){
        setTitle("Sign Page");
        setSize(700,550);
        setLocation(100,100);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //for loginpage
        labelFirstName = new JLabel("First Name");
        labelFirstName.setForeground(Color.GREEN);
        labelFirstName.setFont(new Font("Arial", Font.BOLD,20));
        labelFirstName.setBounds(50,50,200,20);
        add(labelFirstName);

        labelLastName = new JLabel("Last Name");
        labelLastName.setForeground(Color.GREEN);
        labelLastName.setFont(new Font("Arial", Font.BOLD,20));
        labelLastName.setBounds(50,80,200,20);
        add(labelLastName);

        labelpassword = new JLabel("Password");
        labelpassword.setForeground(Color.GREEN);
        labelpassword.setFont(new Font("Arial", Font.BOLD,20));
        labelpassword.setBounds(50,110,200,20);
        add(labelpassword);

        labelemail = new JLabel("Email address");
        labelemail.setBounds(50,140,250,20);
        labelemail.setForeground(Color.GREEN);
        labelemail.setFont(new Font("Arial",Font.BOLD,20));
        add(labelemail);


        FirstName = new JTextField();
        FirstName.setBounds(180,50,120,20);
        add(FirstName);
        LastName = new JTextField();
        LastName.setBounds(180,80,120,20);
        add(LastName);
        password = new JPasswordField();
        password.setBounds(180,110,120,20);
        add(password);
        email= new JTextField();
        email.setBounds(180,150,120,20);
        add(email);

        Btn = new JButton("SIGN UP" );
        Btn.setBounds(160,300,150,30);
        add(Btn);



    }

    public static void main(String[] args) {
        new Sign_Up().setVisible(true);
    }



}
