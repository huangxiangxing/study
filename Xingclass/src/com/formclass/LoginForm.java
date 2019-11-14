package com.formclass;

import com.formclass.MainForm.MainForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelLogin;
    private JLabel userlable;
    private JLabel passwordlable;
    private JTextField usertext;
    private JTextField passwordtext;
    private JButton loginButton;
    private JButton registerButton;

    public LoginForm(){
        final String COMMAND_LOGIN = "LOGIN";
        final String COMMAND_ENROLL = "ENROLL";
        setTitle("Login Form");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);

        userlable = new JLabel("user:");
        userlable.setBounds(10,20,80,25);
        panelLogin.add(userlable);

        passwordlable = new JLabel("password:");
        passwordlable.setBounds(10,50,80,25);
        panelLogin.add(passwordlable);

        usertext = new JTextField(20);
        usertext.setBounds(100,20,165,25);
        panelLogin.add(usertext);

        passwordtext = new JTextField(20);
        passwordtext.setBounds(100,50,165,25);
        panelLogin.add(passwordtext);

        loginButton = new JButton("login");
        loginButton.setBounds(20, 80, 80, 25);
        loginButton.setActionCommand(COMMAND_LOGIN);
        panelLogin.add(loginButton);

        registerButton = new JButton("register");
        registerButton.setBounds(200, 80, 80, 25);
        panelLogin.add(registerButton);
        registerButton.setActionCommand(COMMAND_ENROLL);

        add(panelLogin);

       ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                if(COMMAND_LOGIN.equals(command)){
                    MainForm mainForm = new MainForm();
                    mainForm.setFrameMainVisible(true);
                    dispose();
                }
                if(COMMAND_ENROLL.equals(command)){
                    ResisterForm resisterForm = new ResisterForm();
                    resisterForm.setFrameRegisterVisible(true);
                    dispose();
                }
            }
        };
        loginButton.addActionListener(actionListener);
        registerButton.addActionListener(actionListener);
    }
    public void setFrameLoginVisible(Boolean visible){
        setVisible(visible);
    }
}
