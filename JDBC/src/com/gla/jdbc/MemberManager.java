package com.gla.jdbc;

import java.sql.*;

public class MemberManager {

    // CREATE
    public void addMember(int id, String name, String type, int months) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into members values (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, type);
            ps.setInt(4, months);

            ps.executeUpdate();

            System.out.println("Member Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showPremiumMembers() {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from members where type='Premium'";

            PreparedStatement ps = con.prepareStatement(q);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " +
                                rs.getString(2) + " " +
                                rs.getString(3) + " " +
                                rs.getInt(4)
                );
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // UPDATE
    public void updateMonths(int id, int months) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update members set months=? where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, months);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Membership Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deleteMember(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from members where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Member Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
