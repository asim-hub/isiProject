package com.example.isi.model;

public class Goods {
    private Integer id;
    private String type;

    public Goods(Integer id, String type) {
        this.id = id;
        this.type = type;
    }

    public Goods() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
