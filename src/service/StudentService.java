/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entities.Student;
import java.util.List;

/**
 *
 * @author PC
 */
public interface StudentService {

    List<Student> getAllStudents();
    
//    private final StudentDao studentDao;
//
//    public StudentService() {
//        this.studentDao = new StudentDao();
//    }
//    public List<Student> getStudent(){
//        final List<Student> students = studentDao.getStudent();
//        if(!students.isEmpty()){
//            return students;
//        }
//        return Collections.emptyList();
//    }

}
