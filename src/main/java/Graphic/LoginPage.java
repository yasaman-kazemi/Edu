package Graphic;

import model.pages.PageManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    private javax.swing.JLabel captchaIcon;
    private javax.swing.JTextField captchaTextField;
    private javax.swing.JButton forgetPasswordButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JPanel usernamePanel;
    private javax.swing.JTextField usernameTextField;
    private PageManager pageManager;

    public LoginPage() {
        initComponents();
    }

    private void initComponents() {
        loginPanel = new javax.swing.JPanel();
        usernamePanel = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        forgetPasswordButton = new javax.swing.JButton();
        captchaIcon = new javax.swing.JLabel();
        captchaTextField = new javax.swing.JTextField();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        usernamePanel.setBackground(new java.awt.Color(229, 240, 251));
        usernamePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UserName:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        usernameTextField.setBackground(new java.awt.Color(229, 240, 251));
        usernameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(204, 204, 204));
        usernameTextField.setText("Enter your username.");
        usernameTextField.setToolTipText("");
        usernameTextField.setBorder(null);
        usernameTextField.setName(""); // NOI18N
        usernameTextField.setSelectionColor(new java.awt.Color(200, 224, 247));
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        usernameTextField.addActionListener(this::actionPerformed);

        javax.swing.GroupLayout usernamePanelLayout = new javax.swing.GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
                usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, usernamePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(usernameTextField)
                                .addContainerGap())
        );
        usernamePanelLayout.setVerticalGroup(
                usernamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(usernamePanelLayout.createSequentialGroup()
                                .addComponent(usernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addContainerGap())
        );

        passwordPanel.setBackground(new java.awt.Color(229, 240, 251));
        passwordPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N
        passwordPanel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        passwordField.setBackground(new java.awt.Color(229, 240, 251));
        passwordField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        passwordField.setForeground(java.awt.Color.lightGray);
        passwordField.setText("Enter your password.");
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
                passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(passwordPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(passwordField)
                                .addContainerGap())
        );
        passwordPanelLayout.setVerticalGroup(
                passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(passwordPanelLayout.createSequentialGroup()
                                .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addContainerGap())
        );

        loginButton.setBackground(new java.awt.Color(211, 245, 221));
        loginButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(this::actionPerformed);

        forgetPasswordButton.setBackground(new java.awt.Color(249, 226, 234));
        forgetPasswordButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        forgetPasswordButton.setText("Forget password?");
        forgetPasswordButton.addActionListener(this::actionPerformed);

        captchaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages/captcha1.jpg"))); // NOI18N
        captchaIcon.setText("jLabel1");

        captchaTextField.setBackground(new java.awt.Color(229, 240, 251));
        captchaTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        captchaTextField.setForeground(java.awt.Color.lightGray);
        captchaTextField.setText("Enter the captcha.");
        captchaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.lightGray));

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                                .addGap(0, 83, Short.MAX_VALUE)
                                                .addComponent(captchaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(captchaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(81, 81, 81))
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(forgetPasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
                loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(usernamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addComponent(captchaTextField)
                                                .addGap(2, 2, 2))
                                        .addComponent(captchaIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginButton)
                                        .addComponent(forgetPasswordButton))
                                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(loginButton)) pageManager.enterToMainPage();
        if (e.getSource().equals(usernameTextField)) usernameTextField.getText();
    }
}
