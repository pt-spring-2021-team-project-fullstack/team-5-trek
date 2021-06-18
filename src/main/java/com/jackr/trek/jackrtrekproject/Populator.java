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

        TrekType easy = new TrekType("Easy");
        TrekType moderate = new TrekType("Moderate");
        TrekType strenuous = new TrekType("Strenuous");
        TrekType difficult = new TrekType("Difficult");
        trekTypeRepo.save(easy);
        trekTypeRepo.save(moderate);
        trekTypeRepo.save(strenuous);
        trekTypeRepo.save(difficult);

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
        Region riverBasins = new Region("River Basins");
        Region coastalPlains = new Region("Coastal Plains");
        Region sahara = new Region("Sahara");
        Region sahel = new Region("Sahel");
        Region ethiopianHighlands = new Region("Ethiopian Highlands");
        Region savanna = new Region("Savanna");
        Region swahiliCoast = new Region("Swahili Coast");
        Region rainForest = new Region("Rain Forest");
        Region africanGreatLakes = new Region("African Great Lakes");
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

        //we will eventually include all the treks here
        Trek trek1 = new Trek("Sahara Desert Trek", difficult, africa, sahara, "Rediscover true " +
                "adventure in the awe-inspiring Sahara Desert. This eight day trek covers 100km passing through Morocco’s" +
                " forbidding landscape punctuated by peaks, gorges, dunes and oases.", true, "Climb " +
                "Jebel Lamrakeb for incredible views of the region. On day 5, camp lies at the bottom of the Bouzaine dunes, " +
                "home to some of the biggest dunes in the region and perfect for a photo or two.",
                "Camping with very basic facilities", "Foot", "Visit Saghro, a volcanic" +
                " massif before reaching Mecissi", "A minimum of  $1617.64 donated to your nominated charity",
                "8 days", "This trek is challenging, unforgiving, and life-changing. Prepare for very hot " +
                "days and cold nights. The terrain is rocky and sandy.");

        trekRepo.save(trek1);
    }
}