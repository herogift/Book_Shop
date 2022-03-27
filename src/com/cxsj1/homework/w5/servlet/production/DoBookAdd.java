package com.cxsj1.homework.w5.servlet.production;

import com.cxsj1.homework.w5.dao.B_Dao;
import com.cxsj1.homework.w5.entity.BS_Book;
import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.jspsmart.upload.Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/managers/admin_doBookAdd")
public class DoBookAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        SmartUpload smartUpload = new SmartUpload();//创建对象
        smartUpload.initialize(this.getServletConfig(),request,response);//初始化
        //上传过程
        try {
            smartUpload.upload();
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
        Files files = smartUpload.getFiles();//获取对象
        File file = files.getFile(0);

        String fileName = file.getFileName();

        try {
            smartUpload.save("img/book");
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }

        Request request1 = smartUpload.getRequest();

        String name = request1.getParameter("bookName");
        String id = request1.getParameter("PID");
        String price = request1.getParameter("bookPrice");
        String desc = request1.getParameter("bookDesc");
        String stock = request1.getParameter("bookStock");

        BS_Book book = new BS_Book(
                0,
                name,
                desc,
                Double.parseDouble(price),
                Integer.parseInt(stock),
                Integer.parseInt(id.split("-")[0]),
                Integer.parseInt(id.split("-")[1]),
                fileName
                );
        int count = B_Dao.insert(book);

        if(count>0){
            response.sendRedirect("admin_bookSelect");
        }
        else {
            PrintWriter out = response.getWriter();
            out.write("<script>");
            out.write("alert('书籍添加失败')");
            out.write("location.herf='/managers/admin_toBookAdd'");
            out.write("</script>");
            out.close();
        }

        //System.out.println(fileName);
    }
}