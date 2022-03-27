package com.cxsj1.homework.w5.servlet.user;

import com.cxsj1.homework.w5.dao.U_Dao;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/numcheck")
    public class NumCheck extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String num = request.getParameter("num");
        HttpSession session = request.getSession();
        String sysCode = (String) session.getAttribute("code");

        PrintWriter out = response.getWriter();
        if(sysCode.equals(num)){
            out.print("true");
        }else {
            out.print("false");
        }

    }
}
