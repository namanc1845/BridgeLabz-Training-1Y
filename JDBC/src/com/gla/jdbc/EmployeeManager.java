package com.gla.jdbc;

import java.sql.*;

public class EmployeeManager {

    public void addEmployee(int id, String name, double salary) {
        try {
            Connection con = DBConnection.getConnection();

            String q = "insert into employee values (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, salary);

            ps.executeUpdate();

            System.out.println("Employee Added");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void showEmployee() {
        try {
            Connection con = DBConnection.getConnection();

            String q = "select * from employee where salary > 30000";

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

    public void updateSalary(int id) {
        try {
            Connection con = DBConnection.getConnection();

            String q = "update employee set salary = salary + salary*0.10 where id=?";

            PreparedStatement ps = con.prepareStatement(q);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Salary Updated");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteEmployee() {
        try {
            Connection con = DBConnection.getConnection();

            String q = "delete from employee where salary < 15000";

            PreparedStatement ps = con.prepareStatement(q);

            ps.executeUpdate();

            System.out.println("Low Salary Employees Deleted");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
