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

    @RequestMapping("/treks/{name}")
    public String displaySingleTrek(@PathVariable String name, Model model) {
        Optional<Trek> retrievedTrek = trekRepo.findByTrekName(name);
        Trek foundTrek = retrievedTrek.get();
        model.addAttribute("trek", foundTrek);
        return "trekView";
    }

//    @RequestMapping("/treks")
//    public String displayTreks(Model model) {
//        model.addAttribute("trekModel", trekRepo.findAll());
//        return "trekView";
//    }

}