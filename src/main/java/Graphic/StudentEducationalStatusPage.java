package Graphic;

import javax.swing.*;

public class StudentEducationalStatusPage extends JPanel {
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JTextField numberOfPassedUnitsTextField;
    private javax.swing.JTable scoreTable;
    private javax.swing.JTextField weightedTotalAverageTextField;

    public StudentEducationalStatusPage() {
        initComponents();
    }

    private void initComponents() {
        numberOfPassedUnitsTextField = new javax.swing.JTextField();
        weightedTotalAverageTextField = new javax.swing.JTextField();
        scrollPane1 = new javax.swing.JScrollPane();
        scoreTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        numberOfPassedUnitsTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Number of passed units:"));

        weightedTotalAverageTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Weighted total average:"));

        scoreTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Score", "Status"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scrollPane1.setViewportView(scoreTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(305, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(257, 257, 257))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(numberOfPassedUnitsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(weightedTotalAverageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(392, 392, 392))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numberOfPassedUnitsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(weightedTotalAverageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }
}
