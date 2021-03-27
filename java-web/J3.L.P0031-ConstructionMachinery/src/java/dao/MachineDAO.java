/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Machine;
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
public class MachineDAO {

    Connection conn;
    PreparedStatement pre;
    ResultSet rs;

    public List<Machine> getMachineByPagingInHomePage(int pageIndex, int pageSize) {
        List<Machine> list = new ArrayList<>();
        String sql = "with R as(select ROW_NUMBER() over(order by id) as row, * from Machine)\n"
                + "select * from R where row between ? and ?\n"
                + "order by publishDate desc";
        try {
            conn = new DBContext().getConnection();
            pre = conn.prepareStatement(sql);
            pre.setInt(1, pageSize * (pageIndex - 1) + 1);
            pre.setInt(2, pageIndex * pageSize);
            rs = pre.executeQuery();
            while (rs.next()) {
                list.add(new Machine(rs.getInt("id"), rs.getString("name"), rs.getString("shortDes"), rs.getString("longDes"), 
                        rs.getString("image"), rs.getString("type"), rs.getDate("publishDate")));
            }
        } catch (SQLException ex) {
        }
        return list;
    }

    public List<Machine> getMachineByPagingInSalePage(int pageIndex, int pageSize) {
        List<Machine> list = new ArrayList<>();
        String sql = "with R as(select ROW_NUMBER() over(order by id) as row, * from Machine where type = 'sale')\n"
                + "select * from R where row between ? and ?";
        try {
            conn = new DBContext().getConnection();
            pre = conn.prepareStatement(sql);
            pre.setInt(1, pageSize * (pageIndex - 1) + 1);
            pre.setInt(2, pageIndex * pageSize);
            rs = pre.executeQuery();
            while (rs.next()) {
                list.add(new Machine(rs.getInt("id"), rs.getString("name"), rs.getString("shortDes"), rs.getString("longDes"), 
                        rs.getString("image"), rs.getString("type"), rs.getDate("publishDate")));
            }
        } catch (SQLException ex) {
        }
        return list;
    }

    public int getTotalMachineInHomePage() {
        // lấy ra tổng số lượng bản ghi
        String sql = "select COUNT(*) as count from Machine";
        try {
            conn = new DBContext().getConnection();
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next()) {
                return rs.getInt("count");
            }
        } catch (SQLException ex) {
        }
        return 0;
    }
    public int getTotalMachineInSalePage() {
        // lấy ra tổng số lượng bản ghi
        String sql = "select COUNT(*) as count from Machine where type = 'sale'";
        try {
            conn = new DBContext().getConnection();
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next()) {
                return rs.getInt("count");
            }
        } catch (SQLException ex) {
        }
        return 0;
    }

    public Machine getMachineDetail(int id) {
        String sql = "select * from Machine where id = ?";
        try {
            conn = new DBContext().getConnection();
            pre = conn.prepareStatement(sql);
            pre.setInt(1, id);
            rs = pre.executeQuery();
            while (rs.next()) {
                return new Machine(rs.getInt("id"), rs.getString("name"), rs.getString("shortDes"), rs.getString("longDes"), rs.getString("image"), rs.getString("type"), rs.getDate("publishDate"));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        MachineDAO dao = new MachineDAO();
        List<Machine> list = dao.getMachineByPagingInHomePage(1, 6);
        for (Machine machine : list) {
            System.out.println(machine);
        }
//        System.out.println(dao.getTotalMachineInHomePage());
//        System.out.println(dao.getMachineDetail(2));

    }
}
