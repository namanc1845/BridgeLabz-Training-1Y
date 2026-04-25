package com.gla.jdbc;

import java.sql.*;

public class SalesManager {

    // CREATE
    public void addSale(int id, String bookName, int quantity, double price) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into sales values (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, bookName);
            ps.setInt(3, quantity);
            ps.setDouble(4, price);

            ps.executeUpdate();

            System.out.println("Sale Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showSales() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from sales where quantity > 1";

            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getInt(3) + " " +
                                rs.getDouble(4)
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updateQuantity(int id, int quantity) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update sales set quantity=? where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, quantity);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Quantity Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteSale(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from sales where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Sale Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
