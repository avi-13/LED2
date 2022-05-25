package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeOfCuboid extends JFrame implements ActionListener {

    JLabel pr, ti, rt, lbl;
    JButton sibt;
    JTextField prtf, titf, rttf;


    VolumeOfCuboid() {


        setTitle("VolumeOfCuboid");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 0, 800, 800);
        setResizable(false);
        setLayout(null);


        pr = new JLabel("Enter the length of the cuboid: ");
        pr.setBounds(50, 10, 150, 30);
        add(pr);

        prtf = new JTextField();
        prtf.setBounds(180, 10, 30, 30);
        add(prtf);


        ti = new JLabel("Enter the height of the cuboid:");
        ti.setBounds(50, 80, 150, 30);
        add(ti);

        titf = new JTextField();
        titf.setBounds(180, 80, 30, 30);
        add(titf);


        rt = new JLabel("Enter the breadth of the cuboid:");
        rt.setBounds(50, 130, 150, 30);
        add(rt);

        rttf = new JTextField();
        rttf.setBounds(180, 130, 30, 30);
        add(rttf);

        sibt = new JButton("Simple Interest");
        sibt.setBounds(100, 200, 100, 30);
        add(sibt);

        sibt.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

        lbl = new JLabel("Result :");
        lbl.setBounds(100, 300, 150, 30);
        add(lbl);

    }

    public void actionPerformed(ActionEvent e) {

        float p = Integer.parseInt(prtf.getText());
        float t = Integer.parseInt(titf.getText());
        float r = Integer.parseInt(rttf.getText());

        if (e.getSource().equals(sibt)) {
            double si = (p * t * r);
            lbl.setText(String.valueOf(si));
        }
    }

    public static void main(String args[]) {
        VolumeOfCuboid v = new VolumeOfCuboid();
    }
}