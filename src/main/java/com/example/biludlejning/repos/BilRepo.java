package com.example.biludlejning.repos;
import com.example.biludlejning.models.Bil;
import java.util.List;



    public interface BilRepo {

        List<Bil> findAll();

        void addBil(Bil bil);
    }

