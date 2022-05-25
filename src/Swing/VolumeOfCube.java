package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class VolumeOfCube extends JFrame implements ActionListener {

        JLabel pr,lbl;
        JButton sibt;
        JTextField prtf;


        VolumeOfCube() {

            setTitle("SimpleInterest");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setBounds(200, 0, 800, 800);
            setResizable(false);
            setLayout(null);


            pr = new JLabel("Enter the length of the cube: ");
            pr.setBounds(50, 10, 150, 30);
            add(pr);

            prtf = new JTextField();
            prtf.setBounds(180, 10, 30, 30);
            add(prtf);



            sibt = new JButton("Volumeofcube");
            sibt.setBounds(100, 200, 100, 30);
            add(sibt);

            sibt.addActionListener(this);

            setLayout(null);
            setSize(600, 400);
            setVisible(true);

            lbl= new JLabel("Result :");
            lbl.setBounds(100, 300, 150, 30);
            add(lbl);

        }

        public void actionPerformed(ActionEvent e) {

            float p = Integer.parseInt(prtf.getText());

            if (e.getSource().equals(sibt)) {
                double si = (p*p*p);
                lbl.setText(String.valueOf(si));
            }
        }

        public static void main(String args[]) {
            VolumeOfCube voc = new VolumeOfCube();
        }
    }
