package com.HandyPerson.domain;

public class User {
    private int id;
    private String name;
    private String username;
    private String password;
    private String postCode;
    private boolean isHandyperson;

    public User() {

    }

    public User(String name, String username, String password, String postCode) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.postCode = postCode;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getpostCode() {
        return postCode;
    }

    public void setpostCode(String postCode) {
        this.postCode = postCode;
    }

    public boolean isHandyperson(){return this.isHandyperson;}

    public void isHandyperson(boolean isHandyperson){this.isHandyperson = isHandyperson;}

}
