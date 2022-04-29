package Graphic.pages;

import model.course.Course;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class WeeklySchedulePage extends MyPanel {
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable weeklyScheduleTable;

    public WeeklySchedulePage(model.pages.educationalServices.WeeklySchedulePage weeklySchedulePage) {
        super(weeklySchedulePage);
        initComponents();
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        weeklyScheduleTable = new JTable();

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));
        model.pages.educationalServices.WeeklySchedulePage weeklySchedulePage =
                (model.pages.educationalServices.WeeklySchedulePage) page;
        ArrayList<Course> weeklyClasses = weeklySchedulePage.getCourseList();
        String[][] table = new String[][]{
                {"7:00", null, null, null, null, null},
                {"8:00", null, null, null, null, null},
                {"9:00", null, null, null, null, null},
                {"10:00", null, null, null, null, null},
                {"11:00", null, null, null, null, null},
                {"12:00", null, null, null, null, null},
                {"13:00", null, null, null, null, null},
                {"14:00", null, null, null, null, null},
                {"15:00", null, null, null, null, null},
                {"16:00", null, null, null, null, null},
                {"17:00", null, null, null, null, null},
                {"18:00", null, null, null, null, null},
                {"19:00", null, null, null, null, null}
        };
        for (Course course : weeklyClasses) {
            for (Date date : course.getWeeklyClassDate()) {
                String[] values = date.toString().split("\\s");
                String day = values[0];
                int y;
                if (day.startsWith("Sat")) {
                    y = 1;
                } else if (day.startsWith("Sun")) {
                    y = 2;
                } else if (day.startsWith("Mon")) {
                    y = 3;
                } else if (day.startsWith("Tue")) {
                    y = 4;
                } else {
                    y = 5;
                }
                String hour = values[3].split(":")[0];
                int x = Integer.parseInt(hour) - 7;
                table[x][y] = course.getName();
            }
        }
        weeklyScheduleTable.setModel(new javax.swing.table.DefaultTableModel(
                table,
                new String[]{
                        "Time", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"
                }
        ));
        jScrollPane1.setViewportView(weeklyScheduleTable);

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(223, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 700, GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(113, Short.MAX_VALUE))
        );
    }
}
