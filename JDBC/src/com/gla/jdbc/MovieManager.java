package com.gla.jdbc;

import java.sql.*;

public class MovieManager {

    // CREATE
    public void addMovie(int id, String name, int seats) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into movies values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, seats);

            ps.executeUpdate();

            System.out.println("Movie Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showAvailableMovies() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from movies where seats > 0";

            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getInt(3)
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updateSeats(int id, int seats) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update movies set seats=? where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, seats);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Seats Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteMovie(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from movies where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Movie Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
