package com.cxsj1.homework.w5.servlet.admin;
import com.cxsj1.homework.w5.dao.U_Dao;
import com.cxsj1.homework.w5.entity.BS_User;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/managers/admin_douseradd")
public class DoUserAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String username = request.getParameter("username");
        String name = request.getParameter("name");
        String pwd = request.getParameter("password");
        String sex = request.getParameter("sex");
        String year = request.getParameter("birthday");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        //创建实体一定要顺序一样
        BS_User u = new BS_User(username, name, pwd, sex, year, null, email, phone, address, 1);

        //加入到数据库
        int count = U_Dao.insert(u);

        //成功或失败重定向
        if(count>0){
            response.sendRedirect("admin_douserselect");
        }
        else {
            PrintWriter out = response.getWriter();
            out.write("<script>");
            out.write("alert('用户添加失败')");
            out.write("location.herf='admin_useradd.jsp'");
            out.write("</script>");
            out.close();
        }


    }
}
