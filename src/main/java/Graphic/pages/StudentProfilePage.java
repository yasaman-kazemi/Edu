package Graphic.pages;

import model.person.User;
import model.person.master.Master;
import model.person.student.Student;
import model.person.student.StudentStatus;
import utils.ImageLoader;

import javax.swing.*;

public class StudentProfilePage extends MyPanel {
    private JButton changeThemeButton;
    private JTextField departmentTextField;
    private JTextField educationalStatusTextField;
    private JButton emailChangeButton;
    private JTextField emailTextField;
    private JTextField enteryYearTextField;
    private JTextField firstnameTextField;
    private JTextField gradeTextField;
    private JTextField guideMasterTextField;
    private JTextField idTextField;
    private JTextField identityCodeTextField;
    private JTextField lastnameTextField;
    private JButton phoneNumberChangeButton;
    private JTextField phoneNumberTextField;
    private JTextField totalAverageTextField;
    private JLabel userPhoto;

    public StudentProfilePage(model.pages.profilePage.StudentProfilePage studentProfilePage) {
        super(studentProfilePage);
        initComponents();
    }

    private void initComponents() {
        userPhoto = new JLabel();
        firstnameTextField = new JTextField();
        lastnameTextField = new JTextField();
        identityCodeTextField = new JTextField();
        idTextField = new JTextField();
        phoneNumberTextField = new JTextField();
        emailTextField = new JTextField();
        totalAverageTextField = new JTextField();
        departmentTextField = new JTextField();
        guideMasterTextField = new JTextField();
        enteryYearTextField = new JTextField();
        gradeTextField = new JTextField();
        educationalStatusTextField = new JTextField();
        emailChangeButton = new JButton();
        phoneNumberChangeButton = new JButton();
        changeThemeButton = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        userPhoto.setIcon(new ImageIcon(ImageLoader.getImageAddresses().get("question")));
        userPhoto.setBorder(BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        firstnameTextField.setEditable(false);
        firstnameTextField.setBackground(new java.awt.Color(255, 255, 255));
        firstnameTextField.setBorder(BorderFactory.createTitledBorder("Firstname:"));

        lastnameTextField.setEditable(false);
        lastnameTextField.setBackground(new java.awt.Color(255, 255, 255));
        lastnameTextField.setBorder(BorderFactory.createTitledBorder("Lastname:"));

        identityCodeTextField.setEditable(false);
        identityCodeTextField.setBackground(new java.awt.Color(255, 255, 255));
        identityCodeTextField.setBorder(BorderFactory.createTitledBorder("Identity code:"));

        idTextField.setEditable(false);
        idTextField.setBackground(new java.awt.Color(255, 255, 255));
        idTextField.setBorder(BorderFactory.createTitledBorder("Student id:"));

        phoneNumberTextField.setBorder(BorderFactory.createTitledBorder("Phone number:"));

        emailTextField.setBorder(BorderFactory.createTitledBorder("Email:"));

        totalAverageTextField.setEditable(false);
        totalAverageTextField.setBackground(new java.awt.Color(255, 255, 255));
        totalAverageTextField.setBorder(BorderFactory.createTitledBorder("Total average:"));

        departmentTextField.setEditable(false);
        departmentTextField.setBackground(new java.awt.Color(255, 255, 255));
        departmentTextField.setBorder(BorderFactory.createTitledBorder("Department:"));

        guideMasterTextField.setEditable(false);
        guideMasterTextField.setBackground(new java.awt.Color(255, 255, 255));
        guideMasterTextField.setBorder(BorderFactory.createTitledBorder("Guide master:"));

        enteryYearTextField.setEditable(false);
        enteryYearTextField.setBackground(new java.awt.Color(255, 255, 255));
        enteryYearTextField.setBorder(BorderFactory.createTitledBorder("Entery year:"));

        gradeTextField.setEditable(false);
        gradeTextField.setBackground(new java.awt.Color(255, 255, 255));
        gradeTextField.setBorder(BorderFactory.createTitledBorder("Grade:"));

        educationalStatusTextField.setEditable(false);
        educationalStatusTextField.setBackground(new java.awt.Color(255, 255, 255));
        educationalStatusTextField.setBorder(BorderFactory.createTitledBorder("Educational Status:"));

        emailChangeButton.setBackground(new java.awt.Color(255, 204, 204));
        emailChangeButton.setText("Change");

        phoneNumberChangeButton.setBackground(new java.awt.Color(255, 204, 204));
        phoneNumberChangeButton.setText("Change");

        changeThemeButton.setBackground(new java.awt.Color(102, 102, 102));
        changeThemeButton.setForeground(new java.awt.Color(51, 51, 51));
        changeThemeButton.setText("Change theme");

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGap(79, 79, 79)
                                                                .addComponent(phoneNumberChangeButton)
                                                                .addGap(248, 248, 248)
                                                                .addComponent(emailChangeButton))
                                                        .addComponent(gradeTextField, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(guideMasterTextField, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(phoneNumberTextField, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(totalAverageTextField, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(userPhoto)
                                                .addGap(482, 482, 482))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(departmentTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(identityCodeTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(firstnameTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(53, 53, 53)
                                                                        .addComponent(lastnameTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(enteryYearTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(educationalStatusTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 237, Short.MAX_VALUE))))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(changeThemeButton)
                                .addGap(470, 470, 470))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userPhoto)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(firstnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastnameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(idTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(identityCodeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(departmentTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(totalAverageTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(guideMasterTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(enteryYearTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(gradeTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(educationalStatusTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneNumberTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneNumberChangeButton)
                                        .addComponent(emailChangeButton))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(changeThemeButton)
                                .addGap(14, 14, 14))
        );
        fillTextFields();
    }

    private void fillTextFields() {
        model.pages.profilePage.StudentProfilePage studentProfilePage =
                (model.pages.profilePage.StudentProfilePage) page;
        Student user = (Student) studentProfilePage.getUser();
        firstnameTextField.setText(user.getFirstname());
        lastnameTextField.setText(user.getLastname());
        departmentTextField.setText(String.valueOf(user.getDepartment()));
        identityCodeTextField.setText(user.getIdentityCode());
        idTextField.setText(user.getId());
        totalAverageTextField.setText(String.valueOf(user.getTotalAverageScore()));
        guideMasterTextField.setText(user.getGuideMaster().getFirstname() + " " + user.getGuideMaster().getLastname());
        enteryYearTextField.setText(user.getEnteringYear());
        gradeTextField.setText(String.valueOf(user.getGrade()));
        educationalStatusTextField.setText(String.valueOf(user.getEducationalStatus()));
        phoneNumberTextField.setText(user.getPhoneNumber());
        emailTextField.setText(user.getEmail());
    }

}
