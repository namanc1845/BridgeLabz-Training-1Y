package com.gla.jdbc;

import java.sql.*;

public class CustomerManager {

    // CREATE
    public void addCustomer(int id, String name, String phone) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into customers values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, phone);

            ps.executeUpdate();

            System.out.println("Customer Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void searchCustomer(String name) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from customers where name LIKE ?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, "%" + name + "%");

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
    public void updatePhone(int id, String phone) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update customers set phone=? where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, phone);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Phone Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteCustomer(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from customers where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Customer Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
