package com.jeorgius.ejb;

import com.jeorgius.entities.UserEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserEJB {
    @PersistenceContext(unitName = "userUnit")
    EntityManager em;

    public void createUser(String nickname, String email, String pw) {
        UserEntity user = new UserEntity();
        user.setNick(nickname);
        user.setEmail(email);
        user.setPw(pw);

        em.persist(user);
    }
}
