package Graphic.pages;

import model.pages.educationalServices.RequestsPage;

import javax.swing.*;

public class MasterRequestPage extends MyPanel {
    private JScrollPane scrollPane1;
    private JScrollPane scrollPane2;
    private JTextArea requestTextArea;
    private JTextArea responseTextArea;
    private JButton sendButton;

    public MasterRequestPage(RequestsPage requestsPage) {
        super(requestsPage);
        initComponents();
    }

    private void initComponents() {
        scrollPane1 = new JScrollPane();
        requestTextArea = new JTextArea();
        sendButton = new JButton();
        scrollPane2 = new JScrollPane();
        responseTextArea = new JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        requestTextArea.setEditable(false);
        requestTextArea.setBackground(new java.awt.Color(255, 255, 255));
        requestTextArea.setColumns(20);
        requestTextArea.setRows(5);
        requestTextArea.setBorder(BorderFactory.createTitledBorder("Request:"));
        scrollPane1.setViewportView(requestTextArea);

        sendButton.setBackground(new java.awt.Color(213, 249, 212));
        sendButton.setText("Send");

        responseTextArea.setColumns(20);
        responseTextArea.setRows(5);
        responseTextArea.setBorder(BorderFactory.createTitledBorder("Response:"));
        scrollPane2.setViewportView(responseTextArea);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sendButton)
                                .addGap(176, 176, 176))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 196, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 750, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 750, GroupLayout.PREFERRED_SIZE))
                                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton)
                                .addGap(24, 24, 24))
        );
    }
}
