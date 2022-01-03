package com.example.isi.model;

public class Trucks {
    private Integer id;
    private String availability;
    private String brand;
    private Integer emptyprice;
    private Integer fullprice;
    private Integer height;
    private Integer idTransporters;
    private Integer lat;
    private Integer length;
    private Integer lng;
    private Integer volume;
    private Integer weight;
    private Integer width;

    public Trucks(Integer id, String availability, String brand, Integer emptyprice, Integer fullprice, Integer height, Integer idTransporters, Integer lat, Integer length, Integer lng, Integer volume, Integer weight, Integer width) {
        this.id = id;
        this.availability = availability;
        this.brand = brand;
        this.emptyprice = emptyprice;
        this.fullprice = fullprice;
        this.height = height;
        this.idTransporters = idTransporters;
        this.lat = lat;
        this.length = length;
        this.lng = lng;
        this.volume = volume;
        this.weight = weight;
        this.width = width;
    }

    public Trucks() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getEmptyprice() {
        return emptyprice;
    }

    public void setEmptyprice(Integer emptyprice) {
        this.emptyprice = emptyprice;
    }

    public Integer getFullprice() {
        return fullprice;
    }

    public void setFullprice(Integer fullprice) {
        this.fullprice = fullprice;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getIdTransporters() {
        return idTransporters;
    }

    public void setIdTransporters(Integer idTransporters) {
        this.idTransporters = idTransporters;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getLng() {
        return lng;
    }

    public void setLng(Integer lng) {
        this.lng = lng;
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

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
