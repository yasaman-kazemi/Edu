package Graphic.pages;

import model.pages.ChangingPasswordPage;

import javax.swing.*;

public class NewPasswordPage extends MyPanel {
    private javax.swing.JTextField currentTextField;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JTextField newPassword2TextField;
    private javax.swing.JTextField newPasswordTextField;
    private javax.swing.JButton saveButton;

    public NewPasswordPage(ChangingPasswordPage changingPasswordPage) {
        super(changingPasswordPage);
        initComponents();
    }

    private void initComponents() {
        messageTextField = new javax.swing.JTextField();
        currentTextField = new javax.swing.JTextField();
        newPassword2TextField = new javax.swing.JTextField();
        newPasswordTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        messageTextField.setEditable(false);
        messageTextField.setBackground(new java.awt.Color(255, 204, 204));
        messageTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        messageTextField.setForeground(new java.awt.Color(153, 0, 51));
        messageTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        messageTextField.setText("You have to set another password!");

        currentTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Current password:"));

        newPassword2TextField.setBorder(javax.swing.BorderFactory.createTitledBorder("New password, again:"));

        newPasswordTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("New password:"));

        saveButton.setBackground(new java.awt.Color(204, 255, 204));
        saveButton.setText("save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(402, 402, 402)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(newPassword2TextField)
                                                        .addComponent(currentTextField)
                                                        .addComponent(newPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(497, 497, 497)
                                                .addComponent(saveButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(315, 315, 315)
                                                .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(392, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(currentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(newPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(newPassword2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(saveButton)
                                .addContainerGap(124, Short.MAX_VALUE))
        );
    }


}
