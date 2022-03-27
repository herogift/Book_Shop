package com.cxsj1.homework.w5.dao;

import com.cxsj1.homework.w5.entity.BS_Category;
import com.cxsj1.homework.w5.entity.BS_User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Cate_Dao {
    public static ArrayList<BS_Category> selectAll() {
        ArrayList<BS_Category> list = new ArrayList<BS_Category>();
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        try {
            String sql = "select * from category";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                BS_Category cate = new BS_Category(
                        rs.getInt("c_ID"),
                        rs.getString("c_Name"),
                        rs.getInt("c_PID")
                );
                list.add(cate);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return list;
    }

    public static ArrayList<BS_Category> selectCate(String flag) {
        ArrayList<BS_Category> list = new ArrayList<BS_Category>();
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();
        PreparedStatement ps = null;

        try {
            String sql = "";
            if(flag!=null && flag.equals("father")){
                sql = "select * from category where c_PID=0";
            }else{
                sql = "select * from category where c_PID!=0";
            }
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                BS_Category cate = new BS_Category(
                        rs.getInt("c_ID"),
                        rs.getString("c_Name"),
                        rs.getInt("c_PID")
                );
                list.add(cate);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return list;
    }


    public static BS_Category selectById(int id) {

        BS_Category cate = null;
        ResultSet rs = null;
        Connection conn = M_Dao.getconn();

        PreparedStatement ps = null;


        try {
            String sql = "select * from category where c_ID=?";

            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);


            rs = ps.executeQuery();

            while (rs.next()) {
                cate = new BS_Category(
                        rs.getInt("c_ID"),
                        rs.getString("c_Name"),
                        rs.getInt("c_PID")

                );
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            M_Dao.closeall(rs, ps, conn);
        }
        return cate;
    }
}
