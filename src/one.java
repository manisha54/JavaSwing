import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class one extends JFrame{

    JButton btn1;
    JButton btn2;
    JButton btn3;

    public one(){
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
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(btn1))
                {
                    JOptionPane.showConfirmDialog(null,"Are you want to login??");
                    dispose();
                    new Login_Page().setVisible(true);
                }

            }
        });
        add(btn1);


        //Button for Sign_up  page
        btn2 = new JButton("REGISTER");
        btn2.setForeground(Color.GREEN);
        btn2.setBounds(100,90,190,30);
        btn2.setBackground(Color.CYAN);
        btn2.setFont(new Font("Arial", Font.BOLD,30));
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(btn2))
                {    //code for confirm dialog box
                    int response = JOptionPane.showConfirmDialog(null,"Do you want to register?","confirm", JOptionPane.YES_NO_CANCEL_OPTION);
                    if (response == JOptionPane.YES_OPTION){
                        System.out.println("yes.. option is selected..");
                    }else  if (response==JOptionPane.NO_OPTION){
                        System.out.println("No..option is selected..");
                    }else  if (response==JOptionPane.CANCEL_OPTION) {
                        System.out.println("Cancel..option is selected..");
                    }

                    dispose();
                    new Sign_Up().setVisible(true);
                }
            }
        });
        add(btn2);

        //Button for simple interest
        btn3 = new JButton("SIMPLE INTEREST");
        btn3.setForeground(Color.PINK);
        btn3.setBounds(20,130,310,30);
        btn3.setBackground(Color.red);
        btn3.setFont(new Font("Arial", Font.BOLD,30));
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(btn3))
                {
                    JOptionPane.showConfirmDialog(null,"Simple interest");
                    dispose();
                    new SimpleInterest().setVisible(true);

                }

            }
        });
        add(btn3);



    }

    public static void main(String[] args) {

        new one().setVisible(true);

    }
}
