package Graphic.pages;

import javax.swing.*;

public class ExamListPage extends MyPanel {
    private javax.swing.JList<String> examList;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField titleTextField;

    public ExamListPage(model.pages.educationalServices.ExamListPage examListPage) {
        super(examListPage);
        initComponents();
    }

    private void initComponents() {
        scrollPane = new javax.swing.JScrollPane();
        examList = new javax.swing.JList<>();
        titleTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        scrollPane.setViewportView(examList);

        titleTextField.setEditable(false);
        titleTextField.setBackground(new java.awt.Color(222, 235, 241));
        titleTextField.setText("Exam list sorted by time:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(263, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }
}
