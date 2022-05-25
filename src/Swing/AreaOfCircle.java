////        In Swing
////
////1. Area fo circle
////        2. Area of Triangle
////        3. SI
////        4. Marks of 5 subjects
////        6. Vol of Cube
////        7.Vol of cuboid
////        8. Area of Rectangle
////        9. Normal Registration
//
//
package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class AreaOfCircle extends JFrame implements ActionListener {

    JButton jb1;
    JTextField jt1;
    JLabel lbl;

    AreaOfCircle() {
        setTitle("Area Of Circle");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 200, 800, 800);
        setResizable(false);
        setLayout(null);


        lbl = new JLabel("Enter the radius: ");
        lbl.setBounds(150, 100, 150, 30);
        add(lbl);

        jt1 = new JTextField();
        jt1.setBounds(280, 100, 150, 30);
        add(jt1);



        lbl= new JLabel("");
        lbl.setBounds(200, 140, 300, 30);
        add(lbl);

        jb1 = new JButton("AreaOfCircle");
        jb1.setBounds(200, 200, 200, 30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        float radius = Integer.parseInt(jt1.getText());

        if (e.getSource().equals(jb1)) {
            double c = radius*radius*3.14;
            lbl.setText(String.valueOf("The Area Of Circle Is:"+c+"cm\u00b2"));
        }
    }

    public static void main(String args[]) {

        AreaOfCircle t = new AreaOfCircle();
    }
}