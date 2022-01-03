package com.example.isi.model;

public class Contract {
    private Integer destination_lat;
    private Integer destination_lng;
    private Integer distance_free;
    private Integer distance_full;
    private Integer id;
    private Integer id_request;
    private Integer id_sender;
    private Integer id_transporter;
    private Integer id_truck;
    private String payTerm;
    private Integer source_lat;
    private Integer source_lng;
    private Integer totalCost;
    private String typeGoods;
    private Integer volume;
    private Integer weight;

    public Contract(Integer destination_lat, Integer destination_lng, Integer distance_free, Integer distance_full, Integer id, Integer id_request, Integer id_sender, Integer id_transporter, Integer id_truck, String payTerm, Integer source_lat, Integer source_lng, Integer totalCost, String typeGoods, Integer volume, Integer weight) {
        this.destination_lat = destination_lat;
        this.destination_lng = destination_lng;
        this.distance_free = distance_free;
        this.distance_full = distance_full;
        this.id = id;
        this.id_request = id_request;
        this.id_sender = id_sender;
        this.id_transporter = id_transporter;
        this.id_truck = id_truck;
        this.payTerm = payTerm;
        this.source_lat = source_lat;
        this.source_lng = source_lng;
        this.totalCost = totalCost;
        this.typeGoods = typeGoods;
        this.volume = volume;
        this.weight = weight;
    }

    public Contract() {

    }

    public Integer getDestination_lat() {
        return destination_lat;
    }

    public Integer getDestination_lng() {
        return destination_lng;
    }

    public Integer getDistance_free() {
        return distance_free;
    }

    public Integer getDistance_full() {
        return distance_full;
    }

    public Integer getId() {
        return id;
    }

    public Integer getId_request() {
        return id_request;
    }

    public Integer getId_sender() {
        return id_sender;
    }

    public Integer getId_transporter() {
        return id_transporter;
    }

    public Integer getId_truck() {
        return id_truck;
    }

    public String getPayTerm() {
        return payTerm;
    }

    public Integer getSource_lat() {
        return source_lat;
    }

    public Integer getSource_lng() {
        return source_lng;
    }

    public Integer getTotalCost() {
        return totalCost;
    }

    public String getTypeGoods() {
        return typeGoods;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setDestination_lat(Integer destination_lat) {
        this.destination_lat = destination_lat;
    }

    public void setDestination_lng(Integer destination_lng) {
        this.destination_lng = destination_lng;
    }

    public void setDistance_free(Integer distance_free) {
        this.distance_free = distance_free;
    }

    public void setDistance_full(Integer distance_full) {
        this.distance_full = distance_full;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setId_request(Integer id_request) {
        this.id_request = id_request;
    }

    public void setId_sender(Integer id_sender) {
        this.id_sender = id_sender;
    }

    public void setId_transporter(Integer id_transporter) {
        this.id_transporter = id_transporter;
    }

    public void setId_truck(Integer id_truck) {
        this.id_truck = id_truck;
    }

    public void setPayTerm(String payTerm) {
        this.payTerm = payTerm;
    }

    public void setSource_lat(Integer source_lat) {
        this.source_lat = source_lat;
    }

    public void setSource_lng(Integer source_lng) {
        this.source_lng = source_lng;
    }

    public void setTotalCost(Integer totalCost) {
        this.totalCost = totalCost;
    }

    public void setTypeGoods(String typeGoods) {
        this.typeGoods = typeGoods;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}
