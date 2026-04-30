package com.example.biludlejning.controllers;
import com.example.biludlejning.models.Lejeaftale;
import com.example.biludlejning.services.LejeaftaleService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {


    private final LejeaftaleService service;


    public Controller(LejeaftaleService service) {
        this.service = service;
    }



    @GetMapping("/lejeaftale")
    public String lejeaftale(Model model){
        model.addAttribute("lejeaftale", new Lejeaftale());
        return "lejeaftale";
    }

    @PostMapping("/lejeaftale")
    public String opretLejeaftale(Lejeaftale lejeaftale) {

       service.opretLejeaftale(lejeaftale);

        return "redirect:/lejeaftale";
    }



}
