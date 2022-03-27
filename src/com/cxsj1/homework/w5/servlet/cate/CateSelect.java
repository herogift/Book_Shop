package com.cxsj1.homework.w5.servlet.cate;

import com.cxsj1.homework.w5.dao.Cate_Dao;
import com.cxsj1.homework.w5.entity.BS_Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/managers/cate_select")
public class CateSelect extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ArrayList<BS_Category> cateList = Cate_Dao.selectAll();
        request.setAttribute("cateList",cateList);

        request.getRequestDispatcher("/managers/admin_cate.jsp").forward(request, response);

    }
}

