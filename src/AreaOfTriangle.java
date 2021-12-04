import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfTriangle extends JFrame implements ActionListener{

    JLabel h;
    JLabel b;


    JTextField height;
    JTextField base;

    JLabel label;
    JButton Btn;
    public AreaOfTriangle(){
        setSize(250,300);
        setLayout(null);
        setLocation(50,50);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        h = new JLabel("Height");
        h.setBounds(0,50,50,20);
        h.setForeground(Color.RED);
        add(h);

        b = new JLabel("Base");
        b.setBounds(0,70,50,20);
        b.setForeground(Color.BLUE);
        add(b);


        height = new JTextField();
        height.setBounds(50,50,100,20);
        add(height);

        base = new JTextField();
        base.setBounds(50,70,100,20);
        add(base);



        label = new JLabel("Result");
        label.setForeground(Color.RED);
        label.setBounds(70,130,90,20);
        add(label);

        Btn = new JButton("Area of triangle");
        Btn.setBounds(40,160,130,30);
        add(Btn);
        Btn.addActionListener(this);


    }
    public static void main(String[] args) {
        new AreaOfTriangle().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int h = Integer.parseInt(height.getText());
        int b = Integer.parseInt(base.getText());
        int A = 0;


        if (e.getSource().equals(Btn)){
            A = (h*b)/2;
            label.setText(String.valueOf(A));
        } else{
            System.out.println("Error");
        }

    }
}
