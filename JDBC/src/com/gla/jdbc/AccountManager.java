package com.gla.jdbc;

import java.sql.*;

public class AccountManager {

    // CREATE
    public void addAccount(int accNo, String name, double balance) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into accounts values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, accNo);
            ps.setString(2, name);
            ps.setDouble(3, balance);

            ps.executeUpdate();

            System.out.println("Account Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showAccounts() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from accounts where balance > 10000";

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
    public void updateBalance(int accNo, double balance) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update accounts set balance=? where accNo=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setDouble(1, balance);
            ps.setInt(2, accNo);

            ps.executeUpdate();

            System.out.println("Balance Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteAccount(int accNo) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from accounts where accNo=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, accNo);

            ps.executeUpdate();

            System.out.println("Account Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
