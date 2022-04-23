package Graphic.pages;

import javax.swing.*;

public class StudentMainPage extends JPanel {
    private javax.swing.JTextField educationalInfoTextField;
    private javax.swing.JTextField educationalStatusTextField;
    private javax.swing.JTextField guideMasterTextField;
    private javax.swing.JTextField registrationLicenseTextField;
    private javax.swing.JTextField registrationTimeTextField;

    public StudentMainPage() {
        initComponents();
    }

    private void initComponents() {
        educationalInfoTextField = new javax.swing.JTextField();
        educationalStatusTextField = new javax.swing.JTextField();
        guideMasterTextField = new javax.swing.JTextField();
        registrationLicenseTextField = new javax.swing.JTextField();
        registrationTimeTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(134, 134, 134)));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        educationalInfoTextField.setEditable(false);
        educationalInfoTextField.setBackground(new java.awt.Color(204, 204, 204));
        educationalInfoTextField.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        educationalInfoTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        educationalInfoTextField.setText("Educational info:");
        educationalInfoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        educationalStatusTextField.setEditable(false);
        educationalStatusTextField.setBackground(new java.awt.Color(255, 255, 255));
        educationalStatusTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Educational status:"));

        guideMasterTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Guide master:"));

        registrationLicenseTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Registration license:"));

        registrationTimeTextField.setEditable(false);
        registrationTimeTextField.setBackground(new java.awt.Color(255, 255, 255));
        registrationTimeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Registration time:"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(323, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(registrationTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(registrationLicenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(guideMasterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(educationalStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(267, 267, 267)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(educationalInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(437, 437, 437))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(128, Short.MAX_VALUE)
                                .addComponent(educationalInfoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(educationalStatusTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(guideMasterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrationLicenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrationTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178))
        );
    }


}
