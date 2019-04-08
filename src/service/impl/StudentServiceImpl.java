/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entities.Student;
import java.util.Collections;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import service.StudentService;

/**
 *
 * @author PC
 */
public class StudentServiceImpl implements StudentService{
 private final StudentDao studentDao;

    public StudentServiceImpl() {
        studentDao = new StudentDaoImpl();
    }
    @Override
    public List<Student> getAllStudents() {
        final List<Student> students = studentDao.getStudent();
        if(!CollectionUtils.isEmpty(students)){
            return students;
        }
        return Collections.emptyList();
        
    }
    
}
