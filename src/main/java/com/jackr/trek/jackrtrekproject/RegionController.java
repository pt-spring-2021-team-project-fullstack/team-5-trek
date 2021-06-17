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

    @Resource
    private ContinentRepository continentRepo;

    @Resource
    private TrekRepository trekRepo;

    @Resource
    private TrekTypeRepository trekTypeRepo;

    @RequestMapping("/regions")
    public String displayRegions(Model model) {
        model.addAttribute("regionsModel",regionRepo.findAll());
        return "regionsView";
    }

    @GetMapping("/regions/{regionName}")
    public String displaySingleRegion(@PathVariable String regionName, Model model){
        Optional<Region> retrievedRegion = regionRepo.findByRegionName(regionName);
        model.addAttribute("region",retrievedRegion.get());
        return "regionView";

    }


//    @RequestMapping("/regions")
//    public String displayRegions(Model model) {
//        model.addAttribute("regionsModel",regionRepo.findAll());
//        return "regionsView";
//    }

//    @GetMapping("/region")
//    public String displaySingleRegion(@PathVariable String nameOfRegion, Model model){
//        Optional<Region> retrievedRegion = regionRepo.findByNameOfRegion(nameOfRegion);
//        model.addAttribute("regionModel",retrievedRegion.get());
//        return "regionView";
//
//    }

}
