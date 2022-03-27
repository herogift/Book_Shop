package com.cxsj1.homework.w5.servlet.admin;

import com.cxsj1.homework.w5.dao.U_Dao;
import com.cxsj1.homework.w5.entity.BS_User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/managers/admin_login")
public class AdminLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("username");
        String pwd = request.getParameter("password");

        int count = U_Dao.selectByID(username, pwd);

        if(count > 0){
            BS_User u = U_Dao.selectAdmin(username,pwd);
            HttpSession session = request.getSession();
            session.setAttribute("user", u);
            session.setAttribute("isLogin","1");
            if(u.getStatus()==2 ){
                session.setAttribute("isAdminLogin","1");
                response.sendRedirect("/Book_Shop_war_exploded/managers/admin_index.jsp");
            }else{
                response.sendRedirect("/Book_Shop_war_exploded/indexSelect");
            }

        }else{
            PrintWriter out = response.getWriter();
            out.write("<script>");
            out.write("alert('用户登录失败')");
            out.write("location.herf='/managers/admin_login.jsp'");
            out.write("</script>");
        }


    }
}