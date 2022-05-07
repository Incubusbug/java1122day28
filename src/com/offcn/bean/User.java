package com.offcn.bean;

import java.util.Date;

public class User {
    private int id;
    private String username;
    private String password;
    private String telephone;
    private Date birthday;

    public User() {
    }

    public User(int id, String username, String password, String telephone, Date birthday) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.birthday = birthday;
    }

    public User(String username, String password, String telephone, Date birthday) {
        this.username = username;
        this.password = password;
        this.telephone = telephone;
        this.birthday = birthday;
    }

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", telephone='" + telephone + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
