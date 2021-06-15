package com.jackr.trek.jackrtrekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class TrekController {

    @Resource
    private TrekRepository trekRepo;

    @RequestMapping("/treks")
    public String displayTreks(Model model) {
        model.addAttribute("treks", trekRepo.findAll());
        return "treksView";
    }

    @RequestMapping("/treks/{id}")
    public String displaySingleTrek(@PathVariable long id, Model model) {
        Optional<Trek> retrievedTrek = trekRepo.findById(id);
        Trek foundTrek = retrievedTrek.get();
        model.addAttribute("trek", foundTrek);
        return "trekView";
    }

//    @RequestMapping("/treks")
//    public String displayTreks(Model model) {
//        model.addAttribute("trekModel", trekRepo.findAll());
//        return "trekView";
//    }

//    @GetMapping("/trek-types/{trekType}")
//    public String displayTrekType(@PathVariable String trekType, Model model) {
//        Optional<TrekType> retrievedTrekType = trekTypeRepo.findByTrekTypePerContinent(trekType);
//        model.addAttribute("trekTypeModel", retrievedTrekType.get());
//        return "trekTypeView";
//    }
}