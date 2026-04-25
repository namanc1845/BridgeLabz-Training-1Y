package com.gla.jdbc;

import java.sql.*;

public class ProductManager {

    // CREATE
    public void addProduct(int pid, String pname, int qty) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into product values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, pid);
            ps.setString(2, pname);
            ps.setInt(3, qty);

            ps.executeUpdate();

            System.out.println("Product Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showLowStock() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from product where qty < 10";

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
    public void updateQty(int pid, int qty) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update product set qty=? where pid=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, qty);
            ps.setInt(2, pid);

            ps.executeUpdate();

            System.out.println("Quantity Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteProduct(int pid) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from product where pid=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, pid);

            ps.executeUpdate();

            System.out.println("Product Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
