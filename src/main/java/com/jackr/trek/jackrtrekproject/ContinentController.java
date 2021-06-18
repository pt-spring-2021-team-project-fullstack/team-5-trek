package com.jackr.trek.jackrtrekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;

    @RequestMapping("/continents")
    public String displayContinents(Model model) {
        model.addAttribute("continents", continentRepo.findAll());
        return "continentsView";
    }

//    @GetMapping("/continents/{name}")
//    public String displaySingleContinent(@PathVariable String name, Model model) {
//        Continent retrievedContinent = continentRepo.findByContinent(name);
//        model.addAttribute("continent", retrievedContinent);
//        return "continentView";
//    }


    //    @RequestMapping("/continents")
//    public String displayContinents(Model model) {
//        model.addAttribute("continentsModel", continentRepo.findAll());
//        return "continentsView";
//    }
//
    @GetMapping("/continents/{name}")
    public String displaySingleContinent(@PathVariable String name, Model model) {
        Optional<Continent> retrievedContinent = continentRepo.findByName(name);
        model.addAttribute("continent", retrievedContinent.get());
        return "continentView";
    }

    @GetMapping("/continents/{name}/{regionName}")
    public String displayRegionsInContinent(@PathVariable String regionName, Model model) {
        Optional<Continent> retrievedRegion = continentRepo.findByName(regionName);
        model.addAttribute("continent", retrievedRegion.get());
        return "continentView";
    }
}
