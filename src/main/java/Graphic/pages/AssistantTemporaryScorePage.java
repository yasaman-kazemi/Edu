package Graphic.pages;

import model.pages.reportedCardAffairs.TemporaryScoresPage;

import javax.swing.*;

public class AssistantTemporaryScorePage extends MyPanel {
    private JTextField courseNameForSearchTextField;
    private JTextField courseNameForSummaryTextField;
    private JScrollPane jScrollPane2;
    private JTextField masterNameTextField;
    private JTextField numberOfFailedPeopleTextField;
    private JTextField numberOfPassedPeopleTextField;
    private JPanel scoreFiltersPanel;
    private JTable scoreTable;
    private JButton searchButtonForSummary;
    private JButton searchButtonForTable;
    private JTextField studentNameTextField;
    private JTextField totalAverageTextField;
    private JTextField totalAverageWithoutFailuresTextField;

    public AssistantTemporaryScorePage(TemporaryScoresPage temporaryScoresPage) {
        super(temporaryScoresPage);
        initComponents();
    }

    private void initComponents() {
        jScrollPane2 = new JScrollPane();
        scoreTable = new JTable();
        scoreFiltersPanel = new JPanel();
        courseNameForSearchTextField = new JTextField();
        studentNameTextField = new JTextField();
        masterNameTextField = new JTextField();
        searchButtonForTable = new JButton();
        totalAverageTextField = new JTextField();
        courseNameForSummaryTextField = new JTextField();
        numberOfPassedPeopleTextField = new JTextField();
        numberOfFailedPeopleTextField = new JTextField();
        totalAverageWithoutFailuresTextField = new JTextField();
        searchButtonForSummary = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        scoreTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Name", "Score", "Protest", "Response"
                }
        ));
        jScrollPane2.setViewportView(scoreTable);

        scoreFiltersPanel.setBackground(new java.awt.Color(255, 255, 255));

        courseNameForSearchTextField.setBorder(BorderFactory.createTitledBorder("Course:"));

        studentNameTextField.setBorder(BorderFactory.createTitledBorder("Student:"));
        studentNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameTextFieldActionPerformed(evt);
            }
        });

        masterNameTextField.setBorder(BorderFactory.createTitledBorder("Master:"));

        searchButtonForTable.setIcon(new ImageIcon(getClass().getResource("/pages/search.png"))); // NOI18N

        GroupLayout scoreFiltersPanelLayout = new GroupLayout(scoreFiltersPanel);
        scoreFiltersPanel.setLayout(scoreFiltersPanelLayout);
        scoreFiltersPanelLayout.setHorizontalGroup(
                scoreFiltersPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(scoreFiltersPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(courseNameForSearchTextField, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentNameTextField, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(masterNameTextField)
                                .addContainerGap())
                        .addGroup(scoreFiltersPanelLayout.createSequentialGroup()
                                .addContainerGap(98, Short.MAX_VALUE)
                                .addComponent(searchButtonForTable, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))
        );
        scoreFiltersPanelLayout.setVerticalGroup(
                scoreFiltersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(scoreFiltersPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(scoreFiltersPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(scoreFiltersPanelLayout.createSequentialGroup()
                                                .addComponent(studentNameTextField)
                                                .addGap(11, 11, 11))
                                        .addComponent(courseNameForSearchTextField, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(masterNameTextField, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
                                .addComponent(searchButtonForTable))
        );

        totalAverageTextField.setForeground(new java.awt.Color(204, 204, 204));
        totalAverageTextField.setBorder(BorderFactory.createTitledBorder("Total average:"));

        courseNameForSummaryTextField.setForeground(new java.awt.Color(204, 204, 204));
        courseNameForSummaryTextField.setText("Search for summary");
        courseNameForSummaryTextField.setBorder(BorderFactory.createTitledBorder("Course:"));

        numberOfPassedPeopleTextField.setForeground(new java.awt.Color(204, 204, 204));
        numberOfPassedPeopleTextField.setBorder(BorderFactory.createTitledBorder("Number of passed people:"));
        numberOfPassedPeopleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfPassedPeopleTextFieldActionPerformed(evt);
            }
        });

        numberOfFailedPeopleTextField.setForeground(new java.awt.Color(204, 204, 204));
        numberOfFailedPeopleTextField.setBorder(BorderFactory.createTitledBorder("Number of failed people:"));

        totalAverageWithoutFailuresTextField.setForeground(new java.awt.Color(204, 204, 204));
        totalAverageWithoutFailuresTextField.setBorder(BorderFactory.createTitledBorder("Total avarage without failures:"));

        searchButtonForSummary.setIcon(new ImageIcon(getClass().getResource("/pages/search.png"))); // NOI18N

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(totalAverageTextField, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numberOfPassedPeopleTextField, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numberOfFailedPeopleTextField, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(totalAverageWithoutFailuresTextField, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(courseNameForSummaryTextField, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchButtonForSummary, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jScrollPane2))
                                        .addComponent(scoreFiltersPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(searchButtonForSummary, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(courseNameForSummaryTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totalAverageTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totalAverageWithoutFailuresTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(numberOfFailedPeopleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(numberOfPassedPeopleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(scoreFiltersPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)))
                                .addContainerGap())
        );
    }

    private void numberOfPassedPeopleTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void studentNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}
