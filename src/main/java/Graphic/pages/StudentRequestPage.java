package Graphic.pages;

import model.pages.mainPage.MainPage;

import javax.swing.*;

public class StudentRequestPage extends MyPanel {
    private JScrollPane scrollPane1;
    private JScrollPane scrollPane2;
    private JTextArea requestTextArea;
    private JTextField requestTypeTextField;
    private JTextArea responseTextArea;
    private JButton sendButton;

    public StudentRequestPage(MainPage mainPage) {
        super(mainPage);
        initComponents();
    }

    private void initComponents() {
        requestTypeTextField = new JTextField();
        scrollPane1 = new JScrollPane();
        requestTextArea = new JTextArea();
        sendButton = new JButton();
        scrollPane2 = new JScrollPane();
        responseTextArea = new JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        requestTypeTextField.setBorder(BorderFactory.createTitledBorder("Request for:"));
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
        responseTextArea.setBorder(BorderFactory.createTitledBorder("Response:"));
        scrollPane2.setViewportView(responseTextArea);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(186, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(requestTypeTextField, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 750, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 750, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sendButton)))
                                .addGap(176, 176, 176))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(requestTypeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(45, Short.MAX_VALUE))
        );
    }

    private void requestTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}
