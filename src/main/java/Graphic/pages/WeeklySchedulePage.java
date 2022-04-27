package Graphic.pages;

import javax.swing.*;

public class WeeklySchedulePage extends MyPanel {
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable weeklyScheduleTable;

    public WeeklySchedulePage(model.pages.educationalServices.WeeklySchedulePage weeklySchedulePage) {
        super(weeklySchedulePage);
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        weeklyScheduleTable = new JTable();

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        weeklyScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null}
                },
                new String [] {
                        "Time", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"
                }
        ));
        jScrollPane1.setViewportView(weeklyScheduleTable);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(223, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(113, Short.MAX_VALUE))
        );
    }
}
