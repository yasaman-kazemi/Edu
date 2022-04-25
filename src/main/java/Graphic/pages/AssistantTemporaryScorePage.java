package Graphic.pages;

import javax.swing.*;

public class AssistantTemporaryScorePage extends JPanel {
    private javax.swing.JTextField courseNameForSearchTextField;
    private javax.swing.JTextField courseNameForSummaryTextField;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField masterNameTextField;
    private javax.swing.JTextField numberOfFailedPeopleTextField;
    private javax.swing.JTextField numberOfPassedPeopleTextField;
    private javax.swing.JPanel scoreFiltersPanel;
    private javax.swing.JTable scoreTable;
    private javax.swing.JButton searchButtonForSummary;
    private javax.swing.JButton searchButtonForTable;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JTextField totalAverageTextField;
    private javax.swing.JTextField totalAverageWithoutFailuresTextField;

    public AssistantTemporaryScorePage() {
        initComponents();
    }

    private void initComponents() {
        jScrollPane2 = new javax.swing.JScrollPane();
        scoreTable = new javax.swing.JTable();
        scoreFiltersPanel = new javax.swing.JPanel();
        courseNameForSearchTextField = new javax.swing.JTextField();
        studentNameTextField = new javax.swing.JTextField();
        masterNameTextField = new javax.swing.JTextField();
        searchButtonForTable = new javax.swing.JButton();
        totalAverageTextField = new javax.swing.JTextField();
        courseNameForSummaryTextField = new javax.swing.JTextField();
        numberOfPassedPeopleTextField = new javax.swing.JTextField();
        numberOfFailedPeopleTextField = new javax.swing.JTextField();
        totalAverageWithoutFailuresTextField = new javax.swing.JTextField();
        searchButtonForSummary = new javax.swing.JButton();

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

        courseNameForSearchTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Course:"));

        studentNameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Student:"));
        studentNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentNameTextFieldActionPerformed(evt);
            }
        });

        masterNameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Master:"));

        searchButtonForTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages/search.png"))); // NOI18N

        javax.swing.GroupLayout scoreFiltersPanelLayout = new javax.swing.GroupLayout(scoreFiltersPanel);
        scoreFiltersPanel.setLayout(scoreFiltersPanelLayout);
        scoreFiltersPanelLayout.setHorizontalGroup(
                scoreFiltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(scoreFiltersPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(courseNameForSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(masterNameTextField)
                                .addContainerGap())
                        .addGroup(scoreFiltersPanelLayout.createSequentialGroup()
                                .addContainerGap(98, Short.MAX_VALUE)
                                .addComponent(searchButtonForTable, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))
        );
        scoreFiltersPanelLayout.setVerticalGroup(
                scoreFiltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(scoreFiltersPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(scoreFiltersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(scoreFiltersPanelLayout.createSequentialGroup()
                                                .addComponent(studentNameTextField)
                                                .addGap(11, 11, 11))
                                        .addComponent(courseNameForSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(masterNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(searchButtonForTable))
        );

        totalAverageTextField.setForeground(new java.awt.Color(204, 204, 204));
        totalAverageTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Total average:"));

        courseNameForSummaryTextField.setForeground(new java.awt.Color(204, 204, 204));
        courseNameForSummaryTextField.setText("Search for summary");
        courseNameForSummaryTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Course:"));

        numberOfPassedPeopleTextField.setForeground(new java.awt.Color(204, 204, 204));
        numberOfPassedPeopleTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Number of passed people:"));
        numberOfPassedPeopleTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfPassedPeopleTextFieldActionPerformed(evt);
            }
        });

        numberOfFailedPeopleTextField.setForeground(new java.awt.Color(204, 204, 204));
        numberOfFailedPeopleTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Number of failed people:"));

        totalAverageWithoutFailuresTextField.setForeground(new java.awt.Color(204, 204, 204));
        totalAverageWithoutFailuresTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Total avarage without failures:"));

        searchButtonForSummary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages/search.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(totalAverageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numberOfPassedPeopleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numberOfFailedPeopleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(totalAverageWithoutFailuresTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(courseNameForSummaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchButtonForSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jScrollPane2))
                                        .addComponent(scoreFiltersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(12, 12, 12)
                                                                .addComponent(searchButtonForSummary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(courseNameForSummaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totalAverageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totalAverageWithoutFailuresTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(numberOfFailedPeopleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(numberOfPassedPeopleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(scoreFiltersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)))
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
