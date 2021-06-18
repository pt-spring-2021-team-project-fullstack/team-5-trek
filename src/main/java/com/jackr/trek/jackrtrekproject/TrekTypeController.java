package com.jackr.trek.jackrtrekproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class TrekTypeController {

    @Resource
    private TrekTypeRepository trekTypeRepo;

    @RequestMapping({"/trek-types", "/", ""})
    public String displayTrekTypes(Model model) {
        model.addAttribute("trekTypesModel", trekTypeRepo.findAll());
        return "trekTypesView";
    }

    @GetMapping("/trek-types/{id}")
    public String displaySingleTrekType(@PathVariable Long id, Model model) {
        Optional<TrekType> retrievedTrekType = trekTypeRepo.findById(id);

        model.addAttribute("trekTypeModel", retrievedTrekType.get());
        return "trekTypeView";
    }
}
