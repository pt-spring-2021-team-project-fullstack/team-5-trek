package com.jackr.trek.jackrtrekproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class JPAWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TrekTypeRepository trekTypeRepo;

    @Autowired
    private ContinentRepository continentRepo;

    @Autowired
    private RegionRepository regionRepo;

    @Autowired
    private TrekRepository trekRepo;


    @Test
    public void trekTypeShouldHaveAListOfTreks() {
        TrekType testTrekType = new TrekType("Test trekType");
        TrekType testTrekType2 = new TrekType("Test type2");
        Continent testContinent1 = new Continent("Test continentName");
        Region testRegion1 = new Region("Test regionName", testContinent1);
        Trek testTrek1 = new Trek("Name", testTrekType, testContinent1, testRegion1, "Description", true, "landmarks",
                "Campsite Info", "Transportation", "Nearby Activities", "Cost", "Length", "Reviews");
        Trek testTrek2 = new Trek("Name", testTrekType2, testContinent1, testRegion1, "Description", true, "landmarks",
                "Campsite Info", "Transportation", "Nearby Activities", "Cost", "Length", "Reviews");

        trekTypeRepo.save(testTrekType);
        trekTypeRepo.save(testTrekType2);
        continentRepo.save(testContinent1);
        regionRepo.save(testRegion1);
        trekRepo.save(testTrek1);
        trekRepo.save(testTrek2);

        entityManager.flush();
        entityManager.clear();

        Optional<TrekType> retrievedTrekTypeOpt = trekTypeRepo.findById(testTrekType.getId());
        TrekType retrievedTrekType = retrievedTrekTypeOpt.get();
        assertThat(retrievedTrekType.getTreks()).contains(testTrek1);
    }


}
