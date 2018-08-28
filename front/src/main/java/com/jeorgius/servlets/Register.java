package com.jeorgius.servlets;

import com.jeorgius.ejb.UserEJB;
import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class Register extends HttpServlet {

    @EJB
    UserEJB userEJB;

    @Override
    public void doPost (HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String nick = req.getParameter("nick");
        String email = req.getParameter("email");
        String pw = req.getParameter("pw");

        userEJB.createUser(nick, email, pw);
        resp.getWriter().write("What's up, " + nick);
    }
}
