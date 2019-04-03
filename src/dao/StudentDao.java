/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import common.StudentStatus;
import controller.ConnectionSql;
import entities.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class StudentDao {

    private static Connection conn = null;
    private static Statement st;
    private static PreparedStatement pst;
    private static ResultSet rs;

    public StudentDao() {
        conn = ConnectionSql.getConnectMySQL();
    }

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
                        getDescription(rs.getString("STATUS"))));

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return students;
    }

    public StudentStatus getDescription(String input) {
        StudentStatus status = null;
        switch (input) {
            case "Đang theo học":
                status = StudentStatus.INPROGRESS;
                break;
            case "Đợi khóa sau":
                status = StudentStatus.WAITING;
                break;
            case "Đã hoàn thành":
                status = StudentStatus.DONE;
                break;
            case "Tạm dừng":
                status = StudentStatus.DISCARD;
                break;

        }
        return status;
    }

}
