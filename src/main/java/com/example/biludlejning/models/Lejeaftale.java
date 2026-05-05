package com.example.biludlejning.models;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
public class Lejeaftale {

    private int id;
    private int bilId;
    private int kundeId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDato;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate slutDato;

    public Lejeaftale(int id, int bilId, int kundeId, LocalDate startDato, LocalDate slutDato) {
        this.id = id;
        this.bilId = bilId;
        this.kundeId = kundeId;
        this.startDato = startDato;
        this.slutDato = slutDato;
    }

    public Lejeaftale() {}

    //Getters
    public int getId(){
        return id;
    }

    public int getBilId() {
        return bilId;
    }

    public int getKundeId() {
        return kundeId;
    }

    public LocalDate getStartDato() {
        return startDato;
    }

    public LocalDate getSlutDato() {
        return slutDato;
    }

    //Setters


    public void setId(int id) {
        this.id = id;
    }

    public void setBilId(int bilId) {
        this.bilId = bilId;
    }

    public void setKundeId(int kundeId) {
        this.kundeId = kundeId;
    }

    public void setStartDato(LocalDate startDato) {
        this.startDato = startDato;
    }

    public void setSlutDato(LocalDate slutDato) {
        this.slutDato = slutDato;
    }
}