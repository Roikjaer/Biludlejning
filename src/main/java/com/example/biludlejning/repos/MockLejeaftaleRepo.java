package com.example.biludlejning.repos;

import com.example.biludlejning.models.Lejeaftale;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MockLejeaftaleRepo implements LejeaftaleRepo {

    private final List<Lejeaftale> aftaler = new ArrayList<>();

    // Find alle lejeaftaler
    public List<Lejeaftale> findAll() {
        return aftaler;
    }

    // Opret ny lejeaftale
    public void addLejeaftale(Lejeaftale aftale) {
        aftale.setId(aftaler.size() + 1);
        aftaler.add(aftale);
    }
}