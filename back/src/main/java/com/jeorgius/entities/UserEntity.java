package com.jeorgius.entities;

import javax.persistence.*;

@Entity
@Table(name="user", schema="userdata")
@SequenceGenerator(name="h", sequenceName = "userdata.hibernate_sequence")
public class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "h")
    private Integer id;
    private String nick;
    private String email;
    private String pw;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
