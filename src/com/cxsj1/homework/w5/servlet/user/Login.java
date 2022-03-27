package com.cxsj1.homework.w5.servlet.user;

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

@WebServlet("/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("username");
        String pwd = request.getParameter("password");

        int count = U_Dao.selectByID(username, pwd);

        if(count > 0){
            HttpSession session = request.getSession();
            BS_User u = U_Dao.selectAdmin(username,pwd);
            session.setAttribute("user", u);
            session.setAttribute("name", username);
            session.setAttribute("isLogin","1");
            response.sendRedirect("indexSelect");

        }else{
            PrintWriter out = response.getWriter();
            out.write("<script>");
            out.write("alert('用户登录失败')");
            out.write("location.herf='login.jsp'");
            out.write("</script>");
        }


    }
}