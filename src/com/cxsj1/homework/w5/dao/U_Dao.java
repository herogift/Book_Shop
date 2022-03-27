package com.cxsj1.homework.w5.dao;

import com.cxsj1.homework.w5.entity.BS_User;

import javax.servlet.annotation.WebServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class U_Dao {
    public static int insert(BS_User u) {
        String sql = "insert into user values(?, ?, ?, ?, DATE_FORMAT(?,'%Y-%m-%d'), ?, ?, ?, ?, ?)";
        Object[] params = {
                u.getID(),
                u.getNickname(),
                u.getPassword(),
                u.getSex(),
                u.getBirthday(),
                u.getIdenity_Code(),
                u.getEmail(),
                u.getPhone(),
                u.getAddress(),
                u.getStatus()
        };
        return M_Dao.exectuIUD(sql, params);
    }

    public static int selectByName(String id) {
        int count = 0;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "select count(*) from user where ID=? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }

        return count;
    }


    public static int[] totalPage(int count, String keyword) {
        int arr[] = {0, 1};
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "";

            if (keyword != null) {
                sql = "select count(*) from user where ID like ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + keyword + "%");
            } else {
                sql = "select count(*) from user ";
                ps = conn.prepareStatement(sql);
            }

            rs = ps.executeQuery();

            while (rs.next()) {
                arr[0] = rs.getInt(1);
                if ((arr[0] % count) == 0)
                    arr[1] = arr[0] / count;
                else
                    arr[1] = arr[0] / count + 1;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }

        return arr;
    }

    public static ArrayList<BS_User> selectAll(int cpage, int count, String keyword) {
        ArrayList<BS_User> list = new ArrayList<BS_User>();
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        try {
            String sql = "";
            if (keyword != null) {
                sql = "select * from user where ID like ? order by birthday desc limit ?, ?";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + keyword + "%");
                ps.setInt(2, (cpage - 1) * count);
                ps.setInt(3, count);
            } else {
                sql = "select * from user order by birthday desc limit ?, ?";
                ps = conn.prepareStatement(sql);
                ps.setInt(1, (cpage - 1) * count);
                ps.setInt(2, count);
            }

            rs = ps.executeQuery();
            while (rs.next()) {
                BS_User u = new BS_User(
                        rs.getString("ID"),
                        rs.getString("Nickname"),
                        rs.getString("Password"),
                        rs.getString("Sex"),
                        rs.getString("Birthday"),
                        rs.getString("Idenity_Code"),
                        rs.getString("Email"),
                        rs.getString("Phone"),
                        rs.getString("Address"),
                        rs.getInt("Status")
                );
                list.add(u);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return list;
    }

    public static int selectByID(String ID, String pwd) {
        int count = 0;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            String sql = "select count(*) from user where ID=? and Password=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.setString(2, pwd);
            rs = ps.executeQuery();

            while (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }

        return count;
    }

    public static BS_User selectAdmin(String ID, String pwd){
        BS_User u = null;
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        try {
            String sql = "select m.* from user m where ID=? and Password=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,ID);
            ps.setString(2,pwd);
            rs = ps.executeQuery();

            while(rs.next()){
                u = new BS_User(
                        rs.getString("ID"),
                        rs.getString("Nickname"),
                        rs.getString("Password"),
                        rs.getString("Sex"),
                        rs.getString("Birthday"),
                        rs.getString("Idenity_Code"),
                        rs.getString("Email"),
                        rs.getString("Phone"),
                        rs.getString("Address"),
                        rs.getInt("Status")
                );
            }
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return u;
    }



}


