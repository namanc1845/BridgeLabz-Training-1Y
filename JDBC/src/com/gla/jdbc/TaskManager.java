package com.gla.jdbc;

import java.sql.*;

public class TaskManager {

    // CREATE
    public void addTask(int id, String title, String status) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into tasks values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, status);

            ps.executeUpdate();

            System.out.println("Task Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showPendingTasks() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from tasks where status='Pending'";

            PreparedStatement ps = con.prepareStatement(q);

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
    public void completeTask(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update tasks set status='Completed' where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Task Completed");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteCompletedTasks() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from tasks where status='Completed'";

            PreparedStatement ps = con.prepareStatement(q);

            ps.executeUpdate();

            System.out.println("Completed Tasks Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
