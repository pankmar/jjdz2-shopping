package com.jars.shopping.WebForm;

import javax.ejb.EJB;
import javax.mail.internet.ContentType;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/searchProducts")
public class SearchProductServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("application/json; charset=UTF-8");
        resp.getWriter().write("[{\"id\": \"Siema\", \"label\": \"siema_label\", \"value\": \"siema_val\"}," +
                "{\"id\": \"ola\", \"label\": \"ola_zzz\", \"value\": \"ala_zzzsfas\"}]");
    }
}
