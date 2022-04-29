package Graphic.pages;

import model.pages.ChangingPasswordPage;

import javax.swing.*;
import java.awt.*;

public class NewPasswordPage extends MyPanel {
    private JTextField currentTextField;
    private JTextField messageTextField;
    private JTextField newPassword2TextField;
    private JTextField newPasswordTextField;
    private JButton saveButton;

    public NewPasswordPage(ChangingPasswordPage changingPasswordPage) {
        super(changingPasswordPage);
        initComponents();
    }

    private void initComponents() {
        messageTextField = new JTextField();
        currentTextField = new JTextField();
        newPassword2TextField = new JTextField();
        newPasswordTextField = new JTextField();
        saveButton = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        messageTextField.setEditable(false);
        messageTextField.setBackground(new java.awt.Color(255, 204, 204));
        messageTextField.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 24)); // NOI18N
        messageTextField.setForeground(new java.awt.Color(153, 0, 51));
        messageTextField.setHorizontalAlignment(JTextField.CENTER);
        messageTextField.setText("You have to set another password!");

        currentTextField.setBorder(BorderFactory.createTitledBorder("Current password:"));

        newPassword2TextField.setBorder(BorderFactory.createTitledBorder("New password, again:"));

        newPasswordTextField.setBorder(BorderFactory.createTitledBorder("New password:"));

        saveButton.setBackground(new java.awt.Color(204, 255, 204));
        saveButton.setText("save");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(402, 402, 402)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(newPassword2TextField)
                                                        .addComponent(currentTextField)
                                                        .addComponent(newPasswordTextField, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(497, 497, 497)
                                                .addComponent(saveButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(315, 315, 315)
                                                .addComponent(messageTextField, GroupLayout.PREFERRED_SIZE, 470, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(392, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(messageTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(currentTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(newPasswordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(newPassword2TextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(saveButton)
                                .addContainerGap(124, Short.MAX_VALUE))
        );
    }


}
