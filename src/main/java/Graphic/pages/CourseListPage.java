package Graphic.pages;

import model.course.Course;
import utils.ImageLoader;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class CourseListPage extends MyPanel {
    private DefaultListModel<String> listModel;
    private JList<String> courseFilteredList;
    private JScrollPane scrollPane;
    private JButton searchButton;
    private JPanel searchPanel;
    private JTextField searchWithCourseIdTextField;
    private JTextField searchWithDepartmentTextField;
    private JTextField searchWithGradeTextField;

    public CourseListPage(model.pages.registrationAffairs.CourseListPage courseListPage) {
        super(courseListPage);
        initComponents();
    }

    private void initComponents() {
        searchButton = new JButton();
        scrollPane = new JScrollPane();
        listModel = new DefaultListModel<>();
        courseFilteredList = new JList<>(listModel);
        searchPanel = new JPanel();
        searchWithCourseIdTextField = new JTextField();
        searchWithDepartmentTextField = new JTextField();
        searchWithGradeTextField = new JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        searchButton.setIcon(new ImageIcon(ImageLoader.getImageAddresses().get("search_image")));
        searchButton.addActionListener(this::search);

        courseFilteredList.setPreferredSize(new java.awt.Dimension(470, 631));
        courseFilteredList.setVisibleRowCount(10);
        scrollPane.setViewportView(courseFilteredList);

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchWithCourseIdTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithCourseIdTextField.setBorder(BorderFactory.createTitledBorder("Course id:"));
        searchWithCourseIdTextField.setPreferredSize(new java.awt.Dimension(150, 29));

        searchWithDepartmentTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithDepartmentTextField.setBorder(BorderFactory.createTitledBorder("Department:"));
        searchWithDepartmentTextField.setPreferredSize(new java.awt.Dimension(150, 29));

        searchWithGradeTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithGradeTextField.setBorder(BorderFactory.createTitledBorder("Grade:"));
        searchWithGradeTextField.setPreferredSize(new java.awt.Dimension(150, 29));

        GroupLayout searchPanelLayout = new GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(searchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(searchWithCourseIdTextField, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                        .addComponent(searchWithGradeTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchWithDepartmentTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(searchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchWithCourseIdTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchWithGradeTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchWithDepartmentTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(234, Short.MAX_VALUE)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 643, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    private void search(ActionEvent e) {
        listModel.clear();
        model.pages.registrationAffairs.CourseListPage courseListPage =
                (model.pages.registrationAffairs.CourseListPage) page;
        setFilters(courseListPage, searchWithCourseIdTextField.getText(), searchWithDepartmentTextField.getText(),
                searchWithGradeTextField.getText());
        ArrayList<Course> matchedCourses = courseListPage.search();
        ArrayList<String> showCourses = showCourses(matchedCourses);
        for (String course : showCourses) {
            listModel.addElement(course);
        }
    }

    private void setFilters(model.pages.registrationAffairs.CourseListPage courseListPage, String courseId, String department, String grade) {
        courseListPage.setCourseId(courseId);
        courseListPage.setDepartment(department);
        courseListPage.setGrade(grade);
    }

    private ArrayList<String> showCourses(ArrayList<Course> matchedCourses) {
        ArrayList<String> result = new ArrayList<>();
        for (Course course : matchedCourses) {
            String row = course.getName() + " | " + course.getId() + " | " + course.getDepartment() + " | "
                    + course.getMaster().getFirstname() + " " + course.getMaster().getLastname() + " | " + course.getCourseCredit() + " | " + course.getGrade();
            result.add(row);
        }
        return result;
    }
}
