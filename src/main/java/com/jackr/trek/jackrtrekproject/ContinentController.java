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

    @Resource
    private TrekRepository trekRepo;

    @Resource
    private TrekTypeRepository trekTypeRepo;

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

    @RequestMapping("/continents/{name}")
    public String displayContinentRegions(Model model) {
        model.addAttribute("continent_id", regionRepo.findAll());
        return "continentView";
    }
}
