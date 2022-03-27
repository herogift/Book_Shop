package com.cxsj1.homework.w5.servlet.user;

import com.cxsj1.homework.w5.dao.U_Dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/usernamecheck")
public class UsernameCheck extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String name = request.getParameter("name");
        int count = U_Dao.selectByName(name);

        PrintWriter out = response.getWriter();
        if(count>0){
            out.print("false");
        }else {
            out.print("true");
        }

        out.close();
    }
}
