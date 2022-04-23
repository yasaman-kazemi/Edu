package Graphic.pages;

import javax.swing.*;

public class StudentMasterListPage extends JPanel {
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JList<String> masterFilteredList;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JTextField searchWithDepartmentTextField;
    private javax.swing.JTextField searchWithFirstnameTextField;
    private javax.swing.JTextField searchWithLastnameTextField;
    private javax.swing.JTextField searchWithMasterDegreeTextField;

    public StudentMasterListPage() {
        initComponents();
    }

    private void initComponents() {
        searchButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        masterFilteredList = new javax.swing.JList<>();
        searchPanel = new javax.swing.JPanel();
        searchWithFirstnameTextField = new javax.swing.JTextField();
        searchWithMasterDegreeTextField = new javax.swing.JTextField();
        searchWithDepartmentTextField = new javax.swing.JTextField();
        searchWithLastnameTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages/search.png"))); // NOI18N

        masterFilteredList.setPreferredSize(new java.awt.Dimension(470, 631));
        scrollPane.setViewportView(masterFilteredList);

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchWithFirstnameTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithFirstnameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Firstname:"));
        searchWithFirstnameTextField.setPreferredSize(new java.awt.Dimension(150, 29));
        searchWithFirstnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWithFirstnameTextFieldActionPerformed(evt);
            }
        });

        searchWithMasterDegreeTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithMasterDegreeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Master degree:"));
        searchWithMasterDegreeTextField.setPreferredSize(new java.awt.Dimension(150, 29));
        searchWithMasterDegreeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWithMasterDegreeTextFieldActionPerformed(evt);
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

        searchWithLastnameTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithLastnameTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Lastname:"));
        searchWithLastnameTextField.setPreferredSize(new java.awt.Dimension(150, 29));
        searchWithLastnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchWithLastnameTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
                searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchWithFirstnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                        .addComponent(searchWithLastnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchWithMasterDegreeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchWithDepartmentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
                searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(searchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchWithFirstnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchWithLastnameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchWithMasterDegreeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchWithDepartmentTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(scrollPane)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 370, Short.MAX_VALUE)))
                                .addContainerGap())
        );
    }

    private void searchWithFirstnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchWithMasterDegreeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchWithDepartmentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void searchWithLastnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

}
