package com.lanou3g.study;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Server extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                req.setCharacterEncoding("utf-8");

        String uname = req.getParameter("uname");
        String age = req.getParameter("age");
        String loc = req.getParameter("loc");
        System.out.println("data is" +"/t"+ uname +"/t"+ age+"/t" +"/t"+ loc);
            JDBCUtil.show(uname,age,loc);
            resp.getWriter().write("OK");
    }
}
