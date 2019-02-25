package com.jeorgius.servlets;

import com.jeorgius.ejb.UserEJB;
import com.jeorgius.entities.UserEntity;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
        List<UserEntity> dbUsers = userEJB.getUsers();
        resp.getWriter().write("What's up, " + nick + "\n\n");



        for (UserEntity dbUser: dbUsers) {
            resp.getWriter().write(dbUser.getNick() + " " + dbUser.getEmail() + "\n");
        }
    }
}
