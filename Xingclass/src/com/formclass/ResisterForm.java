package com.formclass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResisterForm extends JFrame{
    private JPanel panelRegister;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton backButton;
    private JButton registerButton;

    public JButton getBackButton() {
        return backButton;
    }

    public ResisterForm(){
        setTitle("Register Form");
        setSize(350, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelRegister = new JPanel();
        panelRegister.setLayout(null);

        userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panelRegister.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panelRegister.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panelRegister.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panelRegister.add(passwordText);

        backButton = new JButton("back");
        backButton.setBounds(200, 80, 80, 25);
        panelRegister.add(backButton);

        registerButton = new JButton("register");
        registerButton.setBounds(20, 80, 80, 25);
        panelRegister.add(registerButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginForm loginForm = new LoginForm();
                loginForm.setFrameLoginVisible(true);
                dispose();
            }
        });

        add(panelRegister);

    }

    public void setFrameRegisterVisible(Boolean visible){
        setVisible(visible);
    }
}
