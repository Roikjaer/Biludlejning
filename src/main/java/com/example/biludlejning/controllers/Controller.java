package com.example.biludlejning.controllers;
import com.example.biludlejning.models.Lejeaftale;
import com.example.biludlejning.repos.BilRepo;
import com.example.biludlejning.services.LejeaftaleService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {


    private final LejeaftaleService service;
    private final BilRepo bilRepo;


    public Controller(LejeaftaleService service, BilRepo bilRepo) {
        this.service = service;
        this.bilRepo = bilRepo;
    }



    @GetMapping("/lejeaftale")
    public String lejeaftale(Model model){
        model.addAttribute("lejeaftale", new Lejeaftale());
        model.addAttribute("biler",  bilRepo.findAll());
        return "lejeaftale";
    }

    @PostMapping("/lejeaftale")
    public String opretLejeaftale(Lejeaftale lejeaftale, Model model) {
        boolean success = service.opretLejeaftale(lejeaftale);

        if(!success){
            model.addAttribute("error", "Bilen er ikke ledig eller dato er ugyldig");
            model.addAttribute("biler", bilRepo.findAll());
            return "lejeaftale";
        }
        model.addAttribute("success", "Lejeaftale oprettet!");
        model.addAttribute("biler", bilRepo.findAll());
        model.addAttribute("lejeaftale", new Lejeaftale()); // Forfra

        return "lejeaftale";

    }



}
