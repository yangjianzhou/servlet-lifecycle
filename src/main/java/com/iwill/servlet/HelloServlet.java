package com.iwill.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(" invoke [HelloServlet][get] method ");
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(" invoke [HelloServlet][post[ method ");
        super.doPost(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(" invoke [HelloServlet][service] method ");
        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println(" invoke [HelloServlet][destroy] method ");
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        System.out.println(" invoke [HelloServlet][init] method ");
        super.init();
    }
}
