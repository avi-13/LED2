package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfTriangle extends JFrame implements ActionListener {

    JLabel pr,ti,rt,lbl;
    JButton sibt;
    JTextField prtf,titf,rttf;


    AreaOfTriangle() {

        setTitle("SimpleInterest");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 200, 800, 800);
        setResizable(false);
        setLayout(null);


        pr = new JLabel("Enter the base of a triangle: ");
        pr.setBounds(170, 100, 200, 30);
        add(pr);

        prtf = new JTextField();
        prtf.setBounds(380, 100, 50, 30);
        add(prtf);



        ti= new JLabel("Enter the height of a triangle:");
        ti.setBounds(170, 140, 200, 30);
        add(ti);

        titf = new JTextField();
        titf.setBounds(380, 140, 50, 30);
        add(titf);



        sibt = new JButton("Area Of Triangle");
        sibt.setBounds(180, 290, 200, 30);
        add(sibt);

        sibt.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

        lbl= new JLabel("");
        lbl.setBounds(200, 230, 300, 30);
        add(lbl);

    }

    public void actionPerformed(ActionEvent e) {

        float l = Integer.parseInt(prtf.getText());
        float b = Integer.parseInt(titf.getText());


        if (e.getSource().equals(sibt)) {
            double ar =0.5*( l*b);
            lbl.setText(String.valueOf("The area of triangle is:"+ar+"cm\u00b2"));
        }
    }

    public static void main(String args[]) {

        AreaOfTriangle tr= new AreaOfTriangle();
    }
}

