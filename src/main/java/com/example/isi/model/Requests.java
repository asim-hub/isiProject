package com.example.isi.model;

public class Requests {
    private String dateStart;
    private String dateStartMax;
    private String dateStop;
    private String dateStopMax;
    private Integer destination_lat;
    private Integer destination_lng;
    private Integer id;
    private Integer id_sender;
    private Integer money;
    private Integer source_lat;
    private Integer source_lng;
    private String typeGoods;
    private Integer volume;
    private Integer weight;

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateStartMax() {
        return dateStartMax;
    }

    public void setDateStartMax(String dateStartMax) {
        this.dateStartMax = dateStartMax;
    }

    public String getDateStop() {
        return dateStop;
    }

    public void setDateStop(String dateStop) {
        this.dateStop = dateStop;
    }

    public String getDateStopMax() {
        return dateStopMax;
    }

    public void setDateStopMax(String dateStopMax) {
        this.dateStopMax = dateStopMax;
    }

    public Integer getDestination_lat() {
        return destination_lat;
    }

    public void setDestination_lat(Integer destination_lat) {
        this.destination_lat = destination_lat;
    }

    public Integer getDestination_lng() {
        return destination_lng;
    }

    public void setDestination_lng(Integer destination_lng) {
        this.destination_lng = destination_lng;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_sender() {
        return id_sender;
    }

    public void setId_sender(Integer id_sender) {
        this.id_sender = id_sender;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getSource_lat() {
        return source_lat;
    }

    public void setSource_lat(Integer source_lat) {
        this.source_lat = source_lat;
    }

    public Integer getSource_lng() {
        return source_lng;
    }

    public void setSource_lng(Integer source_lng) {
        this.source_lng = source_lng;
    }

    public String getTypeGoods() {
        return typeGoods;
    }

    public void setTypeGoods(String typeGoods) {
        this.typeGoods = typeGoods;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Requests(String dateStart, String dateStartMax, String dateStop, String dateStopMax, Integer destination_lat, Integer destination_lng, Integer id, Integer id_sender, Integer money, Integer source_lat, Integer source_lng, String typeGoods, Integer volume, Integer weight) {
        this.dateStart = dateStart;
        this.dateStartMax = dateStartMax;
        this.dateStop = dateStop;
        this.dateStopMax = dateStopMax;
        this.destination_lat = destination_lat;
        this.destination_lng = destination_lng;
        this.id = id;
        this.id_sender = id_sender;
        this.money = money;
        this.source_lat = source_lat;
        this.source_lng = source_lng;
        this.typeGoods = typeGoods;
        this.volume = volume;
        this.weight = weight;
    }

    public Requests() {

    }
}
