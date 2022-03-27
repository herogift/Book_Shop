package com.cxsj1.homework.w5.dao;

import com.cxsj1.homework.w5.entity.BS_Book;
import com.cxsj1.homework.w5.entity.BS_User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class B_Dao {
    public static int insert(BS_Book book) {
        String sql = "insert into book values(null, ?, ?, ?, ?, ?, ?, ?)";
        Object[] params = {
                book.getB_Name(),
                book.getB_Desc(),
                book.getB_Price(),
                book.getB_Stock(),
                book.getB_FID(),
                book.getB_CID(),
                book.getB_FileName()
        };
        return M_Dao.exectuIUD(sql, params);
    }

    public static ArrayList<BS_Book> selectAll() {
        ArrayList<BS_Book> list = new ArrayList<BS_Book>();
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        try {
            String sql = "select * from book ";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                BS_Book book = new BS_Book(
                        rs.getInt("b_ID"),
                        rs.getString("b_Name"),
                        rs.getString("b_Desc"),
                        rs.getDouble("b_Price"),
                        rs.getInt("b_Stock"),
                        rs.getInt("b_FID"),
                        rs.getInt("b_CID"),
                        rs.getString("b_FileName")
                );
                list.add(book);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return list;
    }

    public static ArrayList<BS_Book> selectByFid(int fid) {
        ArrayList<BS_Book> list = new ArrayList<BS_Book>();
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        try {
            String sql = "select * from book where b_FID=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,fid);
            rs = ps.executeQuery();
            while (rs.next()) {
                BS_Book book = new BS_Book(
                        rs.getInt("b_ID"),
                        rs.getString("b_Name"),
                        rs.getString("b_Desc"),
                        rs.getDouble("b_Price"),
                        rs.getInt("b_Stock"),
                        rs.getInt("b_FID"),
                        rs.getInt("b_CID"),
                        rs.getString("b_FileName")
                );
                list.add(book);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return list;
    }

    public static ArrayList<BS_Book> selectByCid(int cid) {
        ArrayList<BS_Book> list = new ArrayList<BS_Book>();
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        try {
            String sql = "select * from book where b_CID=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                BS_Book book = new BS_Book(
                        rs.getInt("b_ID"),
                        rs.getString("b_Name"),
                        rs.getString("b_Desc"),
                        rs.getDouble("b_Price"),
                        rs.getInt("b_Stock"),
                        rs.getInt("b_FID"),
                        rs.getInt("b_CID"),
                        rs.getString("b_FileName")
                );
                list.add(book);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return list;
    }

    public static BS_Book selectById(int id) {
        BS_Book book = null;
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        try {
            String sql = "select * from book where b_ID=?" ;
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            while (rs.next()) {
                book = new BS_Book(
                        rs.getInt("b_ID"),
                        rs.getString("b_Name"),
                        rs.getString("b_Desc"),
                        rs.getDouble("b_Price"),
                        rs.getInt("b_Stock"),
                        rs.getInt("b_FID"),
                        rs.getInt("b_CID"),
                        rs.getString("b_FileName")
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return book;
    }
}
