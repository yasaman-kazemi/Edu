package Graphic.pages;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    private JLabel captchaIcon;
    private JTextField captchaTextField;
    private JButton forgetPasswordButton;
    private JButton loginButton;
    private JPanel loginPanel;
    private JPasswordField passwordField;
    private JPanel passwordPanel;
    private JPanel usernamePanel;
    private JTextField usernameTextField;
    private model.pages.LoginPage page;

    public LoginPage(model.pages.LoginPage page) {
        this.page = page;
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        loginPanel = new JPanel();
        usernamePanel = new JPanel();
        usernameTextField = new JTextField();
        passwordPanel = new JPanel();
        passwordField = new JPasswordField();
        loginButton = new JButton();
        forgetPasswordButton = new JButton();
        captchaIcon = new JLabel();
        captchaTextField = new JTextField();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));

        usernamePanel.setBackground(new java.awt.Color(229, 240, 251));
        usernamePanel.setBorder(BorderFactory.createTitledBorder(null, "UserName:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N

        usernameTextField.setBackground(new java.awt.Color(229, 240, 251));
        usernameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(204, 204, 204));
        usernameTextField.setText("Enter your username.");
        usernameTextField.setToolTipText("");
        usernameTextField.setBorder(null);
        usernameTextField.setName(""); // NOI18N
        usernameTextField.setSelectionColor(new java.awt.Color(200, 224, 247));

        GroupLayout usernamePanelLayout = new GroupLayout(usernamePanel);
        usernamePanel.setLayout(usernamePanelLayout);
        usernamePanelLayout.setHorizontalGroup(
                usernamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, usernamePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(usernameTextField)
                                .addContainerGap())
        );
        usernamePanelLayout.setVerticalGroup(
                usernamePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(usernamePanelLayout.createSequentialGroup()
                                .addComponent(usernameTextField, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addContainerGap())
        );

        passwordPanel.setBackground(new java.awt.Color(229, 240, 251));
        passwordPanel.setBorder(BorderFactory.createTitledBorder(null, "Password:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14))); // NOI18N
        passwordPanel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        passwordField.setBackground(new java.awt.Color(229, 240, 251));
        passwordField.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        passwordField.setForeground(java.awt.Color.lightGray);
        passwordField.setText("Enter your password.");
        passwordField.setBorder(null);
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        GroupLayout passwordPanelLayout = new GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
                passwordPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(passwordPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(passwordField)
                                .addContainerGap())
        );
        passwordPanelLayout.setVerticalGroup(
                passwordPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(passwordPanelLayout.createSequentialGroup()
                                .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addContainerGap())
        );

        loginButton.setBackground(new java.awt.Color(211, 245, 221));
        loginButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(this);

        forgetPasswordButton.setBackground(new java.awt.Color(249, 226, 234));
        forgetPasswordButton.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        forgetPasswordButton.setText("Forget password?");
        forgetPasswordButton.addActionListener(this);

//        captchaIcon.setIcon(new ImageIcon(getClass().getResource("/pages/captcha1.jpg"))); // NOI18N
        captchaIcon.setText("jLabel1");

        captchaTextField.setBackground(new java.awt.Color(229, 240, 251));
        captchaTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        captchaTextField.setForeground(java.awt.Color.lightGray);
        captchaTextField.setText("Enter the captcha.");
        captchaTextField.setBorder(BorderFactory.createLineBorder(java.awt.Color.lightGray));

        GroupLayout loginPanelLayout = new GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
                loginPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(loginPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(usernamePanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                                .addGap(0, 83, Short.MAX_VALUE)
                                                .addComponent(captchaIcon, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(captchaTextField, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                                .addGap(81, 81, 81))
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addComponent(loginButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(forgetPasswordButton, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
                loginPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(loginPanelLayout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(usernamePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(loginPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                                .addComponent(captchaTextField)
                                                .addGap(2, 2, 2))
                                        .addComponent(captchaIcon, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(loginPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(loginButton)
                                        .addComponent(forgetPasswordButton))
                                .addContainerGap(65, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(loginPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("0");
        if (e.getSource() == loginButton) {
            if (page.login(usernameTextField.getText(), new String(passwordField.getPassword()))) {
                System.out.println("1");
                this.setVisible(false);
                this.dispose();
            }
        } else if (e.getSource() == forgetPasswordButton) {

        }
    }
}
