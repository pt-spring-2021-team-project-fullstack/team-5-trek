package com.jackr.trek.jackrtrekproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TrekRepository trekRepo;

    @Resource
    private TrekTypeRepository trekTypeRepo;

    @Resource
    private ContinentRepository continentRepo;

    @Override
    public void run(String... args) throws Exception {

        TrekType easy = new TrekType();
        TrekType moderate = new TrekType();
        TrekType strenuous = new TrekType();
        TrekType difficult = new TrekType();
        trekTypeRepo.save(easy);
        trekTypeRepo.save(moderate);
        trekTypeRepo.save(strenuous);
        trekTypeRepo.save(difficult);

        //we will eventually include all the treks here and trek1 will be renamed to the actual trek name
        Trek trek1 = new Trek("", true, "", "", "",
                "", "", "", "", easy);

        trekRepo.save(trek1);
    }
}