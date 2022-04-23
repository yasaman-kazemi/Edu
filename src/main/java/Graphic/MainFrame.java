package Graphic;

import javax.swing.*;

public class MainFrame extends JFrame {
    private javax.swing.JMenuItem courseListMenuItem;
    private javax.swing.JTextField currentTimeTextField;
    private javax.swing.JMenu educationalServiceMenu;
    private javax.swing.JMenuItem educationalStatusMenuItem;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JMenuItem examListMenuItem;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField lastLoginTextField;
    private javax.swing.JMenu mainPageMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem masterListMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JMenu profileMenu;
    private javax.swing.JMenu registrationAffairsMenu;
    private javax.swing.JMenu reportedCardAffairsMenu;
    private javax.swing.JMenuItem requestsMenuItem;
    private javax.swing.JMenuItem temporaryScoresMenuItem;
    private javax.swing.JLabel userPhotoLabel;
    private javax.swing.JMenuItem weeklyScheduleMenuItem;

    public MainFrame() {
        initComponents();
    }

    private void initComponents() {
        headerPanel = new javax.swing.JPanel();
        lastLoginTextField = new javax.swing.JTextField();
        currentTimeTextField = new javax.swing.JTextField();
        userPhotoLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        mainPageMenu = new javax.swing.JMenu();
        registrationAffairsMenu = new javax.swing.JMenu();
        courseListMenuItem = new javax.swing.JMenuItem();
        masterListMenuItem = new javax.swing.JMenuItem();
        educationalServiceMenu = new javax.swing.JMenu();
        weeklyScheduleMenuItem = new javax.swing.JMenuItem();
        examListMenuItem = new javax.swing.JMenuItem();
        requestsMenuItem = new javax.swing.JMenuItem();
        reportedCardAffairsMenu = new javax.swing.JMenu();
        temporaryScoresMenuItem = new javax.swing.JMenuItem();
        educationalStatusMenuItem = new javax.swing.JMenuItem();
        profileMenu = new javax.swing.JMenu();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edu");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1145, 850));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setPreferredSize(new java.awt.Dimension(1112, 159));

        lastLoginTextField.setEditable(false);
        lastLoginTextField.setBackground(new java.awt.Color(150, 207, 249));
        lastLoginTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Last entry:"));

        currentTimeTextField.setEditable(false);
        currentTimeTextField.setBackground(new java.awt.Color(150, 207, 249));
        currentTimeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Current time:"));

        userPhotoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages/question.jpg"))); // NOI18N
        userPhotoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));

        nameTextField.setEditable(false);
        nameTextField.setBackground(new java.awt.Color(150, 207, 249));
        nameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Login as:"));

        emailTextField.setEditable(false);
        emailTextField.setBackground(new java.awt.Color(150, 207, 249));
        emailTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Email:"));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(249, 150, 170));
        exitButton.setText("Exit");

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userPhotoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(headerPanelLayout.createSequentialGroup()
                                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(currentTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lastLoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
                headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(currentTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastLoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(userPhotoLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1112, 643));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1112, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 643, Short.MAX_VALUE)
        );

        mainPageMenu.setText("Main page");
        menuBar.add(mainPageMenu);

        registrationAffairsMenu.setText("Registration affairs");

        courseListMenuItem.setText("Course list");
        courseListMenuItem.setIconTextGap(-12);
        registrationAffairsMenu.add(courseListMenuItem);

        masterListMenuItem.setText("Master list");
        masterListMenuItem.setIconTextGap(-12);
        registrationAffairsMenu.add(masterListMenuItem);

        menuBar.add(registrationAffairsMenu);

        educationalServiceMenu.setText("Educational service");

        weeklyScheduleMenuItem.setText("Weekly schedule");
        weeklyScheduleMenuItem.setIconTextGap(-12);
        weeklyScheduleMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weeklyScheduleMenuItemActionPerformed(evt);
            }
        });
        educationalServiceMenu.add(weeklyScheduleMenuItem);

        examListMenuItem.setText("Exam list");
        examListMenuItem.setIconTextGap(-12);
        educationalServiceMenu.add(examListMenuItem);

        requestsMenuItem.setText("Requests");
        requestsMenuItem.setIconTextGap(-12);
        educationalServiceMenu.add(requestsMenuItem);

        menuBar.add(educationalServiceMenu);

        reportedCardAffairsMenu.setText("Reported card affairs");

        temporaryScoresMenuItem.setText("Temporary scores");
        temporaryScoresMenuItem.setIconTextGap(-12);
        reportedCardAffairsMenu.add(temporaryScoresMenuItem);

        educationalStatusMenuItem.setText("Educational status");
        educationalStatusMenuItem.setIconTextGap(-12);
        reportedCardAffairsMenu.add(educationalStatusMenuItem);

        menuBar.add(reportedCardAffairsMenu);

        profileMenu.setText("Profile");
        menuBar.add(profileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private void weeklyScheduleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}

