package com.jars.shopping.LogowanieDoSystemu.SessionData;

import com.jars.shopping.Users.User;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/addNewUser")
public class AddNewUser extends HttpServlet {

    @Inject
    UserDao userDao;


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        userDao.saveUserInDataBase(new User(username, password, "createdInApp", false));
    }
}