package com.cxsj1.homework.w5.servlet.production;

import com.cxsj1.homework.w5.dao.Cate_Dao;
import com.cxsj1.homework.w5.entity.BS_Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/managers/admin_toBookAdd")
public class BookAdd extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ArrayList<BS_Category> f_list = Cate_Dao.selectCate("father");
        request.setAttribute("f_list",f_list);
        ArrayList<BS_Category> c_list = Cate_Dao.selectCate("child");
        request.setAttribute("c_list",c_list);


        request.getRequestDispatcher("admin_bookAdd.jsp").forward(request, response);
    }
}