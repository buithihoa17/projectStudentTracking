/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.Student;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import service.StudentService;
import service.impl.StudentServiceImpl;

/**
 *
 * @author PC
 */
public class StudentTableModel extends AbstractTableModel {

    private List<Student> students;
    private final StudentService studentService;
    private String[] cols = {"STT", "Họ Tên", "Giới Tính", "Ngày sinh", "Số  điện thoại", "FLink", "Nơi công tác",  "Tình trạng",};

    public StudentTableModel() {
        studentService = new StudentServiceImpl();
        students = studentService.getAllStudents();

    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 2) {
            return Boolean.class;
        }
        return super.getClass();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = null;
        Student student = students.get(rowIndex);
        switch (columnIndex) {
            case 0:
                value = student.getId();
                break;
            case 1:
                value = student.getFullName();
                break;
            case 2:
                value = student.isGender();
                break;
            case 3:
                value = student.getDateOfBirth();
                break;
            case 4:
                value = student.getPhone();
                break;
            
            case 5:
                value = student.getFlink();
                break;
            case 6:
                value = student.getWorkplace();
                break;
            
            case 7:
                value = student.getStatus();
                break;
            
        }
        return value;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return cols[columnIndex];
    }

}
