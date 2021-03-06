package com.tej.petclinic.controllers;

import com.tej.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @project tej-petclinic
 * @autor tejnal on 2020-04-12
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model ) {
        model.addAttribute("owners", ownerService.findAll());
        return "owner/index";
    }
}
