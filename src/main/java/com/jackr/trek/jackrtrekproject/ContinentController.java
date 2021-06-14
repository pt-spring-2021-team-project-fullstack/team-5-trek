package com.jackr.trek.jackrtrekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;

    @RequestMapping("/continents")
    public String displayContinents(Model model) {
        model.addAttribute("continentsModel", continentRepo.findAll());
        return "continentsView";
    }

    @GetMapping("/continent")
    public String displaySingleContinent(@PathVariable String name, Model model) {
        Optional<Continent> retrievedContinent = continentRepo.findByName(name);
        model.addAttribute("continentModel", retrievedContinent.get());
        return "continentView";
    }
}
