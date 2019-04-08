/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import common.StudentStatus;
import dao.StudentDao;
import entities.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import jdbc.ConnectionProvider;
import jdbc.JdbcConnectionProvider;

/**
 *
 * @author PC
 */
public class StudentDaoImpl implements StudentDao {

    private ConnectionProvider connectionProvider;
    private Connection conn = null;
    private Statement st;
    private  PreparedStatement pst;
    private  ResultSet rs;

    public StudentDaoImpl() {
        connectionProvider = new JdbcConnectionProvider();
        conn = connectionProvider.getConnection();
    }

    @Override
    public List<Student> getStudent() {
        final List<Student> students = new ArrayList<>();
        String query = "Select* from student";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                students.add(new Student(rs.getInt("STUDENT_ID"), rs.getString("FULLNAME"),
                        rs.getBoolean("GENDER"), rs.getDate("DATE_OF_BIRTH"),
                        rs.getString("PHONE"), rs.getString("EMAIL"),
                        rs.getString("FLINK"), rs.getString("WORK_PLACE"),
                        rs.getString("ADDRESS"), rs.getString("DESCRIPTION"),
                        StudentStatus.getStatus(rs.getString("STATUS"))
                ));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return students;
    }

}
