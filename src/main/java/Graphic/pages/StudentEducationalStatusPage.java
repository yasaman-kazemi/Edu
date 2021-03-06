package Graphic.pages;

import model.course.Score;
import model.course.ScoreStatus;
import model.pages.mainPage.EducationalStatus;
import model.person.student.Student;

import javax.swing.*;
import java.util.ArrayList;

public class StudentEducationalStatusPage extends MyPanel {
    private JScrollPane scrollPane1;
    private JTextField numberOfPassedUnitsTextField;
    private JTable scoreTable;
    private JTextField weightedTotalAverageTextField;

    public StudentEducationalStatusPage(model.pages.reportedCardAffairs.StudentEducationalStatusPage studentEducationalStatusPage) {
        super(studentEducationalStatusPage);
        initComponents();
    }

    private void initComponents() {
        numberOfPassedUnitsTextField = new JTextField();
        weightedTotalAverageTextField = new JTextField();
        scrollPane1 = new JScrollPane();
        scoreTable = new JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        numberOfPassedUnitsTextField.setBorder(BorderFactory.createTitledBorder("Number of passed units:"));
        Student student = (Student) page.getUser();
        numberOfPassedUnitsTextField.setText(String.valueOf(student.getTotalPassedCredit()));

        weightedTotalAverageTextField.setBorder(BorderFactory.createTitledBorder("Weighted total average:"));
        weightedTotalAverageTextField.setText(String.valueOf(student.getTotalAverageScore()));
        model.pages.reportedCardAffairs.StudentEducationalStatusPage studentEducationalStatusPage =
                (model.pages.reportedCardAffairs.StudentEducationalStatusPage) page;
        ArrayList<Score> allFinalizedScores = studentEducationalStatusPage.getAllFinalizedScores();
        String[][] table = new String[allFinalizedScores.size()][2];
        for (int i = 0; i < allFinalizedScores.size(); i++) {
            Score score = allFinalizedScores.get(i);
            table[i][0] = score.getCourse().getName() + " : " + score.getScore();
            if (score.getScore() >= 10) {
                table[i][1] = "Passed";
            } else {
                table[i][1] = "failed";
            }
        }
        scoreTable.setModel(new javax.swing.table.DefaultTableModel(
                table,
                new String[]{
                        "Score", "Status"
                }
        ));
        scrollPane1.setViewportView(scoreTable);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(305, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 550, GroupLayout.PREFERRED_SIZE)
                                                .addGap(257, 257, 257))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(numberOfPassedUnitsTextField, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(weightedTotalAverageTextField, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE))
                                                .addGap(392, 392, 392))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(numberOfPassedUnitsTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(weightedTotalAverageTextField, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }
}
