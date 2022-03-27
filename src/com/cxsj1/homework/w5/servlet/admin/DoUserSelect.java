package com.cxsj1.homework.w5.servlet.admin;

import com.cxsj1.homework.w5.dao.U_Dao;
import com.cxsj1.homework.w5.entity.BS_User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@WebServlet("/managers/admin_douserselect")
public class DoUserSelect extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int cpage = 1; //当前页
        int count = 8; //每页的数据项

        String cp = request.getParameter("cp");
        String keyword = request.getParameter("keywords");

        if(cp!=null){
            cpage = Integer.parseInt(cp);
        }
        int arr[] = U_Dao.totalPage(count, keyword);

        ArrayList<BS_User> list = U_Dao.selectAll(cpage, count, keyword);
        request.setAttribute("userlist",list);
        request.setAttribute("tsum",arr[0]);
        request.setAttribute("tpage",arr[1]);
        request.setAttribute("cpage",cpage);

        if(keyword!=null){
            request.setAttribute("searchParams","&keywords="+keyword);
        }
        request.getRequestDispatcher("/managers/admin_user.jsp").forward(request, response);
    }
}

