package com.formclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Loginmain {
    public static  void main(String[] args){
        LoginForm loginForm = new LoginForm();
        loginForm.setFrameLoginVisible(true);

      /* resisterForm.getBackButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               loginForm.setFrameLoginVisible(true);
               resisterForm.dispose();
           }
       });*/
    }
}
