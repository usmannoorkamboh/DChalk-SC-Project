package com.example.usmannoor.dchalk11.CoreClasses;

/**
 * Created by Noman on 5/31/2017.
 */

/**
 * Container for user profile
 */
public class User{
    private  int id;
    private   String username;
    private  String password;
    private  String Name;
    private  String email;

    /**
     *
     * @param username
     * @param password
     * @param email
     * @param name
     */
    public User(String username, String password, String email,String name ) {
         this.username = username;
        this.password = password;
        Name = name;
        this.email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

