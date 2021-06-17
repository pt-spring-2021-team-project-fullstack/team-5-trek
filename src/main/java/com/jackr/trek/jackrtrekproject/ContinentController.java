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

    @Resource
    private RegionRepository regionRepo;

    @RequestMapping("/continents")
    public String displayContinents(Model model) {
        model.addAttribute("continents", continentRepo.findAll());
        return "continentsView";
    }


    @GetMapping("/continents/{name}")
    public String displaySingleContinent(@PathVariable String name, Model model) {
        Optional<Continent> retrievedContinent = continentRepo.findByName(name);
        model.addAttribute("continent", retrievedContinent.get());
        return "continentView";
    }

//    @RequestMapping("/continents/{name}")
//    public String displayRegions(Model model) {
//        model.addAttribute("regionsModel", regionRepo.findAll());
//        return "continentsView";
//    }
//
//    @GetMapping("/continents/{name}")
//    public String displayContinentRegions(Model model) {
//        model.addAttribute("regionIdentifier", continentRepo.findAll());
//        return "continentsView";
//    }

    @RequestMapping("/continents/{name}")
    public String displayContinentRegions(Model model) {
        model.addAttribute("regionIdentifier", regionRepo.findAll());
        return "continentsView";
    }
}
