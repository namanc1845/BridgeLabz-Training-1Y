package com.gla.jdbc;

import java.sql.*;

public class VehicleManager {

    // CREATE
    public void addVehicle(String regNo, String owner, String status) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into vehicles values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, regNo);
            ps.setString(2, owner);
            ps.setString(3, status);

            ps.executeUpdate();

            System.out.println("Vehicle Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showPendingVehicles() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from vehicles where status='Pending'";

            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getString(1) + " " +
                                rs.getString(2) + " " +
                                rs.getString(3)
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updateStatus(String regNo) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update vehicles set status='Completed' where regNo=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, regNo);

            ps.executeUpdate();

            System.out.println("Status Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteVehicle(String regNo) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from vehicles where regNo=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, regNo);

            ps.executeUpdate();

            System.out.println("Vehicle Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
