package com.example.demo.model;

public class User {

    private int id;
    private String login;
    private String password;
    private Post post;


    public User(int id, String login, String password, Post post) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
