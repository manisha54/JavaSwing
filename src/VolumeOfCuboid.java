import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeOfCuboid extends JFrame implements ActionListener{

    JLabel l;
    JLabel b;
    JLabel h;

    JTextField length;
    JTextField breadth;
    JTextField height;
    JLabel label;
    JButton Btn;
    public VolumeOfCuboid(){
        setSize(250,300);
        setLayout(null);
        setLocation(50,50);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        l = new JLabel("Length");
        l.setBounds(0,50,50,20);
        add(l);

        b = new JLabel("breadth");
        b.setBounds(0,70,50,20);
        add(b);
        h = new JLabel("Height");
        h.setBounds(0,90,50,20);
        add(h);

        length = new JTextField();
        length.setBounds(50,50,100,20);
        add(length);

        breadth = new JTextField();
        breadth.setBounds(50,70,100,20);
        add(breadth);

        height = new JTextField();
        height.setBounds(50,90,100,20);
        add(height);

        label = new JLabel("Volume of cuboid");
        label.setForeground(Color.RED);
        label.setBounds(70,130,120,20);
        add(label);

        Btn = new JButton("V");
        Btn.setBounds(70,160,50,30);
        add(Btn);
        Btn.addActionListener(this);


    }
    public static void main(String[] args) {
        new VolumeOfCuboid().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int l = Integer.parseInt(length.getText());
        int b = Integer.parseInt(breadth.getText());
        int h = Integer.parseInt(height.getText());
        int V=0;

        if (e.getSource().equals(Btn)){
            V = l*b*h;
            label.setText(String.valueOf(V));
        } else{
            System.out.println("Error");
        }

    }
}
