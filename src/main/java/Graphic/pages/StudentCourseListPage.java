package Graphic.pages;

import javax.swing.*;

public class StudentCourseListPage extends JPanel {
    private javax.swing.JList<String> courseFilteredList;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchWithCourseIdTextField;
    private javax.swing.JTextField searchWithDepartmentTextField;
    private javax.swing.JTextField searchWithGradeTextField;

    public StudentCourseListPage() {
        initComponents();
    }

    private void initComponents() {
        searchButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        courseFilteredList = new javax.swing.JList<>();
        searchPanel = new javax.swing.JPanel();
        searchWithCourseIdTextField = new javax.swing.JTextField();
        searchWithDepartmentTextField = new javax.swing.JTextField();
        searchWithGradeTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages/search.png"))); // NOI18N

        courseFilteredList.setPreferredSize(new java.awt.Dimension(470, 631));
        courseFilteredList.setVisibleRowCount(10);
        scrollPane.setViewportView(courseFilteredList);

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchWithCourseIdTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithCourseIdTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Course id:"));
        searchWithCourseIdTextField.setPreferredSize(new java.awt.Dimension(150, 29));
        searchWithCourseIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWithCourseIdTextFieldActionPerformed(evt);
            }
        });

        searchWithDepartmentTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithDepartmentTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Department:"));
        searchWithDepartmentTextField.setPreferredSize(new java.awt.Dimension(150, 29));
        searchWithDepartmentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWithDepartmentTextFieldActionPerformed(evt);
            }
        });

        searchWithGradeTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithGradeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Grade:"));
        searchWithGradeTextField.setPreferredSize(new java.awt.Dimension(150, 29));
        searchWithGradeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWithGradeTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
                searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchWithCourseIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                        .addComponent(searchWithGradeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchWithDepartmentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
                searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchWithCourseIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchWithGradeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchWithDepartmentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(234, Short.MAX_VALUE)
                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    private void searchWithCourseIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchWithDepartmentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchWithGradeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}
