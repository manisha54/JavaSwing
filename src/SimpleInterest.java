import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterest extends JFrame implements ActionListener{

    JLabel p;
    JLabel t;
    JLabel r;

    JTextField principle;
    JTextField time;
    JTextField rate;
    JLabel label;
    JButton Btn;
    public SimpleInterest(){
        setSize(250,300);
        setLayout(null);
        setLocation(50,50);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p = new JLabel("P");
        p.setBounds(40,50,30,20);
        add(p);

        t = new JLabel("T");
        t.setBounds(40,70,30,20);
        add(t);
        r = new JLabel("R");
        r.setBounds(40,90,30,20);
        add(r);

        principle = new JTextField();
        principle.setBounds(50,50,100,20);
        add(principle);

        time = new JTextField();
        time.setBounds(50,70,100,20);
        add(time);

        rate = new JTextField();
        rate.setBounds(50,90,100,20);
        add(rate);

        label = new JLabel("Simple Interest");
        label.setForeground(Color.RED);
        label.setBounds(70,130,90,20);
        add(label);

        Btn = new JButton("I");
        Btn.setBounds(70,160,50,30);
        add(Btn);
        Btn.addActionListener(this);


    }
    public static void main(String[] args) {
        new SimpleInterest().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(principle.getText());
        int b = Integer.parseInt(rate.getText());
        int c = Integer.parseInt(time.getText());
        int d=0;

        if (e.getSource().equals(Btn)){
            d = (a*b*c)/100;
            label.setText(String.valueOf(d));
        } else{
            System.out.println("Error");
        }

    }
}
