package com.jeorgius.ejb;

//import com.jeorgius.entities.AddressEntity;
import com.jeorgius.entities.UserEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

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

    public List<UserEntity> getUsers(){
        TypedQuery<UserEntity> query = em.createQuery(
                "SELECT u FROM UserEntity u", UserEntity.class);
        System.out.println(query.getResultList());
        return query.getResultList();
    }

//    public List<AddressEntity> getAddresses(){
//        TypedQuery<AddressEntity>
//    }
}
