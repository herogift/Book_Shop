package com.cxsj1.homework.w5.servlet.cart;

import com.cxsj1.homework.w5.dao.B_Dao;
import com.cxsj1.homework.w5.dao.C_Dao;
import com.cxsj1.homework.w5.entity.BS_Book;
import com.cxsj1.homework.w5.entity.BS_Cart;
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

@WebServlet("/cartAdd")
public class CartAdd extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BS_Book book = null;
        String pid = request.getParameter("id");
        String count = request.getParameter("count");
        String flag = request.getParameter("flag");

        HttpSession session = request.getSession();
        String isLogin = (String) session.getAttribute("isLogin");
        BS_User user = (BS_User) session.getAttribute("user");

        if (user != null && isLogin.equals("1")) {
            String uid = (String) user.getID();

            BS_Cart ccart = C_Dao.getCart(uid, pid);
            if (ccart != null) {
                int ccount = ccart.getC_Num();
                int newcount = ccount + Integer.parseInt(count);
                if (newcount > 5) {
                    newcount = 5;
                }
                C_Dao.updateNum(ccart.getC_ID(), newcount);
            } else {
                if (pid != null) {
                    book = B_Dao.selectById(Integer.parseInt(pid));
                }
                    BS_Cart cart = new BS_Cart(
                            0,
                            book.getB_FileName(),
                            book.getB_Name(),
                            book.getB_Price(),
                            Integer.parseInt(count),
                            book.getB_Stock(),
                            book.getB_ID(),
                            uid,
                            1
                    );
                    C_Dao.insert(cart);
            } }else{
                PrintWriter out = response.getWriter();
                out.write("<script>");
                out.write("alert('请登录之后再购买')");
                out.write("location.herf='login.jsp'");
                out.write("</script>");
                out.close();
                return;
            }

            if (flag.equals("z")) {
                response.sendRedirect("showCart");
            } else {
                response.sendRedirect(("selectBookView?id=" + pid));
            }
    }
}
