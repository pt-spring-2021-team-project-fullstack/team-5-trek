package com.jackr.trek.jackrtrekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;

    @RequestMapping("/continents")
    public String displayContinents(Model model) {
        model.addAttribute("continents", continentRepo.findAll());
        return "continentsView";
    }

    @GetMapping("/continent/{nameOfContinent}")
    public String displaySingleContinent(@PathVariable String nameOfContinent, Model model) {
        Continent retrievedContinent = continentRepo.findByContinent(nameOfContinent);
        model.addAttribute("continent", retrievedContinent);
        return "continentView";
    }
}
