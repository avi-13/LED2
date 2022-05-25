package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Marks extends JFrame implements ActionListener {


    JLabel ls1, ls2, ls3, ls4,ls5,lbl;
    JButton perbt;
    JTextField ls1t,ls2t,ls3t,ls4t,ls5t;


    Marks() {

        setTitle("Percentage");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 200, 1000, 2000);
        setResizable(false);
        setLayout(null);


        ls1 = new JLabel("Enter the marks of science: ");
        ls1.setBounds(150, 30, 200, 30);
        add(ls1);

        ls1t = new JTextField();
        ls1t.setBounds(350, 30, 50, 30);
        add(ls1t);


        ls2 = new JLabel("Enter the marks of Maths:");
        ls2.setBounds(150, 80, 200, 30);
        add(ls2);

        ls2t = new JTextField();
        ls2t.setBounds(350, 80, 50, 30);
        add(ls2t);


        ls3 = new JLabel("Enter the marks of Computer:");
        ls3.setBounds(150, 130, 200, 30);
        add(ls3);

        ls3t = new JTextField();
        ls3t.setBounds(350, 130, 50, 30);
        add(ls3t);


        ls4 = new JLabel("Enter the marks of Programming:");
        ls4.setBounds(150, 180, 200, 30);
        add(ls4);

        ls4t = new JTextField();
        ls4t.setBounds(350, 180, 50, 30);
        add(ls4t);



        ls5 = new JLabel("Enter the marks of English:");
        ls5.setBounds(150, 230, 200, 30);
        add(ls5);

        ls5t = new JTextField();
        ls5t.setBounds(350, 230, 50, 30);
        add(ls5t);

        perbt = new JButton("Percentage");
        perbt.setBounds(100, 300, 100, 30);
        add(perbt);

        perbt.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

        lbl = new JLabel("");
        lbl.setBounds(300, 300, 200, 30);
        add(lbl);

    }

    public void actionPerformed(ActionEvent e) {

        float a = Integer.parseInt(ls1t.getText());
        float b = Integer.parseInt(ls2t.getText());
        float c = Integer.parseInt(ls3t.getText());
        float d = Integer.parseInt(ls4t.getText());
        float f = Integer.parseInt(ls5t.getText());

        if (e.getSource().equals(perbt)) {
            float si = a+b+c+d+f;

            double pert = (si/500)*100;
            lbl.setText(String.valueOf("Your Total Percenrage is:"+pert+"%"));
        }
    }

    public static void main(String args[]) {
        Marks m = new Marks();
    }
}
