package Graphic.pages;

import javax.swing.*;

public class MasterProfilePage extends MyPanel {
    private javax.swing.JButton changeThemeButton;
    private javax.swing.JTextField departmentTextField;
    private javax.swing.JButton emailChangeButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JTextField identityCodeTextField;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JTextField masterDegreeTextField;
    private javax.swing.JButton phoneNumberChangeButton;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField roomTextField;
    private javax.swing.JLabel userPhoto;

    public MasterProfilePage() {
        initComponents();
    }

    private void initComponents() {
        userPhoto = new javax.swing.JLabel();
        firstnameTextField = new javax.swing.JTextField();
        lastnameTextField = new javax.swing.JTextField();
        identityCodeTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        roomTextField = new javax.swing.JTextField();
        departmentTextField = new javax.swing.JTextField();
        emailChangeButton = new javax.swing.JButton();
        phoneNumberChangeButton = new javax.swing.JButton();
        changeThemeButton = new javax.swing.JButton();
        masterDegreeTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        userPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages/question.jpg"))); // NOI18N
        userPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        firstnameTextField.setEditable(false);
        firstnameTextField.setBackground(new java.awt.Color(255, 255, 255));
        firstnameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Firstname:"));

        lastnameTextField.setEditable(false);
        lastnameTextField.setBackground(new java.awt.Color(255, 255, 255));
        lastnameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Lastname:"));

        identityCodeTextField.setEditable(false);
        identityCodeTextField.setBackground(new java.awt.Color(255, 255, 255));
        identityCodeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Identity code:"));

        idTextField.setEditable(false);
        idTextField.setBackground(new java.awt.Color(255, 255, 255));
        idTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Master id:"));

        phoneNumberTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone number:"));

        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Email:"));

        roomTextField.setEditable(false);
        roomTextField.setBackground(new java.awt.Color(255, 255, 255));
        roomTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Room:"));

        departmentTextField.setEditable(false);
        departmentTextField.setBackground(new java.awt.Color(255, 255, 255));
        departmentTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Department:"));

        emailChangeButton.setBackground(new java.awt.Color(255, 204, 204));
        emailChangeButton.setText("Change");

        phoneNumberChangeButton.setBackground(new java.awt.Color(255, 204, 204));
        phoneNumberChangeButton.setText("Change");

        changeThemeButton.setBackground(new java.awt.Color(102, 102, 102));
        changeThemeButton.setForeground(new java.awt.Color(51, 51, 51));
        changeThemeButton.setText("Change theme");

        masterDegreeTextField.setEditable(false);
        masterDegreeTextField.setBackground(new java.awt.Color(255, 255, 255));
        masterDegreeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Master degree:"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(roomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(userPhoto)
                                                .addGap(482, 482, 482))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(departmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(identityCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(53, 53, 53)
                                                                .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 237, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(phoneNumberChangeButton)
                                .addGap(240, 240, 240)
                                .addComponent(emailChangeButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(masterDegreeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(388, 388, 388))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(changeThemeButton)
                                                .addGap(450, 450, 450))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userPhoto)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(identityCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(departmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(roomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(masterDegreeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneNumberChangeButton)
                                        .addComponent(emailChangeButton))
                                .addGap(48, 48, 48)
                                .addComponent(changeThemeButton)
                                .addGap(65, 65, 65))
        );
    }
}
