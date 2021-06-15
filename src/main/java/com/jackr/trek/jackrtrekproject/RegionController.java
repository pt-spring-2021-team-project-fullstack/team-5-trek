package com.jackr.trek.jackrtrekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class RegionController {

    @Resource
    private RegionRepository regionRepo;

    @RequestMapping("/regions")
    public String displayRegions(Model model) {
        model.addAttribute("regions",regionRepo.findAll());
        return "regionsView";
    }

//    @GetMapping("/regions/{nameOfRegion}")
//    public String displaySingleRegion(@PathVariable String nameOfRegion, Model model){
//        Optional<Region> retrievedRegion = regionRepo.findByRegion(nameOfRegion);
//        model.addAttribute("region",retrievedRegion);
//        return "regionView";
//
//    }

}
