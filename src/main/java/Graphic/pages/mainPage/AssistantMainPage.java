package Graphic.pages.mainPage;

import Graphic.pages.MyPanel;
import model.pages.mainPage.MainPage;
import utils.ImageLoader;

import javax.swing.*;

public class AssistantMainPage extends MyPanel {
    private JButton createNewAccountButton;
    private JTextField departmentTextField;
    private JTextField emailTextField;
    private JTextField firstNameTextField;
    private JTextField identityCodeTextField;
    private JTextField lastNameTextField;
    private JTextField passwordTextField;
    private JTextField phoneNumberTextField;
    private JTextField userIdTextField;
    private JTextField userInfoTextField;
    private JLabel userPhoto;

    public AssistantMainPage(MainPage mainPage) {
        super(mainPage);
        initComponents();
    }

    private void initComponents() {
        userInfoTextField = new JTextField();
        firstNameTextField = new JTextField();
        lastNameTextField = new JTextField();
        identityCodeTextField = new JTextField();
        userIdTextField = new JTextField();
        phoneNumberTextField = new JTextField();
        emailTextField = new JTextField();
        departmentTextField = new JTextField();
        userPhoto = new JLabel();
        createNewAccountButton = new JButton();
        passwordTextField = new JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        userInfoTextField.setEditable(false);
        userInfoTextField.setBackground(new java.awt.Color(153, 204, 255));
        userInfoTextField.setText("User info:");

        firstNameTextField.setBorder(BorderFactory.createTitledBorder("First name:"));

        lastNameTextField.setBorder(BorderFactory.createTitledBorder("Last name:"));

        identityCodeTextField.setBorder(BorderFactory.createTitledBorder("Identity code:"));

        userIdTextField.setBorder(BorderFactory.createTitledBorder("User Id:"));

        phoneNumberTextField.setBorder(BorderFactory.createTitledBorder("Phone number:"));

        emailTextField.setBorder(BorderFactory.createTitledBorder("Email:"));

        departmentTextField.setBorder(BorderFactory.createTitledBorder("Department:"));

        userPhoto.setIcon(new ImageIcon(ImageLoader.getImageAddresses().get("question")));
        userPhoto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        createNewAccountButton.setBackground(new java.awt.Color(204, 255, 204));
        createNewAccountButton.setText("Create new account");

        passwordTextField.setBorder(BorderFactory.createTitledBorder("Password:"));

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(223, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(createNewAccountButton)
                                                .addGap(468, 468, 468))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(userPhoto)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(identityCodeTextField, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                        .addComponent(phoneNumberTextField)
                                                                        .addComponent(userIdTextField)
                                                                        .addComponent(firstNameTextField))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(departmentTextField, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                        .addComponent(lastNameTextField)
                                                                        .addComponent(passwordTextField)
                                                                        .addComponent(emailTextField))))
                                                .addGap(211, 211, 211))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(514, 514, 514)
                                .addComponent(userInfoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(userInfoTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(userPhoto)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lastNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userIdTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailTextField)
                                        .addComponent(phoneNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(departmentTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(identityCodeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(createNewAccountButton)
                                .addContainerGap(105, Short.MAX_VALUE))
        );
    }
}
