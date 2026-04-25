package com.gla.jdbc;

import java.sql.*;

public class MenuManager {

    // CREATE
    public void addItem(int id, String itemName, double price) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into menu values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, itemName);
            ps.setDouble(3, price);

            ps.executeUpdate();

            System.out.println("Menu Item Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showCheapItems() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from menu where price < 200";

            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getDouble(3)
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updatePrice(int id, double price) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update menu set price=? where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setDouble(1, price);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Price Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteItem(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from menu where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Menu Item Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
