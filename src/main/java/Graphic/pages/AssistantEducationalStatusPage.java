package Graphic.pages;

import model.pages.mainPage.MainPage;
import model.pages.reportedCardAffairs.StudentEducationalStatusPage;

import javax.swing.*;

public class AssistantEducationalStatusPage extends MyPanel {
    private JTextField firstnameTextField;
    private JScrollPane jScrollPane1;
    private JTextField lastnameTextField;
    private JTextField numberOfPassedUnitsTextField;
    private JTable scoreTable;
    private JButton searchButton;
    private JPanel searchPanel;
    private JTextField studentIdTextField;
    private JTextField weightedTotalAverageTextField;

    public AssistantEducationalStatusPage(StudentEducationalStatusPage studentEducationalStatusPage) {
        super(studentEducationalStatusPage);
        initComponents();
    }

    private void initComponents() {
        numberOfPassedUnitsTextField = new JTextField();
        weightedTotalAverageTextField = new JTextField();
        jScrollPane1 = new JScrollPane();
        scoreTable = new JTable();
        searchPanel = new JPanel();
        firstnameTextField = new JTextField();
        lastnameTextField = new JTextField();
        studentIdTextField = new JTextField();
        searchButton = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        numberOfPassedUnitsTextField.setEditable(false);
        numberOfPassedUnitsTextField.setBackground(new java.awt.Color(255, 255, 255));
        numberOfPassedUnitsTextField.setBorder(BorderFactory.createTitledBorder("Number of passed units:"));

        weightedTotalAverageTextField.setEditable(false);
        weightedTotalAverageTextField.setBackground(new java.awt.Color(255, 255, 255));
        weightedTotalAverageTextField.setBorder(BorderFactory.createTitledBorder("Weighted total average:"));

        scoreTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String[]{
                        "Score", "Status"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane1.setViewportView(scoreTable);

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        firstnameTextField.setBorder(BorderFactory.createTitledBorder("Firstname:"));

        lastnameTextField.setBorder(BorderFactory.createTitledBorder("LastName:"));

        studentIdTextField.setBorder(BorderFactory.createTitledBorder("Student id:"));

        searchButton.setIcon(new ImageIcon(getClass().getResource("/pages/search.png"))); // NOI18N

        GroupLayout searchPanelLayout = new GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(searchPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(firstnameTextField, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastnameTextField, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentIdTextField, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, searchPanelLayout.createSequentialGroup()
                                .addContainerGap(10, Short.MAX_VALUE)
                                .addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(firstnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lastnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(studentIdTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(261, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
                                                .addGap(257, 257, 257))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(searchPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(numberOfPassedUnitsTextField, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(weightedTotalAverageTextField, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(209, 209, 209))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(weightedTotalAverageTextField, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numberOfPassedUnitsTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }
}
