package com.example.biludlejning.services;

import com.example.biludlejning.models.Lejeaftale;
import com.example.biludlejning.repos.LejeaftaleRepo;
import com.example.biludlejning.repos.MockLejeaftaleRepo;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class LejeaftaleService {

    private final LejeaftaleRepo repo;

    public LejeaftaleService(LejeaftaleRepo repo) {
        this.repo = repo;
    }

    public boolean opretLejeaftale(Lejeaftale lejeaftale) {

        if (lejeaftale.getStartDato() == null || lejeaftale.getSlutDato() == null) {
            return false;
        }

        if (lejeaftale.getSlutDato().isBefore(lejeaftale.getStartDato())) {
            return false;
        }

        boolean ledig = erBilLedig(
                lejeaftale.getBilId(),
                lejeaftale.getStartDato(),
                lejeaftale.getSlutDato()
        );

        if (!ledig) {
            return false; // kan ikke oprette
        }

        repo.addLejeaftale(lejeaftale);
        return true;
    }

//Metode der forhindrer en bil til at være udlejet dobbelt, og kan ikke udlejes i perioder hvor den er lejet.
    public boolean erBilLedig(int bilId, LocalDate nyStart, LocalDate nySlut) {

        if (nyStart == null || nySlut == null) {
            return false;
        }

        for (Lejeaftale aftale : repo.findAll()) {

            if (aftale.getBilId() == bilId) {

                if (!nyStart.isAfter(aftale.getSlutDato()) &&
                        !nySlut.isBefore(aftale.getStartDato())) {

                    return false;
                }
            }
        }

        return true;
    }



}
