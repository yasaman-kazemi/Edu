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
    private static MainFrame instance;

    public static MainFrame getInstance() {
        if (instance == null) instance = new MainFrame();
        return instance;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
        setMainPageSetting();
        setLayout();
    }

    public void setLayout() {
        setHeaderLayout();
        setMainPageLayout();
    }

    private MainFrame() {
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

        setHeaderLayout();

        setMainPageSetting();

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

        setMainPageLayout();

        pack();
    }

    private void setMainPageLayout() {
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(headerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }

    private void setHeaderLayout() {
        GroupLayout headerPanelLayout = new GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
                headerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userPhotoLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(headerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(headerPanelLayout.createSequentialGroup()
                                                .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(currentTimeTextField, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lastLoginTextField, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(exitButton, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
                headerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(headerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameTextField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(currentTimeTextField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastLoginTextField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(headerPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(userPhotoLabel)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    void setMainPageSetting() {
        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(1112, 643));

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 1112, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
                mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 643, Short.MAX_VALUE)
        );
    }

    private void weeklyScheduleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}

