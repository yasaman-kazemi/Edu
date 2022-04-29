package Graphic.pages;

import model.course.Assignment;

import javax.swing.*;
import java.util.ArrayList;

public class ExamListPage extends MyPanel {
    private JList<String> examList;
    private DefaultListModel<String> listModel;
    private JScrollPane scrollPane;
    private JTextField titleTextField;

    public ExamListPage(model.pages.educationalServices.ExamListPage examListPage) {
        super(examListPage);
        initComponents();
    }

    private void initComponents() {
        scrollPane = new JScrollPane();
        listModel = new DefaultListModel<>();
        fillListModel();
        examList = new JList<>(listModel);
        titleTextField = new JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        scrollPane.setViewportView(examList);

        titleTextField.setEditable(false);
        titleTextField.setBackground(new java.awt.Color(222, 235, 241));
        titleTextField.setText("Exam list sorted by time:");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(263, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(titleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 600, GroupLayout.PREFERRED_SIZE))
                                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(titleTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }

    //todo i love you.
    private void fillListModel() {
        listModel.clear();
        model.pages.educationalServices.ExamListPage examListPage =
                (model.pages.educationalServices.ExamListPage) page;
        ArrayList<Assignment> exams = examListPage.getExamList();
        ArrayList<String> showExams = showExams(exams);
        for (String showExam : showExams) {
            listModel.addElement(showExam);
        }
    }

    private ArrayList<String> showExams(ArrayList<Assignment> exams) {
        ArrayList<String> result = new ArrayList<>();
        for (Assignment exam : exams) {
            String row = exam.getStart() + " -> " + exam.getDeadline() + " : " + exam.getCourse();
            result.add(row);
        }
        return result;
    }
}
