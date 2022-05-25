package Swing;

import javax.swing.*;
import java.awt.*;

public class SignUp extends JFrame  {
    JLabel head,l1,l2,l3,l4,l5,l31,l32;
    JTextField l1t,l2t,l4t,l5t;
    JMenu m1;
    JMenuItem m2,m3;
    JRadioButton cb1,cb2;
    JButton b1,b2;

    SignUp(){
        setTitle("Student Sign Up");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,20,1000,600);
        setResizable(false);
        setLayout(null);


        head = new JLabel("Sign Up For Student");
        head.setBounds(450,0,300,35);
        head.setFont(new Font("times",Font.BOLD,25));
        add(head);

        l1 = new JLabel("Name of Student:");
        l1.setBounds(250,50,200,35);
        l1.setFont(new Font("times",Font.PLAIN,20));
        add(l1);

        l1t = new JTextField();
        l1t.setBounds(500,50,300,30);
        add(l1t);


        l2 = new JLabel("Email:");
        l2.setBounds(250,100,100,35);
        l2.setFont(new Font("times",Font.PLAIN,20));
        add(l2);

        l2t = new JTextField();
        l2t.setBounds(500,100,300,30);
        add(l2t);


        l4 = new JLabel("Password");
        l4.setBounds(250,150,150,35);
        l4.setFont(new Font("times",Font.PLAIN,20));
        add(l4);

        l4t = new JTextField();
        l4t.setBounds(500,150,300,30);
        add(l4t);



        l3 = new JLabel("Gender:");
        l3.setBounds(250,200,100,35);
        l3.setFont(new Font("times",Font.PLAIN,20));
        add(l3);
        l31 = new JLabel("Male");
        l31.setBounds(520,200,200,40);
        add(l31);

        cb1 = new JRadioButton();
        cb1.setBounds(500,200,20,40);

        l32 = new JLabel("Female");
        l32.setBounds(580,200,200,40);
        add(l32);
        cb2 = new JRadioButton();
        cb2.setBounds(560,200,20,40);

        ButtonGroup bg = new ButtonGroup();
        bg.add(cb1);
        bg.add(cb2);
        add(cb1);add(cb2);



        l4 = new JLabel("Phone Number:");
        l4.setBounds(250,250,150,30);
        l4.setFont(new Font("times",Font.PLAIN,20));
        add(l4);

        l4t = new JTextField();
        l4t.setBounds(500,250,300,30);
        add(l4t);


        l5 = new JLabel("Address");
        l5.setBounds(250,300,100,35);
        l5.setFont(new Font("times",Font.PLAIN,20));
        add(l5);

        l5t = new JTextField();
        l5t.setBounds(500,300,300,30);
        add(l5t);

        l5 = new JLabel("Batch:");
        l5.setBounds(250,350,100,35);
        l5.setFont(new Font("times",Font.PLAIN,20));
        add(l5);

        m1 = new JMenu("24A");
        m2=new JMenuItem("31A");
        m3=new JMenuItem("31B");
        m1.add(m2); m1.add(m3);
        m1.setBounds(500,350,100,35);
        add(m1);



        b1= new JButton("SignUP");
        b1.setBounds(280,400,200,40);
        b1.setBackground(Color.ORANGE);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("times",Font.BOLD,30));
        add(b1);

        b2= new JButton("Back to login");
        b2.setBounds(500,400,200,40);
        b2.setBackground(Color.green);
        b2.setForeground(Color.blue);
        b2.setFont(new Font("times",Font.BOLD,20));
        add(b2);



            }

    public static void main(String[] args) {
        SignUp sg = new SignUp();
        new SignUp().setVisible(true);
    }
}