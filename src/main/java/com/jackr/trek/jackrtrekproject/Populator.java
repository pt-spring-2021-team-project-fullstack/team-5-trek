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

    @Resource
    private RegionRepository regionRepo;

    @Override
    public void run(String... args) throws Exception {

        TrekType easy = new TrekType("easy", "continent here", "region here", "description of trek type",
                "difficulty level", "physical requirements", "trek tips here", "terrain info here");
        TrekType moderate = new TrekType("moderate", "continent here", "region here", "description of trek type",
                "difficulty level", "physical requirements", "trek tips here", "terrain info here");
        TrekType strenuous = new TrekType("strenuous", "continent here", "region here", "description of trek type",
                "difficulty level", "physical requirements", "trek tips here", "terrain info here");
        TrekType difficult = new TrekType("difficult", "continent here", "region here", "description of trek type",
                "difficulty level", "physical requirements", "trek tips here", "terrain info here");
        trekTypeRepo.save(easy);
        trekTypeRepo.save(moderate);
        trekTypeRepo.save(strenuous);
        trekTypeRepo.save(difficult);

        //we will eventually include all the treks here and trek1 will be renamed to the actual trek name
        Trek trek1 = new Trek("", true, "", "", "",
                "", "", "", "", easy);

        trekRepo.save(trek1);

        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
        Continent africa = new Continent("Africa");
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent australia = new Continent("Australia");
        Continent antarctica = new Continent("Antarctica");
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(africa);
        continentRepo.save(europe);
        continentRepo.save(asia);
        continentRepo.save(australia);
        continentRepo.save(antarctica);

        Region mountainousWest = new Region("Mountainous West");
        Region greatPlains = new Region("Great Plains");
        Region canadianShield = new Region("Canadian Shield");
        Region variedEasternRegion = new Region("Varied Eastern Region");
        Region caribbean = new Region("Caribbean");
        Region mountainsAndHighlands = new Region("Mountains and Highlands");
        Region riverBasins = new Region("riverBasins");
        Region coastalPlains = new Region("Coastal Plains");
        Region sahara = new Region("Sahara");
        Region sahel = new Region("Sahel");
        Region ethiopianHighlands = new Region("Ethiopian Highlands");
        Region savanna = new Region("Savanna");
        Region swahiliCoast = new Region("Swahili Coast");
        Region rainForest = new Region("Rain Forest");
        Region africanGreatLakes = new Region("African Great Lakes";
        Region southernAfrica = new Region("Southern Africa");
        Region westernUplands = new Region("Western Uplands");
        Region northEuropeanPlain = new Region("North European Plain");
        Region centralUplands = new Region("Central Uplands");
        Region alpineMountains = new Region("Alpine Mountains");
        Region mountainSystems = new Region("Mountain Systems");
        Region plateaus = new Region("Plateaus");
        Region plainsSteppesAndDeserts = new Region("Plains, Steppes, and Deserts");
        Region freshwaterEnvironments = new Region("Freshwater Environments");
        Region saltwaterEnvironments = new Region("Saltwater Environments");
        Region continentalIslands = new Region("Continental Islands");
        Region highIslands = new Region("High Islands");
        Region lowIslands = new Region("Low Islands");
        Region antarcticPeninsula = new Region("Antarctic Peninsula");
        Region eastAntarctica = new Region("East Antarctica");
        Region southPole = new Region("South Pole");
        Region westAntarctica = new Region("West Antarctica");
        Region rossSea = new Region("Ross Sea");

        regionRepo.save(mountainousWest);
        regionRepo.save(greatPlains);
        regionRepo.save(canadianShield);
        regionRepo.save(variedEasternRegion);
        regionRepo.save(caribbean);
        regionRepo.save(mountainsAndHighlands);
        regionRepo.save(riverBasins);
        regionRepo.save(coastalPlains);
        regionRepo.save(sahara);
        regionRepo.save(sahel);
        regionRepo.save(ethiopianHighlands);
        regionRepo.save(savanna);
        regionRepo.save(swahiliCoast);
        regionRepo.save(rainForest);
        regionRepo.save(africanGreatLakes);
        regionRepo.save(southernAfrica);
        regionRepo.save(westernUplands);
        regionRepo.save(northEuropeanPlain);
        regionRepo.save(centralUplands);
        regionRepo.save(alpineMountains);
        regionRepo.save(mountainSystems);
        regionRepo.save(plateaus);
        regionRepo.save(plainsSteppesAndDeserts);
        regionRepo.save(freshwaterEnvironments);
        regionRepo.save(saltwaterEnvironments);
        regionRepo.save(continentalIslands);
        regionRepo.save(highIslands);
        regionRepo.save(lowIslands);
        regionRepo.save(antarcticPeninsula);
        regionRepo.save(eastAntarctica);
        regionRepo.save(southPole);
        regionRepo.save(westAntarctica);
        regionRepo.save(rossSea);
    }
}