package com.cxsj1.homework.w5.servlet.cart;

import com.cxsj1.homework.w5.dao.B_Dao;
import com.cxsj1.homework.w5.dao.C_Dao;
import com.cxsj1.homework.w5.dao.Cate_Dao;
import com.cxsj1.homework.w5.entity.BS_Book;
import com.cxsj1.homework.w5.entity.BS_Cart;
import com.cxsj1.homework.w5.entity.BS_Category;
import com.cxsj1.homework.w5.entity.BS_User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/showCart")
public class ShowCart extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<BS_Category> f_list = Cate_Dao.selectCate("father");
        request.setAttribute("f_list",f_list);
        ArrayList<BS_Category> c_list = Cate_Dao.selectCate("child");
        request.setAttribute("c_list",c_list);

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        String isLogin = (String) session.getAttribute("isLogin");
        BS_User user = (BS_User) session.getAttribute("user");

        if(user!=null && isLogin.equals("1")){
            String uid = (String)user.getID();
            ArrayList<BS_Cart> list = C_Dao.getCart(uid);

            request.setAttribute("cartList",list);

            request.getRequestDispatcher("cart.jsp").forward(request, response);

        }else {
            PrintWriter out = response.getWriter();
            out.write("<script>");
            out.write("alert('请登录之后再购买')");
            out.write("location.herf='login.jsp'");
            out.write("</script>");
            out.close();
            return;
        }


    }
}
