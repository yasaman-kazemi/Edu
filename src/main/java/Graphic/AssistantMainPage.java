package Graphic;

import javax.swing.*;

public class AssistantMainPage extends JPanel {
    private javax.swing.JButton createNewAccountButton;
    private javax.swing.JTextField departmentTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JTextField identityCodeTextField;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField userIdTextField;
    private javax.swing.JTextField userInfoTextField;
    private javax.swing.JLabel userPhoto;

    public AssistantMainPage() {
        initComponents();
    }

    private void initComponents() {
        userInfoTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        identityCodeTextField = new javax.swing.JTextField();
        userIdTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        departmentTextField = new javax.swing.JTextField();
        userPhoto = new javax.swing.JLabel();
        createNewAccountButton = new javax.swing.JButton();
        passwordTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        userInfoTextField.setEditable(false);
        userInfoTextField.setBackground(new java.awt.Color(153, 204, 255));
        userInfoTextField.setText("User info:");

        firstNameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("First name:"));

        lastNameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Last name:"));

        identityCodeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Identity code:"));

        userIdTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("User Id:"));

        phoneNumberTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Phone number:"));

        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Email:"));

        departmentTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Department:"));

        userPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages/question.jpg"))); // NOI18N
        userPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        createNewAccountButton.setBackground(new java.awt.Color(204, 255, 204));
        createNewAccountButton.setText("Create new account");

        passwordTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Password:"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(223, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(createNewAccountButton)
                                                .addGap(468, 468, 468))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(userPhoto)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(identityCodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                        .addComponent(phoneNumberTextField)
                                                                        .addComponent(userIdTextField)
                                                                        .addComponent(firstNameTextField))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(departmentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                        .addComponent(lastNameTextField)
                                                                        .addComponent(passwordTextField)
                                                                        .addComponent(emailTextField))))
                                                .addGap(211, 211, 211))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(514, 514, 514)
                                .addComponent(userInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(userInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(userPhoto)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailTextField)
                                        .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(departmentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(identityCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(createNewAccountButton)
                                .addContainerGap(105, Short.MAX_VALUE))
        );
    }
}
