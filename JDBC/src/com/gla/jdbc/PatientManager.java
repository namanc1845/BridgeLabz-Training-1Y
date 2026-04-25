package com.gla.jdbc;

import java.sql.*;

public class PatientManager {

    // CREATE
    public void addPatient(int id, String name, String disease) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into patients values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, disease);

            ps.executeUpdate();

            System.out.println("Patient Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // READ
    public void showPatientsByDisease(String disease) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from patients where disease=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, disease);

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
    public void updateDisease(int id, String disease) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "update patients set disease=? where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setString(1, disease);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Disease Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // DELETE
    public void deletePatient(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from patients where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Patient Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
