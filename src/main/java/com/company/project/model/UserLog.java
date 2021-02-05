package com.company.project.model;


import java.util.Date;

/**
 *  `id`            int(11)      NOT NULL AUTO_INCREMENT,
 *     `username`      varchar(255) NOT NULL,
 *     `password`      varchar(255) NOT NULL,
 *     `nick_name`     varchar(255) DEFAULT NULL,
 *     `sex`           int(1)       DEFAULT NULL,
 *     `register_date` datetime     NOT NULL,
 */
public class UserLog {

    private int id;
    private String username;
    private String password;
    private String nick_name;
    private int sex;
    private Date register_date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }
}
