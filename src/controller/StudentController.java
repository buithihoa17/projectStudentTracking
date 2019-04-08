/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.StudentTableModel;

/**
 *
 * @author PC
 */
public class StudentController {

    private final StudentTableModel studentModel;
    private final JTextField tfSearch;
    private final JButton btReport;
    private final JButton btInsert;
    private final JTable tbStudent;

    public StudentController(JTable tbStudent, JTextField tfSearch, JButton btReport, JButton btInsert) {
        this.tfSearch = tfSearch;
        this.btReport = btReport;
        this.btInsert = btInsert;
        this.tbStudent = tbStudent;
        studentModel = new StudentTableModel();
    }

    public void loadDataTable() {
        tbStudent.setModel(studentModel);
    }

}
