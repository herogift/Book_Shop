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

@WebServlet("/selectBook")
public class SelectBook extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        ArrayList<BS_Category> f_list = Cate_Dao.selectCate("father");
        request.setAttribute("f_list",f_list);
        ArrayList<BS_Category> c_list = Cate_Dao.selectCate("child");
        request.setAttribute("c_list",c_list);

        String fid = request.getParameter("fid");
        String cid = request.getParameter("cid");

        int id = 0;
        ArrayList<BS_Book> list = null;
        if(fid!=null){
            id = Integer.parseInt(fid);
            list = B_Dao.selectByFid(id);
        }
        if(cid!=null){
            id = Integer.parseInt(cid);
            list = B_Dao.selectByCid(id);
        }
        request.setAttribute("title",Cate_Dao.selectById(id).getC_Name());
        request.setAttribute("list",list);
        request.getRequestDispatcher("bookList.jsp").forward(request, response);


    }
}