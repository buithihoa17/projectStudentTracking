/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Student;
import java.util.List;

/**
 *
 * @author PC
 */
public interface StudentDao {
    List<Student> getStudent();

//    private static Connection conn = null;
//    private static Statement st;
//    private static PreparedStatement pst;
//    private static ResultSet rs;
//
//    public StudentDao() {
//        conn = ConnectionSql.getConnectMySQL();
//    }

//    public List<Student> getStudent() {
//        final List<Student> students = new ArrayList<>();
//        String query = "Select* from student";
//        try {
//            st = conn.createStatement();
//            rs = st.executeQuery(query);
//            while (rs.next()) {
//                students.add(new Student(rs.getInt("STUDENT_ID"), rs.getString("FULLNAME"),
//                        rs.getBoolean("GENDER"), rs.getDate("DATE_OF_BIRTH"),
//                        rs.getString("PHONE"), rs.getString("EMAIL"),
//                        rs.getString("FLINK"), rs.getString("WORK_PLACE"),
//                        rs.getString("ADDRESS"), rs.getString("DESCRIPTION"),
//                        StudentStatus.getStatus(rs.getString("STATUS"))
//                ));
//
//            }
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return students;
//    }

}
