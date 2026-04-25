package com.gla.jdbc;

import java.sql.*;

public class LibraryManager {

    // CREATE
    public void addBook(int id, String title, String author, String status) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into books values (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, title);
            ps.setString(3, author);
            ps.setString(4, status);

            ps.executeUpdate();

            System.out.println("Book Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showAvailableBooks() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from books where status='Available'";

            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getString(3) + " " +
                                rs.getString(4)
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void issueBook(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update books set status='Issued' where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Book Issued");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteBook(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from books where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Book Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
