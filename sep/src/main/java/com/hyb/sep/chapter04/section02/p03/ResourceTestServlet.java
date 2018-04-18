package com.hyb.sep.chapter04.section02.p03;


import org.springframework.core.io.Resource;
import org.springframework.web.context.support.ServletContextResource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo")
public class ResourceTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("worked!");
        Resource resource = new ServletContextResource(req.getServletContext(), "/chapter04/source.txt");
        //ServletContext 指的是 webapp的根目录
        System.out.println(req.getServletContext());
        System.out.println(resource.exists());
        Resource resourceRelative = resource.createRelative("test123");
        System.out.println(resourceRelative.exists());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
