package com.example.biludlejning.services;

import com.example.biludlejning.models.Lejeaftale;
import com.example.biludlejning.repos.MockLejeaftaleRepo;
import org.springframework.stereotype.Service;

@Service
public class LejeaftaleService {

    private final MockLejeaftaleRepo repo;

    public LejeaftaleService(MockLejeaftaleRepo repo) {
        this.repo = repo;
    }

    public void opretLejeaftale(Lejeaftale lejeaftale) {
        repo.addLejeaftale(lejeaftale);
    }



}
