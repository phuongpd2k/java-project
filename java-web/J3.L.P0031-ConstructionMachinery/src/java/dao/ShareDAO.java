/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Share;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zuy Fun
 */
public class ShareDAO {

    Connection conn;
    PreparedStatement pre;
    ResultSet rs;

    public List<Share> getShare() {
        List<Share> list = new ArrayList<>();
        String sql = "select * from Share";
        try {
            conn = new DBContext().getConnection();
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            while(rs.next()){
                list.add(new Share(rs.getString("icon"), rs.getString("socialNetwork"), rs.getString("URL")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ShareDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Share> list = new ShareDAO().getShare();
        for (Share share : list) {
            System.out.println(share);
        }
    }
}
