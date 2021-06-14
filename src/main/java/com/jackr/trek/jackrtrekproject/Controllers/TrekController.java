package com.jackr.trek.jackrtrekproject.Controllers;

import com.jackr.trek.jackrtrekproject.Repositorys.TrekRepository;
import com.jackr.trek.jackrtrekproject.Repositorys.TrekTypeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class TrekController {

    @Resource
    private TrekRepository trekRepo;

    @Resource
    private TrekTypeRepository trekTypeRepo;

    @RequestMapping("/treks")
    public String displayTreks(Model model) {
        model.addAttribute("trekModel", trekRepo.findAll());
        return "trekView";
    }

//    @GetMapping("/trek-types/{trekType}")
//    public String displayTrekType(@PathVariable String trekType, Model model) {
//        Optional<TrekType> retrievedTrekType = trekTypeRepo.findByTrekTypePerContinent(trekType);
//        model.addAttribute("trekTypeModel", retrievedTrekType.get());
//        return "trekTypeView";
//    }
}
