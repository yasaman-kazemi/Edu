package Graphic;

import javax.swing.*;

public class StudentRequestPage extends JPanel {
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JTextArea requestTextArea;
    private javax.swing.JTextField requestTypeTextField;
    private javax.swing.JTextArea responseTextArea;
    private javax.swing.JButton sendButton;

    public StudentRequestPage() {
        initComponents();
    }

    private void initComponents() {
        requestTypeTextField = new javax.swing.JTextField();
        scrollPane1 = new javax.swing.JScrollPane();
        requestTextArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        scrollPane2 = new javax.swing.JScrollPane();
        responseTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        requestTypeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Request for:"));
        requestTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTypeTextFieldActionPerformed(evt);
            }
        });

        requestTextArea.setColumns(20);
        requestTextArea.setRows(5);
        scrollPane1.setViewportView(requestTextArea);

        sendButton.setBackground(new java.awt.Color(213, 249, 212));
        sendButton.setText("Send");

        responseTextArea.setColumns(20);
        responseTextArea.setRows(5);
        responseTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Response:"));
        scrollPane2.setViewportView(responseTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(186, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(requestTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sendButton)))
                                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(requestTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(45, Short.MAX_VALUE))
        );
    }

    private void requestTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}
