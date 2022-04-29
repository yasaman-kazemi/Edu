package Graphic.pages.mainPage;

import Graphic.pages.MyPanel;
import model.pages.mainPage.MainPage;

import javax.swing.*;

public class StudentMainPage extends MyPanel {
    private JTextField educationalInfoTextField;
    private JTextField educationalStatusTextField;
    private JTextField guideMasterTextField;
    private JTextField registrationLicenseTextField;
    private JTextField registrationTimeTextField;

    public StudentMainPage(MainPage mainPage) {
        super(mainPage);
        initComponents();
    }

    private void initComponents() {
        educationalInfoTextField = new JTextField();
        educationalStatusTextField = new JTextField();
        guideMasterTextField = new JTextField();
        registrationLicenseTextField = new JTextField();
        registrationTimeTextField = new JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(BorderFactory.createLineBorder(new java.awt.Color(134, 134, 134)));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        educationalInfoTextField.setEditable(false);
        educationalInfoTextField.setBackground(new java.awt.Color(204, 204, 204));
        educationalInfoTextField.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        educationalInfoTextField.setHorizontalAlignment(JTextField.CENTER);
        educationalInfoTextField.setText("Educational info:");
        educationalInfoTextField.setBorder(BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        educationalStatusTextField.setEditable(false);
        educationalStatusTextField.setBackground(new java.awt.Color(255, 255, 255));
        educationalStatusTextField.setBorder(BorderFactory.createTitledBorder("Educational status:"));

        guideMasterTextField.setBorder(BorderFactory.createTitledBorder("Guide master:"));

        registrationLicenseTextField.setBorder(BorderFactory.createTitledBorder("Registration license:"));

        registrationTimeTextField.setEditable(false);
        registrationTimeTextField.setBackground(new java.awt.Color(255, 255, 255));
        registrationTimeTextField.setBorder(BorderFactory.createTitledBorder("Registration time:"));

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(323, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(registrationTimeTextField, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(registrationLicenseTextField, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(guideMasterTextField, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(educationalStatusTextField, GroupLayout.PREFERRED_SIZE, 520, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(267, 267, 267)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(educationalInfoTextField, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
                                                .addGap(437, 437, 437))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(128, Short.MAX_VALUE)
                                .addComponent(educationalInfoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(educationalStatusTextField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(guideMasterTextField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrationLicenseTextField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(registrationTimeTextField, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178))
        );
    }


}
