package com.example.isi.model;

public class Senders {
    private Integer id;
    private Integer id_user;
    private Integer nrReq;

    public Senders(Integer id, Integer id_user, Integer nrReq) {
        this.id = id;
        this.id_user = id_user;
        this.nrReq = nrReq;
    }

    public Senders() {

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getNrReq() {
        return nrReq;
    }

    public void setNrReq(Integer nrReq) {
        this.nrReq = nrReq;
    }
}
