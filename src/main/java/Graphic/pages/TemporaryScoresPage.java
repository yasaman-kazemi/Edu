package Graphic.pages;
import model.course.Score;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TemporaryScoresPage extends MyPanel {
    private JTextField courseNameTextField;
    private JScrollPane scrollPane1;
    private JScrollPane scrollPane2;
    private JTextArea protestResponseTextArea;
    private JButton sendButton;
    private JTable temporaryScoresTable;

    public TemporaryScoresPage(model.pages.reportedCardAffairs.TemporaryScoresPage temporaryScoresPage) {
        super(temporaryScoresPage);
        initComponents();
    }

    private void initComponents() {
        scrollPane1 = new JScrollPane();
        temporaryScoresTable = new JTable();
        courseNameTextField = new JTextField();
        scrollPane2 = new JScrollPane();
        protestResponseTextArea = new JTextArea();
        sendButton = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));
        model.pages.reportedCardAffairs.TemporaryScoresPage temporaryScoresPage =
                (model.pages.reportedCardAffairs.TemporaryScoresPage) page;
        ArrayList<Score> scores = temporaryScoresPage.getAllTemporaryScores();
        String[][] table = new String[scores.size()][4];
        for (int i = 0; i < scores.size(); i++) {
            Score score = scores.get(i);
            table[i][0] = score.getCourse().getId();
            table[i][1] = score.getCourse().getName();
            table[i][2] = String.valueOf(score.getScore());
            table[i][3] = String.valueOf(score.getProtestRespond());
        }

        temporaryScoresTable.setModel(new javax.swing.table.DefaultTableModel(
                table,
                new String[]{
                        "Course id", "Course name", "Score", "Protest response"
                }
        ));
        scrollPane1.setViewportView(temporaryScoresTable);

        courseNameTextField.setForeground(new java.awt.Color(204, 204, 204));
        courseNameTextField.setBorder(BorderFactory.createTitledBorder("Protest for:"));

        protestResponseTextArea.setColumns(20);
        protestResponseTextArea.setRows(5);
        scrollPane2.setViewportView(protestResponseTextArea);

        sendButton.setBackground(new java.awt.Color(203, 238, 203));
        sendButton.setText("Send");
        sendButton.addActionListener(this::sendActionPerformed);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(179, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(courseNameTextField, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 780, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(sendButton)
                                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 780, GroupLayout.PREFERRED_SIZE)))
                                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(12, Short.MAX_VALUE)
                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(courseNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendButton)
                                .addGap(8, 8, 8))
        );
    }

    private void sendActionPerformed(ActionEvent e) {
        model.pages.reportedCardAffairs.TemporaryScoresPage temporaryScoresPage =
                (model.pages.reportedCardAffairs.TemporaryScoresPage) page;
        String courseName = courseNameTextField.getText();
        String protest = protestResponseTextArea.getText();
        for (Score score : temporaryScoresPage.getAllTemporaryScores()) {
            if (score.getCourse().getName().equalsIgnoreCase(courseName)) {
                temporaryScoresPage.setProtest(score, protest);
                break;
            }
        }
    }
}
