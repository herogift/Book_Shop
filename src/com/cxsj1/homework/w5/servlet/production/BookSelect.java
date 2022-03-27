package com.cxsj1.homework.w5.servlet.production;

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

@WebServlet("/managers/admin_bookSelect")
public class BookSelect extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ArrayList<BS_Book> book = B_Dao.selectAll();
        request.setAttribute("book",book);

        request.getRequestDispatcher("admin_book.jsp").forward(request, response);
    }
}
