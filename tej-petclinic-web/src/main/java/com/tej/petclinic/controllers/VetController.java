package com.tej.petclinic.controllers;

import com.tej.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-12
 */
@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/index", "/index.html"})
    public String listVets(Model model ) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
