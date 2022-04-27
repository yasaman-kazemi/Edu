package Graphic.pages;

import javax.swing.*;

public class MasterProfilePage extends MyPanel {
    private JButton changeThemeButton;
    private JTextField departmentTextField;
    private JButton emailChangeButton;
    private JTextField emailTextField;
    private JTextField firstnameTextField;
    private JTextField idTextField;
    private JTextField identityCodeTextField;
    private JTextField lastnameTextField;
    private JTextField masterDegreeTextField;
    private JButton phoneNumberChangeButton;
    private JTextField phoneNumberTextField;
    private JTextField roomTextField;
    private JLabel userPhoto;

    public MasterProfilePage(model.pages.profilePage.MasterProfilePage masterProfilePage) {
        super(masterProfilePage);
        initComponents();
    }

    private void initComponents() {
        userPhoto = new JLabel();
        firstnameTextField = new JTextField();
        lastnameTextField = new JTextField();
        identityCodeTextField = new JTextField();
        idTextField = new JTextField();
        phoneNumberTextField = new JTextField();
        emailTextField = new JTextField();
        roomTextField = new JTextField();
        departmentTextField = new JTextField();
        emailChangeButton = new JButton();
        phoneNumberChangeButton = new JButton();
        changeThemeButton = new JButton();
        masterDegreeTextField = new JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        userPhoto.setIcon(new ImageIcon(getClass().getResource("/pages/question.jpg"))); // NOI18N
        userPhoto.setBorder(BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        firstnameTextField.setEditable(false);
        firstnameTextField.setBackground(new java.awt.Color(255, 255, 255));
        firstnameTextField.setBorder(BorderFactory.createTitledBorder("Firstname:"));

        lastnameTextField.setEditable(false);
        lastnameTextField.setBackground(new java.awt.Color(255, 255, 255));
        lastnameTextField.setBorder(BorderFactory.createTitledBorder("Lastname:"));

        identityCodeTextField.setEditable(false);
        identityCodeTextField.setBackground(new java.awt.Color(255, 255, 255));
        identityCodeTextField.setBorder(BorderFactory.createTitledBorder("Identity code:"));

        idTextField.setEditable(false);
        idTextField.setBackground(new java.awt.Color(255, 255, 255));
        idTextField.setBorder(BorderFactory.createTitledBorder("Master id:"));

        phoneNumberTextField.setBorder(BorderFactory.createTitledBorder("Phone number:"));

        emailTextField.setBorder(BorderFactory.createTitledBorder("Email:"));

        roomTextField.setEditable(false);
        roomTextField.setBackground(new java.awt.Color(255, 255, 255));
        roomTextField.setBorder(BorderFactory.createTitledBorder("Room:"));

        departmentTextField.setEditable(false);
        departmentTextField.setBackground(new java.awt.Color(255, 255, 255));
        departmentTextField.setBorder(BorderFactory.createTitledBorder("Department:"));

        emailChangeButton.setBackground(new java.awt.Color(255, 204, 204));
        emailChangeButton.setText("Change");

        phoneNumberChangeButton.setBackground(new java.awt.Color(255, 204, 204));
        phoneNumberChangeButton.setText("Change");

        changeThemeButton.setBackground(new java.awt.Color(102, 102, 102));
        changeThemeButton.setForeground(new java.awt.Color(51, 51, 51));
        changeThemeButton.setText("Change theme");

        masterDegreeTextField.setEditable(false);
        masterDegreeTextField.setBackground(new java.awt.Color(255, 255, 255));
        masterDegreeTextField.setBorder(BorderFactory.createTitledBorder("Master degree:"));

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(roomTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(userPhoto)
                                                .addGap(482, 482, 482))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(phoneNumberTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(departmentTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(identityCodeTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(firstnameTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(53, 53, 53)
                                                                .addComponent(lastnameTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 237, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(366, 366, 366)
                                .addComponent(phoneNumberChangeButton)
                                .addGap(240, 240, 240)
                                .addComponent(emailChangeButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(masterDegreeTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                .addGap(388, 388, 388))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(changeThemeButton)
                                                .addGap(450, 450, 450))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userPhoto)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(identityCodeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(departmentTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(roomTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(masterDegreeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneNumberChangeButton)
                                        .addComponent(emailChangeButton))
                                .addGap(48, 48, 48)
                                .addComponent(changeThemeButton)
                                .addGap(65, 65, 65))
        );
    }
}
