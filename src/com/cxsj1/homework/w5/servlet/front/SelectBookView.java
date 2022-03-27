package com.cxsj1.homework.w5.servlet.front;

import com.cxsj1.homework.w5.dao.B_Dao;
import com.cxsj1.homework.w5.dao.Cate_Dao;
import com.cxsj1.homework.w5.entity.BS_Book;
import com.cxsj1.homework.w5.entity.BS_Category;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/selectBookView")
public class SelectBookView extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ArrayList<BS_Category> f_list = Cate_Dao.selectCate("father");
        request.setAttribute("f_list",f_list);
        ArrayList<BS_Category> c_list = Cate_Dao.selectCate("child");
        request.setAttribute("c_list",c_list);

        String id = request.getParameter("id");
        BS_Book book = null;

        if(id != null){
            book = B_Dao.selectById(Integer.parseInt(id));
            request.setAttribute("book",book);
        }
        request.getRequestDispatcher("bookView.jsp").forward(request, response);


    }
}