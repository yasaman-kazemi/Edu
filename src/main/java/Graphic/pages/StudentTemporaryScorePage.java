package Graphic.pages;

import javax.swing.*;

public class StudentTemporaryScorePage extends JPanel {
    private javax.swing.JTextField courseNameTextField;
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JTextArea protestResponseTextArea;
    private javax.swing.JButton sendButton;
    private javax.swing.JTable temporaryScoresTable;

    public StudentTemporaryScorePage() {
        initComponents();
    }

    private void initComponents() {
        scrollPane1 = new javax.swing.JScrollPane();
        temporaryScoresTable = new javax.swing.JTable();
        courseNameTextField = new javax.swing.JTextField();
        scrollPane2 = new javax.swing.JScrollPane();
        protestResponseTextArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        temporaryScoresTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Course id", "Course name", "Score", "Protest response"
                }
        ));
        scrollPane1.setViewportView(temporaryScoresTable);

        courseNameTextField.setForeground(new java.awt.Color(204, 204, 204));
        courseNameTextField.setText("Course Name");
        courseNameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Protest for:"));

        protestResponseTextArea.setColumns(20);
        protestResponseTextArea.setRows(5);
        scrollPane2.setViewportView(protestResponseTextArea);

        sendButton.setBackground(new java.awt.Color(203, 238, 203));
        sendButton.setText("Send");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(179, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(courseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(sendButton)
                                                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton)
                                .addGap(8, 8, 8))
        );
    }
}
