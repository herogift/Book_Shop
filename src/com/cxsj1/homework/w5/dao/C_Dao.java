package com.cxsj1.homework.w5.dao;

import com.cxsj1.homework.w5.entity.BS_Book;
import com.cxsj1.homework.w5.entity.BS_Cart;
import com.cxsj1.homework.w5.entity.BS_User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class C_Dao {
    public static int insert(BS_Cart cart) {
        String sql = "insert into cart values(null, ?, ?, ?, ?, ?, ?, ?, 1)";
        Object[] params = {
             cart.getC_FileName(),
             cart.getC_Name(),
             cart.getC_Price(),
             cart.getC_Num(),
             cart.getC_Stock(),
             cart.getC_BID(),
             cart.getC_UID()
        };
        return M_Dao.exectuIUD(sql, params);
    }

    public static ArrayList<BS_Cart> getCart(String uid){
        ArrayList<BS_Cart> list = new ArrayList<BS_Cart>();
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        try {
            String sql = "select * from cart where c_UID=? and c_Valid=1 order by c_ID desc";
            ps = conn.prepareStatement(sql);
            ps.setString(1,uid);
            rs = ps.executeQuery();
            while (rs.next()) {
                BS_Cart cart = new BS_Cart(
                        rs.getInt("c_ID"),
                        rs.getString("c_FileName"),
                        rs.getString("c_Name"),
                        rs.getDouble("c_Price"),
                        rs.getInt("c_Num"),
                        rs.getInt("c_Stock"),
                        rs.getInt("c_BID"),
                        rs.getString("c_UID"),
                        rs.getInt("c_Valid")
                );
                list.add(cart);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return list;
    }

    public static BS_Cart getCart(String uid, String pid){
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        BS_Cart cart = null;
        try {
            String sql = "select * from cart where c_UID=? and c_BID=? and c_Valid=1 order by c_ID desc";
            ps = conn.prepareStatement(sql);
            ps.setString(1,uid);
            ps.setInt(2,Integer.parseInt(pid));
            rs = ps.executeQuery();
            while (rs.next()) { 
                cart= new BS_Cart(
                        rs.getInt("c_ID"),
                        rs.getString("c_FileName"),
                        rs.getString("c_Name"),
                        rs.getDouble("c_Price"),
                        rs.getInt("c_Num"),
                        rs.getInt("c_Stock"),
                        rs.getInt("c_BID"),
                        rs.getString("c_UID"),
                        rs.getInt("c_Valid")
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return cart;
    }

    public static int updateNum(int id, int count){
        String sql = "update cart set c_Num=? where c_ID=?";
        Object[] params = {count, id};
        return M_Dao.exectuIUD(sql, params);
    }

    public static int delBook(int id){
        String sql = "delete from cart where c_ID=?";
        Object[] params = {id};
        return M_Dao.exectuIUD(sql, params);
    }

    public static BS_Cart getCart(int id){
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        BS_Cart cart = null;
        try {
            String sql = "select * from cart where c_ID=? and c_Valid=1 order by c_ID desc";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while (rs.next()) {
                cart= new BS_Cart(
                        rs.getInt("c_ID"),
                        rs.getString("c_FileName"),
                        rs.getString("c_Name"),
                        rs.getDouble("c_Price"),
                        rs.getInt("c_Num"),
                        rs.getInt("c_Stock"),
                        rs.getInt("c_BID"),
                        rs.getString("c_UID"),
                        rs.getInt("c_Valid")
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return cart;
    }
}
