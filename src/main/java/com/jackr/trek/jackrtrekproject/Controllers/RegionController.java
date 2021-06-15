package com.jackr.trek.jackrtrekproject.Controllers;

import com.jackr.trek.jackrtrekproject.Models.Region;
import com.jackr.trek.jackrtrekproject.Repositorys.RegionRepository;
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
        model.addAttribute("regionsModel",regionRepo.findAll());
        return "regionsView";
    }

    @GetMapping("/region")
    public String displaySingleRegion(@PathVariable String nameOfRegion, Model model){
        Optional<Region> retrievedRegion = regionRepo.findByNameOfRegion(nameOfRegion);
        model.addAttribute("regionModel",retrievedRegion.get());
        return "regionView";

    }

}
