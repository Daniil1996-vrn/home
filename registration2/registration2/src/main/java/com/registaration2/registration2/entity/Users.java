package com.registaration2.registration2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID_USER;

    @Column(name="External_ID")
    private Long External_ID;

    @Column(name="FirstName")
    private String FirstName;

    @Column(name="SecondName")
    private String SecondName;

    @Column(name="Email")
    private String Email;

    @Column(name="Login")
    private String Login;

    @Column(name="Password")
    private String Password;

    @Column(name="Phone")
    private String Phone;

    @Column(name="Photo")
    private String Photo;

    @Column(name="ID_Role")
    private Long ID_Role;

    public Users() {
    }

    public void setID_USER(Long ID_USER) {
        this.ID_USER = ID_USER;
    }

    public void setExternal_ID(Long external_ID) {
        External_ID = external_ID;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setPhoto(String photo) {
        Photo = photo;
    }

    public void setID_Role(Long ID_Role) {
        this.ID_Role = ID_Role;
    }

    public Long getID_USER() {
        return ID_USER;
    }

    public Long getExternal_ID() {
        return External_ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getEmail() {
        return Email;
    }

    public String getLogin() {
        return Login;
    }

    public String getPassword() {
        return Password;
    }

    public String getPhone() {
        return Phone;
    }

    public String getPhoto() {
        return Photo;
    }

    public Long getID_Role() {
        return ID_Role;
    }
}
