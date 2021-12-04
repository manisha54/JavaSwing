import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add extends JFrame implements ActionListener{
    JTextField first;
    JTextField second;
    JButton Btn;
    JLabel lbl;
    public Add(){
        setSize(400,300);
        setLocation(50,50);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        first = new JTextField();
        first.setBounds(50,50,200,20);
        add(first);
        second = new JTextField();
        second.setBounds(50,80,200,20);
        add(second);

        lbl = new JLabel("Result");
        lbl.setForeground(Color.GREEN);
        lbl.setFont(new Font("Arial", Font.BOLD,20));
        lbl.setBounds(50,110,200,20);
        add(lbl);

        Btn = new JButton(" +" );
        Btn.setBounds(150,200,130,30);
        add(Btn);
        Btn.addActionListener(this);




    }
    public static void main(String[] args) {
        new Add().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(first.getText());
        int b = Integer.parseInt(second.getText());
        int c=0;

        if (e.getSource().equals(Btn)){
            c =a+b;
            lbl.setText(String.valueOf(c));
        } else{
            System.out.println("Error");
        }



    }
}
