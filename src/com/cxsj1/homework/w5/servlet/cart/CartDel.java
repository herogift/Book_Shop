package com.cxsj1.homework.w5.servlet.cart;

import com.cxsj1.homework.w5.dao.C_Dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cartDel")
public class CartDel extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String esid = request.getParameter("esid");

        C_Dao.delBook(Integer.parseInt(esid));
    }
}
