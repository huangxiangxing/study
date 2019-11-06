package com.classbook;

import javax.swing.*;

public class LoginForm {
    public static void main(String[] args){
        JFrame frame = new JFrame("登录界面");
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JFrame ZhuCe = new JFrame("注册界面");
        ZhuCe.setSize(350,200);
        ZhuCe.setDefaultCloseOperation(ZhuCe.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JPanel zhuce = new JPanel();
        ZhuCe.add(zhuce);


        placeComponents(panel);
        placezhuce(zhuce);

        frame.setVisible(true);
        ZhuCe.setVisible(true);
    }

    private  static void placeComponents(JPanel panel){
        panel.setLayout(null);

        JLabel userLable = new JLabel("用户名：");
        userLable.setBounds(10,20,80,25);
        panel.add(userLable);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLable = new JLabel("密码：");
        passwordLable.setBounds(10,50,80,25);
        panel.add(passwordLable);

        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("登录");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);

        JButton zhuceButton = new JButton("注册");
        zhuceButton.setBounds(200,80,80,25);
        panel.add(zhuceButton);
    }

    private static void placezhuce(JPanel zhuce){
        zhuce.setLayout(null);

        JLabel zhuceuser = new JLabel("用户名：");
        zhuceuser.setBounds(10,20,80,25);
        zhuce.add(zhuceuser);

        JTextField zhuceuserText = new JTextField(20);
        zhuceuserText.setBounds(100,20,165,25);
        zhuce.add(zhuceuserText);

        JLabel zhucepassword = new JLabel("密码：");
        zhucepassword.setBounds(10,50,80,25);
        zhuce.add(zhucepassword);

        JTextField zhucepasswordText = new JTextField(20);
        zhucepasswordText.setBounds(100,50,165,25);
        zhuce.add(zhucepasswordText);

        JButton zheceButton = new JButton("确认注册");
        zheceButton.setBounds(10,80,80,25);
        zhuce.add(zheceButton);

        JButton fanhuiButton = new JButton("返回");
        fanhuiButton.setBounds(200,80,80,25);
        zhuce.add(fanhuiButton);
    }
}
