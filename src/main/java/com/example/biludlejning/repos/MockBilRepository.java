package com.example.biludlejning.repos;

import com.example.biludlejning.models.Bil;
import com.example.biludlejning.models.Status;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MockBilRepository implements BilRepo {

    private List<Bil> biler = new ArrayList<>();

    public MockBilRepository() {
        biler.add(new Bil(1, "V123", "S123", "BMW", "320d", Status.TILGÆNGELIG));
        biler.add(new Bil(2, "V124", "S124", "Audi", "A4", Status.UDLEJET));
    }

    @Override
    public List<Bil> findAll() {
        return biler;
    }

    @Override
    public void addBil(Bil bil) {
        biler.add(bil);
    }
}