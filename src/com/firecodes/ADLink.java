/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firecodes;

import com.firecodes.views.LoginView;

/**
 *
 * @author edycarreyes99
 */
public class ADLink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Launching login view form");
        LoginView loginViewForm = new LoginView();
        loginViewForm.setVisible(true);
    }
    
}
