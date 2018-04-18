package com.hyb.sep.chapter04.section04.p02;

import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * WebApplication 初始化之后，从ServletContext中可以拿到其引用
 * 调用其getServletContext，又可以拿到ServletContext的引用
 */
@WebServlet("applicationContext")
public class ApplicationContextServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getServletPath());
        WebApplicationContext applicationContext = (WebApplicationContext)req.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        System.out.println(applicationContext.getServletContext() == req.getServletContext());
        System.out.println(req.getServletContext());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
