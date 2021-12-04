import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfCircle extends JFrame implements ActionListener{

    JLabel r;



    JTextField radius;

    JLabel label;
    JButton Btn;
    public AreaOfCircle(){
        setSize(250,300);
        setLayout(null);
        setLocation(50,50);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        r = new JLabel("radius");
        r.setBounds(10,50,50,20);
        r.setForeground(Color.RED);
        add(r);

        radius = new JTextField();
        radius.setBounds(70,50,100,20);
        add(radius);


        label = new JLabel("Result");
        label.setForeground(Color.RED);
        label.setBounds(70,130,90,20);
        add(label);

        Btn = new JButton("Area of Circle");
        Btn.setBounds(40,160,140,30);
        add(Btn);
        Btn.addActionListener(this);


    }
    public static void main(String[] args) {
        new AreaOfCircle().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int r = Integer.parseInt(radius.getText());
        int A = 0;

        if (e.getSource().equals(Btn)){
            A = 22/7*r*r;
            label.setText(String.valueOf(A));
        } else{
            System.out.println("Error");
        }

    }
}
