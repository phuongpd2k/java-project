/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Company;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zuy Fun
 */
public class CompanyDAO {

    Connection conn;
    PreparedStatement pre;
    ResultSet rs;

    public Company getInfor() {
        String sql = "select * from Company";
        try {
            conn = new DBContext().getConnection();
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next()) {
                return new Company(rs.getString("title"), rs.getString("shortDes"), rs.getString("longDes"), rs.getString("image"),
                        rs.getString("address"), rs.getString("city"), rs.getString("country"), rs.getString("tel"), rs.getString("email"));
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(new CompanyDAO().getInfor());
    }
}
