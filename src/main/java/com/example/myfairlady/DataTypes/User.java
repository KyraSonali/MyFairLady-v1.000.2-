package com.example.myfairlady.DataTypes;

public class User {


    private int id;
    private String username;
    private String password;
    private String authority_level;

    public User(int id, String u, String p, String au){

        this.id = id;
        this.username = u;
        this.password = p;
        this.authority_level = au;


    }

    public int getId(){
        return this.id;
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

    public String getAuthoritylevel() {
        return authority_level;
    }

    public void setAuthoritylevel(String authority_level) {
        this.authority_level = authority_level;
    }

    public String toString(){

        return ("Username: " + this.username + " Password: " + this.password + " Authority Level: " + this.authority_level);

    }
}
