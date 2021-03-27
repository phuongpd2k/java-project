/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Message;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Zuy Fun
 */
public class MessageDAO {

    Connection conn;
    PreparedStatement pre;
    ResultSet rs;

    public boolean insertMess(Message mess) {
        int n = 0;
        String sql = "INSERT INTO [dbo].[Message]\n"
                + "           ([name]\n"
                + "           ,[email]\n"
                + "           ,[message])\n"
                + "     VALUES\n"
                + "           (?,?,?)";
        try {
            conn = new DBContext().getConnection();
            pre = conn.prepareStatement(sql);
            pre.setString(1, mess.getName());
            pre.setString(2, mess.getEmail());
            pre.setString(3, mess.getMessage());
            return pre.executeUpdate() > 0;
        } catch (SQLException ex) {
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(new MessageDAO().insertMess(new Message("name", "email", "message")));
    }
}
