package com.example.biludlejning.repos;

import com.example.biludlejning.models.Lejeaftale;

import java.util.List;

public interface LejeaftaleRepo {
    List<Lejeaftale> findAll();
void addLejeaftale(Lejeaftale lejeaftale);


}
