package Graphic.pages;

import model.pages.educationalServices.RequestsPage;

import javax.swing.*;

public class MasterRequestPage extends MyPanel {
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JTextArea requestTextArea;
    private javax.swing.JTextArea responseTextArea;
    private javax.swing.JButton sendButton;

    public MasterRequestPage(RequestsPage requestsPage) {
        super(requestsPage);
        initComponents();
    }

    private void initComponents() {
        scrollPane1 = new javax.swing.JScrollPane();
        requestTextArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        scrollPane2 = new javax.swing.JScrollPane();
        responseTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        requestTextArea.setEditable(false);
        requestTextArea.setBackground(new java.awt.Color(255, 255, 255));
        requestTextArea.setColumns(20);
        requestTextArea.setRows(5);
        requestTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Request:"));
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sendButton)
                                .addGap(176, 176, 176))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 196, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(scrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton)
                                .addGap(24, 24, 24))
        );
    }
}
