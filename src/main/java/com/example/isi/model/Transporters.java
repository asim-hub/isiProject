package com.example.isi.model;

public class Transporters {

    private Integer id;
    private Integer id_user;
    private Integer nrFreeTrucks;
    private Integer nrTotalTrucks;

    public Transporters(Integer id, Integer id_user, Integer nrFreeTrucks, Integer nrTotalTrucks) {
        this.id = id;
        this.id_user = id_user;
        this.nrFreeTrucks = nrFreeTrucks;
        this.nrTotalTrucks = nrTotalTrucks;
    }

    public Transporters() {

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

    public Integer getNrFreeTrucks() {
        return nrFreeTrucks;
    }

    public void setNrFreeTrucks(Integer nrFreeTrucks) {
        this.nrFreeTrucks = nrFreeTrucks;
    }

    public Integer getNrTotalTrucks() {
        return nrTotalTrucks;
    }

    public void setNrTotalTrucks(Integer nrTotalTrucks) {
        this.nrTotalTrucks = nrTotalTrucks;
    }

}
