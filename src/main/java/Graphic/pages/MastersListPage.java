package Graphic.pages;
import model.person.master.Master;
import utils.ImageLoader;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class MastersListPage extends MyPanel {
    private JScrollPane scrollPane;
    private DefaultListModel<String> listModel;
    private JList<String> masterFilteredList;
    private JButton searchButton;
    private JPanel searchPanel;
    private JTextField searchWithDepartmentTextField;
    private JTextField searchWithFirstnameTextField;
    private JTextField searchWithLastnameTextField;
    private JTextField searchWithMasterDegreeTextField;

    public MastersListPage(model.pages.registrationAffairs.MastersListPage mastersListPage) {
        super(mastersListPage);
        initComponents();
    }

    private void initComponents() {
        searchButton = new JButton();
        scrollPane = new JScrollPane();
        listModel = new DefaultListModel<>();
        masterFilteredList = new JList<>(listModel);
        searchPanel = new JPanel();
        searchWithFirstnameTextField = new JTextField();
        searchWithMasterDegreeTextField = new JTextField();
        searchWithDepartmentTextField = new JTextField();
        searchWithLastnameTextField = new JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1112, 643));

        searchButton.setIcon(new ImageIcon(ImageLoader.getImageAddresses().get("search_image")));
        searchButton.addActionListener(this::search);

        masterFilteredList.setPreferredSize(new java.awt.Dimension(470, 631));
        scrollPane.setViewportView(masterFilteredList);

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        searchWithFirstnameTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithFirstnameTextField.setBorder(BorderFactory.createTitledBorder("Firstname:"));
        searchWithFirstnameTextField.setPreferredSize(new java.awt.Dimension(150, 29));

        searchWithMasterDegreeTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithMasterDegreeTextField.setBorder(BorderFactory.createTitledBorder("Master degree:"));
        searchWithMasterDegreeTextField.setPreferredSize(new java.awt.Dimension(150, 29));

        searchWithDepartmentTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithDepartmentTextField.setBorder(BorderFactory.createTitledBorder("Department:"));
        searchWithDepartmentTextField.setPreferredSize(new java.awt.Dimension(150, 29));

        searchWithLastnameTextField.setForeground(new java.awt.Color(204, 204, 204));
        searchWithLastnameTextField.setBorder(BorderFactory.createTitledBorder("Lastname:"));
        searchWithLastnameTextField.setPreferredSize(new java.awt.Dimension(150, 29));

        GroupLayout searchPanelLayout = new GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(searchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(searchWithFirstnameTextField, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                        .addComponent(searchWithLastnameTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchWithMasterDegreeTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchWithDepartmentTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
                searchPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(searchPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(searchWithFirstnameTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchWithLastnameTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchWithMasterDegreeTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchWithDepartmentTextField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 470, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(scrollPane)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(searchButton, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 370, Short.MAX_VALUE)))
                                .addContainerGap())
        );
    }

    private void search(ActionEvent actionEvent) {
        listModel.clear();
        model.pages.registrationAffairs.MastersListPage mastersListPage =
                (model.pages.registrationAffairs.MastersListPage) page;
        setFilters(searchWithFirstnameTextField.getText(), searchWithLastnameTextField.getText(),
                searchWithMasterDegreeTextField.getText(), searchWithDepartmentTextField.getText(), mastersListPage);
        ArrayList<Master> matchedMasters = mastersListPage.search();
        ArrayList<String> showMaster = showMasters(matchedMasters);
        for (String master : showMaster) {
            listModel.addElement(master);
        }
    }

    private void setFilters(String firstname, String lastname, String masterDegree, String department,
                            model.pages.registrationAffairs.MastersListPage mastersListPage) {
        mastersListPage.setFirstname(firstname);
        mastersListPage.setLastname(lastname);
        mastersListPage.setMasterDegree(masterDegree);
        mastersListPage.setDepartment(department);
    }

    private ArrayList<String> showMasters(ArrayList<Master> masters) {
        ArrayList<String> result = new ArrayList<>();
        for (Master master : masters) {
            String masterRow = master.getFirstname() + " | " + master.getLastname() + " | " +
                    master.getEmail() + " | " + master.getDepartment() + " | " +
                    master.getRoomNumber() + " | " + master.getMasterDegree() + " | " +
                    master.getMasterPosition();
            result.add(masterRow);
        }
        return result;
    }
}
