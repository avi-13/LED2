package Swing;

import javax.swing.*;
import java.awt.*;

    public class Login extends JFrame {

        JLabel label,show,name,password,message;
        JTextField name1,password1;
        JCheckBox show1;
        JButton login,cancel;
        Login(){
            setLayout(null);
            setResizable(false);
            setBounds(400,100,600,600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setTitle("StudentLogin");


            //For the labels
            label=new JLabel("Welcome to Login Page");
            name=new JLabel("Username");
            password=new JLabel("Password");
            show=new JLabel("Show Password");
            message=new JLabel("Don't have an account?Click to create");
            label.setBounds(160,10,280,30);
            label.setFont(new Font("",Font.PLAIN,22));
            add(label);
            name.setBounds(160,80,200,20);
            name.setFont(new Font("",Font.PLAIN,15));
            add(name);
            password.setBounds(160,150,200,20);
            password.setFont(new Font("",Font.PLAIN,15));
            add(password);
            show.setFont(new Font("",Font.PLAIN,12));
            show.setBounds(190,220,100,10);
            add(show);
            message.setFont(new Font("",Font.PLAIN,13));
            message.setBounds(160,240,250,20);
            add(message);

            //For the text fields
            name1=new JTextField();
            password1=new JTextField();
            name1.setSize(230,25);
            name1.setLocation(160,110);
            password1.setSize(230,25);
            password1.setLocation(160,180);
            add(name1);
            add(password1);

            //For the checkbox
            show1=new JCheckBox();
            show1.setBounds(160,215,20,20);
            add(show1);

            //For the buttons
            login=new JButton("Login");
            cancel=new JButton("Cancel");
            login.setBackground(Color.CYAN);
            cancel.setBackground(Color.RED);
            login.setSize(90,30);
            cancel.setSize(90,30);
            login.setLocation(160,280);
            cancel.setLocation(270,280);
            add(login);
            add(cancel);
        }

        public static void main(String[] args) {

            new Login().setVisible(true);
            Login nn = new Login();
        }
    }
