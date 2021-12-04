import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI extends JFrame implements ActionListener{

    JLabel w;
    JLabel h;


    JTextField weight;
    JTextField height;

    JLabel label;
    JButton Btn;
    public BMI(){
        setSize(250,300);
        setLayout(null);
        setLocation(50,50);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        w = new JLabel("Weight");
        w.setBounds(0,50,50,20);
        w.setForeground(Color.BLUE);
        add(w);

        h = new JLabel("Height");
        h.setBounds(0,70,50,20);
        h.setForeground(Color.RED);
        add(h);

        weight = new JTextField();
        weight.setBounds(50,50,100,20);
        add(weight);

        height = new JTextField();
        height.setBounds(50,70,100,20);
        add(height);

        label = new JLabel("Result");
        label.setForeground(Color.RED);
        label.setBounds(70,130,90,20);
        add(label);

        Btn = new JButton("BMI");
        Btn.setBounds(70,160,100,30);
        add(Btn);
        Btn.addActionListener(this);


    }
    public static void main(String[] args) {
        new BMI().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int w = Integer.parseInt(weight.getText());
        int h = Integer.parseInt(height.getText());
        int BMI = 0;


        if (e.getSource().equals(Btn)){
            BMI = w/h;
            label.setText(String.valueOf(BMI));
        } else{
            System.out.println("Error");
        }

    }
}
