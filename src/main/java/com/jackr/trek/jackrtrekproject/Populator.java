package com.jackr.trek.jackrtrekproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ContinentRepository continentRepo;

    @Resource
    private RegionRepository regionRepo;

    @Override
    public void run(String... args) throws Exception {

        Continent northAmerica = new Continent("North America", 1L);
        Continent southAmerica = new Continent("South America", 2L);
        Continent africa = new Continent("Africa", 3L);
        Continent europe = new Continent("Europe",4L);
        Continent asia = new Continent("Asia", 5L);
        Continent australia = new Continent("Australia", 6L);
        Continent antarctica = new Continent("Antarctica", 7L);
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(africa);
        continentRepo.save(europe);
        continentRepo.save(asia);
        continentRepo.save(australia);
        continentRepo.save(antarctica);

        Region mountainousWest = new Region("Mountainous West", northAmerica, 1L);
        Region greatPlains = new Region("Great Plains", northAmerica, 1L);
        Region canadianShield = new Region("Canadian Shield", northAmerica, 1L);
        Region variedEasternRegion = new Region("Varied Eastern Region", northAmerica, 1L);
        Region caribbean = new Region("Caribbean", northAmerica, 1L);
        Region mountainsAndHighlands = new Region("Mountains and Highlands", southAmerica,2L);
        Region riverBasins = new Region("River Basins", southAmerica, 2L);
        Region coastalPlains = new Region("Coastal Plains", southAmerica,2L);
        Region sahara = new Region("Sahara", africa, 3L);
        Region sahel = new Region("Sahel", africa,3L);
        Region ethiopianHighlands = new Region("Ethiopian Highlands", africa,3L);
        Region savanna = new Region("Savanna", africa,3L);
        Region swahiliCoast = new Region("Swahili Coast", africa,3L);
        Region rainForest = new Region("Rain Forest", africa,3L);
        Region africanGreatLakes = new Region("African Great Lakes", africa,3L);
        Region southernAfrica = new Region("Southern Africa", africa,3L);
        Region westernUplands = new Region("Western Uplands", europe,4L);
        Region northEuropeanPlain = new Region("North European Plain", europe,4L);
        Region centralUplands = new Region("Central Uplands", europe,4L);
        Region alpineMountains = new Region("Alpine Mountains", europe,4L);
        Region mountainSystems = new Region("Mountain Systems", asia,5L);
        Region plateaus = new Region("Plateaus", asia,5L);
        Region plainsSteppesAndDeserts = new Region("Plains, Steppes, and Deserts", asia,5L);
        Region freshwaterEnvironments = new Region("Freshwater Environments", asia,5L);
        Region saltwaterEnvironments = new Region("Saltwater Environments", asia,5L);
        Region continentalIslands = new Region("Continental Islands", australia,6L);
        Region highIslands = new Region("High Islands", australia,6L);
        Region lowIslands = new Region("Low Islands", australia,6L);
        Region antarcticPeninsula = new Region("Antarctic Peninsula", antarctica,7L);
        Region eastAntarctica = new Region("East Antarctica", antarctica,7L);
        Region southPole = new Region("South Pole", antarctica,7L);
        Region westAntarctica = new Region("West Antarctica", antarctica,7L);
        Region rossSea = new Region("Ross Sea", antarctica,7L);

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