/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.firecodes.services;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Edycar Reyes
 */
public class GlobalService {

    /**
     * Creates new GlobalService instance
     */
    public GlobalService() {
    }

    // Generates a new dialog box
    public void showMessage(Component context, String message, String title, String dialogType) {
        int type = dialogType == "error"
                ? JOptionPane.ERROR_MESSAGE
                : dialogType == "warning"
                        ? JOptionPane.WARNING_MESSAGE
                        : dialogType == "info"
                                ? JOptionPane.INFORMATION_MESSAGE
                                : dialogType == "question"
                                        ? JOptionPane.QUESTION_MESSAGE
                                        : dialogType == "plain"
                                                ? JOptionPane.PLAIN_MESSAGE
                                                : JOptionPane.PLAIN_MESSAGE;
        
        JOptionPane.showMessageDialog(context, message, title, type);
    }

}
