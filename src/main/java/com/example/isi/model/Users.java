package com.example.isi.model;

public class Users {
    private String email;
    private Integer id;
    private String telefon;
    private String type;

    public Users(String email, Integer id, String telefon, String type) {
        this.email = email;
        this.id = id;
        this.telefon = telefon;
        this.type = type;
    }

    public Users() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
