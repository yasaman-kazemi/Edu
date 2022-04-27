package Graphic.pages;

import model.pages.reportedCardAffairs.TemporaryScoresPage;

import javax.swing.*;

public class MasterTemporaryScorePage extends MyPanel {
    private JTextField courseNameTextField;
    private JScrollPane scrollPane1;
    private JScrollPane scrollPane2;
    private JTextArea protestResponseTextArea;
    private JButton sendButton;
    private JTable temporaryScoresTable;

    public MasterTemporaryScorePage(TemporaryScoresPage temporaryScoresPage) {
        super(temporaryScoresPage);
        initComponents();
    }

    private void initComponents() {
        scrollPane1 = new JScrollPane();
        temporaryScoresTable = new JTable();
        courseNameTextField = new JTextField();
        scrollPane2 = new JScrollPane();
        protestResponseTextArea = new JTextArea();
        sendButton = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        temporaryScoresTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                },
                new String[]{
                        "Students", "Temporary scores", "Protest"
                }
        ));
        scrollPane1.setViewportView(temporaryScoresTable);

        courseNameTextField.setForeground(new java.awt.Color(204, 204, 204));
        courseNameTextField.setText("Student name");
        courseNameTextField.setBorder(BorderFactory.createTitledBorder("Response for:"));

        protestResponseTextArea.setColumns(20);
        protestResponseTextArea.setRows(5);
        scrollPane2.setViewportView(protestResponseTextArea);

        sendButton.setBackground(new java.awt.Color(203, 238, 203));
        sendButton.setText("Send");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(179, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(courseNameTextField, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 780, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(sendButton)
                                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 780, GroupLayout.PREFERRED_SIZE)))
                                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton)
                                .addGap(8, 8, 8))
        );
    }
}
