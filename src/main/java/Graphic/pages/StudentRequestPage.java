package Graphic.pages;

import model.pages.mainPage.MainPage;

public class StudentRequestPage extends MyPanel {
    private javax.swing.JScrollPane scrollPane1;
    private javax.swing.JScrollPane scrollPane2;
    private javax.swing.JTextArea requestTextArea;
    private javax.swing.JComboBox<String> requestTypeComboBox;
    private javax.swing.JTextField requestTypeTextField;
    private javax.swing.JTextArea responseTextArea;
    private javax.swing.JButton sendButton;

    public StudentRequestPage(MainPage mainPage) {
        super(mainPage);
        initComponents();
    }

    private void initComponents() {
        requestTypeComboBox = new javax.swing.JComboBox<>();
        requestTypeTextField = new javax.swing.JTextField();
        scrollPane1 = new javax.swing.JScrollPane();
        requestTextArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        scrollPane2 = new javax.swing.JScrollPane();
        responseTextArea = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        requestTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accommodation request", "Certificate student request", "Minor request", "Quit request", "Recommendation request", "ThesisDefense request" }));

        requestTypeTextField.setEditable(false);
        requestTypeTextField.setBackground(new java.awt.Color(204, 204, 204));
        requestTypeTextField.setText("Choose your request type:");

        requestTextArea.setColumns(20);
        requestTextArea.setRows(5);
        requestTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Request:"));
        scrollPane1.setViewportView(requestTextArea);

        sendButton.setBackground(new java.awt.Color(204, 255, 204));
        sendButton.setText("Send");

        responseTextArea.setEditable(false);
        responseTextArea.setBackground(new java.awt.Color(255, 255, 255));
        responseTextArea.setColumns(20);
        responseTextArea.setRows(5);
        responseTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Response:"));
        scrollPane2.setViewportView(responseTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(462, 462, 462)
                                .addComponent(requestTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(450, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(requestTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(443, 443, 443))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(sendButton)
                                                .addContainerGap())))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(scrollPane1)
                                        .addComponent(scrollPane2))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(requestTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(requestTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
        );
    }

    private void requestTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
}
