package com.example.biludlejning.models;
//Attributter
public class Bil {
    private int id;
    private String vognnr;
    private String stelnr;
    private String brand;
    private String model;
    private Status status;

    //Konstruktor
    public Bil(int id, String vognnr, String stelnr, String brand, String model, Status status) {

        this.id = id;
        this.vognnr = vognnr;
        this.stelnr = stelnr;
        this.brand = brand;
        this.model = model;
        this.status = status;
    }

    public Bil() {
    }

    //Getters

    public int getId() {
        return id;
    }

    public String getVognnr() {
        return vognnr;
    }

    public String getStelnr() {
        return stelnr;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Status getStatus() {
        return status;
    }


    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setVognr(String vognnr) {
        this.vognnr = vognnr;
    }

    public void setStelnr(String stelnr) {
        this.stelnr = stelnr;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}