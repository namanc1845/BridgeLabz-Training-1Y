package com.gla.jdbc;

import java.sql.*;

public class EnrollmentManager {

    // CREATE
    public void addEnrollment(int id, String student, String course) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into enrollments values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, student);
            ps.setString(3, course);

            ps.executeUpdate();

            System.out.println("Enrollment Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showByCourse(String course) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from enrollments where course=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, course);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getString(3)
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updateCourse(int id, String course) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update enrollments set course=? where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, course);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Course Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteEnrollment(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from enrollments where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Enrollment Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
