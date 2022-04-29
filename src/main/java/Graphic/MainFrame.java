package Graphic;

import Graphic.pages.MyPanel;
import model.person.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.Date;

public class MainFrame extends JFrame {
    private static final int listMenuItemWidth = 150;
    private static final int listMenuItemHeight = 20;
    private JMenuItem courseListMenuItem;
    private JTextField currentTimeTextField;
    private JMenu educationalServiceMenu;
    private JMenuItem educationalStatusMenuItem;
    private JTextField emailTextField;
    private JMenuItem examListMenuItem;
    private JButton exitButton;
    private JPanel headerPanel;
    private JTextField lastLoginTextField;
    private JMenu mainPageMenu;
    private MyPanel mainPanel;
    private JMenuItem masterListMenuItem;
    private JMenuBar menuBar;
    private JTextField nameTextField;
    private JMenu profileMenu;
    private JMenu registrationAffairsMenu;
    private JMenu reportedCardAffairsMenu;
    private JMenuItem requestsMenuItem;
    private JMenuItem temporaryScoresMenuItem;
    private JLabel userPhotoLabel;
    private JMenuItem weeklyScheduleMenuItem;
    private static MainFrame instance;

    private User user;

    private MainFrame(User user, MyPanel myPanel) {
        this.user = user;
        initComponents(myPanel);
        this.setResizable(false);
    }

    public static MainFrame getInstance(User user, MyPanel myPanel) {
        if (instance != null) instance.dispose();
        instance = new MainFrame(user, myPanel);
        return instance;
    }

    public static MainFrame getInstance() {
        return instance;
    }

    public MyPanel getMainPanel() {
        return mainPanel;
    }

    public void setMyPanel(MyPanel myPanel) {
        mainPanel = myPanel;
    }

    public void initComponents(MyPanel myPanel) {
        headerPanel = new JPanel();
        lastLoginTextField = new JTextField();
        currentTimeTextField = new JTextField();
        userPhotoLabel = new JLabel();
        nameTextField = new JTextField();
        emailTextField = new JTextField();
        exitButton = new JButton();
        mainPanel = myPanel;
        menuBar = new JMenuBar();
        mainPageMenu = new JMenu();
        registrationAffairsMenu = new JMenu();
        courseListMenuItem = new JMenuItem();
        masterListMenuItem = new JMenuItem();
        educationalServiceMenu = new JMenu();
        weeklyScheduleMenuItem = new JMenuItem();
        examListMenuItem = new JMenuItem();
        requestsMenuItem = new JMenuItem();
        reportedCardAffairsMenu = new JMenu();
        temporaryScoresMenuItem = new JMenuItem();
        educationalStatusMenuItem = new JMenuItem();
        profileMenu = new JMenu();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edu");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1145, 850));

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));
        headerPanel.setPreferredSize(new java.awt.Dimension(1112, 159));

        lastLoginTextField.setEditable(false);
        lastLoginTextField.setBackground(new java.awt.Color(150, 207, 249));
        lastLoginTextField.setBorder(BorderFactory.createTitledBorder("Last entry:"));
        lastLoginTextField.setText(new Date(System.currentTimeMillis()).toString());

        currentTimeTextField.setEditable(false);
        currentTimeTextField.setBackground(new java.awt.Color(150, 207, 249));
        currentTimeTextField.setBorder(BorderFactory.createTitledBorder("Current time:"));
        currentTimeTextField.setText(new Date(System.currentTimeMillis()).toString());

//        userPhotoLabel.setIcon(new ImageIcon(getClass().getResource("/pages/question.jpg"))); // NOI18N
        userPhotoLabel.setBorder(BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));

        nameTextField.setEditable(false);
        nameTextField.setBackground(new java.awt.Color(150, 207, 249));
        nameTextField.setBorder(BorderFactory.createTitledBorder("Login as:"));
        if (user != null) {
            nameTextField.setText(user.getFirstname() + " " + user.getLastname());
            emailTextField.setText(user.getEmail());
        }

        emailTextField.setEditable(false);
        emailTextField.setBackground(new java.awt.Color(150, 207, 249));
        emailTextField.setBorder(BorderFactory.createTitledBorder("Email:"));

        exitButton.setBackground(new java.awt.Color(249, 150, 170));
        exitButton.setText("Exit");
        exitButton.addActionListener(this::exitButtonActionPerformed);

        setHeaderLayout();

        setMainPageSetting();

        mainPageMenu.setText("Main page");
        menuBar.add(mainPageMenu);

        registrationAffairsMenu.setText("Registration affairs");

        courseListMenuItem.setText("Course list");
        courseListMenuItem.setIconTextGap(-12);
        courseListMenuItem.setPreferredSize(new Dimension(listMenuItemWidth, listMenuItemHeight));
        courseListMenuItem.addActionListener(this::courseListActionPerformed);
        registrationAffairsMenu.add(courseListMenuItem);

        masterListMenuItem.setText("Master list");
        masterListMenuItem.setIconTextGap(-12);
        masterListMenuItem.setPreferredSize(new Dimension(listMenuItemWidth, listMenuItemHeight));
        masterListMenuItem.addActionListener(this::masterListActionPerformed);
        registrationAffairsMenu.add(masterListMenuItem);

        menuBar.add(registrationAffairsMenu);

        educationalServiceMenu.setText("Educational service");

        weeklyScheduleMenuItem.setText("Weekly schedule");
        weeklyScheduleMenuItem.setIconTextGap(-12);
        weeklyScheduleMenuItem.setPreferredSize(new Dimension(listMenuItemWidth, listMenuItemHeight));
        weeklyScheduleMenuItem.addActionListener(this::weeklyScheduleMenuItemActionPerformed);
        weeklyScheduleMenuItem.addActionListener(this::weeklyScheduleActionPerformed);
        educationalServiceMenu.add(weeklyScheduleMenuItem);

        examListMenuItem.setText("Exam list");
        examListMenuItem.setIconTextGap(-12);
        examListMenuItem.setPreferredSize(new Dimension(listMenuItemWidth, listMenuItemHeight));
        educationalServiceMenu.add(examListMenuItem);

        requestsMenuItem.setText("Requests");
        requestsMenuItem.setIconTextGap(-12);
        requestsMenuItem.setPreferredSize(new Dimension(listMenuItemWidth, listMenuItemHeight));
        educationalServiceMenu.add(requestsMenuItem);

        menuBar.add(educationalServiceMenu);

        reportedCardAffairsMenu.setText("Reported card affairs");

        temporaryScoresMenuItem.setText("Temporary scores");
        temporaryScoresMenuItem.setIconTextGap(-12);
        temporaryScoresMenuItem.setPreferredSize(new Dimension(listMenuItemWidth, listMenuItemHeight));
        reportedCardAffairsMenu.add(temporaryScoresMenuItem);

        educationalStatusMenuItem.setText("Educational status");
        educationalStatusMenuItem.setIconTextGap(-12);
        educationalStatusMenuItem.setPreferredSize(new Dimension(listMenuItemWidth, listMenuItemHeight));
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
    }

    private void weeklyScheduleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void exitButtonActionPerformed(ActionEvent e) {
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

    private void courseListActionPerformed(ActionEvent e) {
        mainPanel.getPage().changePage("course list");
    }

    private void masterListActionPerformed(ActionEvent e) {
        mainPanel.getPage().changePage("master list");
    }

    private void weeklyScheduleActionPerformed(ActionEvent e) {
        mainPanel.getPage().changePage("weekly schedule");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

