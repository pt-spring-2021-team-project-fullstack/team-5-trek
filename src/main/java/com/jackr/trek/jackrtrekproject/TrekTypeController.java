package com.jackr.trek.jackrtrekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TrekTypeController {

    @Resource
    private TrekTypeRepository trekTypeRepo;

    @RequestMapping({"/trek-types", "/", ""})
    public String displayTrekTypes(Model model) {
        model.addAttribute("trek-types", trekTypeRepo.findAll());
        return "trekTypesView";
    }

    @GetMapping("/trek-types/{difficultyLevel}")
    public String displaySingleTrekType(@PathVariable String difficultyLevel, Model model) {
        TrekType retrievedTrekType = trekTypeRepo.findTrekTypeByDifficultyLevel(difficultyLevel);
        model.addAttribute("trek-type", retrievedTrekType);
        return "trekTypeView";
    }
}
